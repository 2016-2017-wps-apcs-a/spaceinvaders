/*
 * SoundFX.java
 */
package spaceinvaders; 

import java.io.*; 
import javax.sound.sampled.*;
import javax.sound.sampled.DataLine.*;
import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;

/**
 * Describe the SoundFX class...
 *
 * @author 2016-2017 APCS A-Block
 * @author Jennifer Kim
 * @author Brandon Zhang
 */
public class SoundFX
{
    private String filePath;
    
    public SoundFX(String filePath)
    {
        this.filePath = filePath;
    }

    // https://odoepner.wordpress.com/2013/07/19/play-mp3-or-ogg-using-javax-sound-sampled-mp3spi-vorbisspi/
    public void play() {
        ClassLoader classLoader = getClass().getClassLoader();
        final File file = new File(classLoader.getResource(filePath).getFile());
        
        try (final AudioInputStream in = getAudioInputStream(file)) {
            
            final AudioFormat outFormat = getOutFormat(in.getFormat());
            final Info info = new Info(SourceDataLine.class, outFormat);
            
            try (final SourceDataLine line =
                 (SourceDataLine) AudioSystem.getLine(info)) {
                
                if (line != null) {
                    line.open(outFormat);
                    line.start();
                    stream(getAudioInputStream(outFormat, in), line);
                    line.drain();
                    line.stop();
                }
            }
            
        } catch (UnsupportedAudioFileException 
                     | LineUnavailableException 
                     | IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private AudioFormat getOutFormat(AudioFormat inFormat) {
        final int ch = inFormat.getChannels();
        final float rate = inFormat.getSampleRate();
        return new AudioFormat(PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
    }

    private void stream(AudioInputStream in, SourceDataLine line) 
        throws IOException {
        final byte[] buffer = new byte[65536];
        for (int n = 0; n != -1; n = in.read(buffer, 0, buffer.length)) {
            line.write(buffer, 0, n);
        }
    }
}