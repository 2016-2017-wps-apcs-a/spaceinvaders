/*
 * Utilities.java
 */
package spaceinvaders; 

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
import org.apache.logging.log4j.*;

/** DESCRIBE {@link Utilities} HERE.
 * 
 * @author 2016-2017 APCS A-Block
 */
public class Utilities {
    //////////////////////////////// FIELDS ////////////////////////////////

    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    //////////////////////////////// METHODS ///////////////////////////////

    /**
     * Read all file paths from directory and return them as a {@link java.util.List}.
     * Precondition: directory is not null, not empty, and must start with '/'.
     *
     * @param directory directory within resources directory
     * @return {@link Path} to directory within resources directory.
     * @see <a href="https://stackoverflow.com/questions/1429172/how-do-i-list-the-files-inside-a-jar-file/39974405#39974405" target="_blank">https://stackoverflow.com/questions/1429172/</a>
     */
    public static Path getResourcePath(String directory) {
        assert directory != null && directory.length() > 0 && directory.charAt(0) == '/'
            : String.format("\"%s\" is null, or empty, or doesn't start with '/'", directory);
        Path path = Paths.get(directory);
        try {
            URI uri = Utilities.class.getResource(directory).toURI();
            path = Paths.get(uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            System.exit(5); // I/O error
        }
        LogManager.getLogger(SpaceInvaders.SHORT)
            .info("getResourcePath(\"{}\") = \"{}\"", directory, path);
        return path;
    }

    /**
     * Read all file paths from directory and return them as a {@link java.util.List}.
     * Precondition: directory is not null, not empty, and must start with '/'.
     *
     * @param directory directory within resources directory
     * @return {@link java.util.List} of {@link Path}s.
     * @see <a href="https://stackoverflow.com/questions/1429172/how-do-i-list-the-files-inside-a-jar-file/39974405#39974405" target="_blank">https://stackoverflow.com/questions/1429172/</a>
     */
    public static java.util.List<Path> getResourcePaths(String directory) {
        assert directory != null && directory.length() > 0 && directory.charAt(0) == '/'
            : String.format("\"%s\" is null, or empty, or doesn't start with '/'", directory);
        final java.util.List<Path> paths = new ArrayList<Path>();
        try {
            URI uri = Utilities.class.getResource(directory).toURI();
            try (FileSystem fileSystem = (uri.getScheme().equals("jar") ? FileSystems.newFileSystem(uri, Collections.<String, Object>emptyMap()) : null)) {
                Path path = Paths.get(uri);
                Files.walkFileTree(path, new SimpleFileVisitor<Path>() { 
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        paths.add(file);
                        return FileVisitResult.CONTINUE;
                    }
                });
            }
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            System.exit(5); // I/O error
        }
        LogManager.getLogger(SpaceInvaders.SHORT)
            .info("getPaths(\"{}\") = {} ({} file(s))", directory, paths, paths.size());
        return paths;
    }
}