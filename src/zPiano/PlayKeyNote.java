package zPiano;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
 
/**
 * A modified utility class based off of CodeJava's Audio Playback Example that provides
 * access to piano key sounds for the application.
 * 
 * @author www.codejava.net
 * @author sashimimi, on 11/13/19
 * @version 1.0.0
 * @since November 13, 2019
 */

public class PlayKeyNote implements LineListener 
{
    private boolean playCompleted;
     
    public void play(String audioFilePath) 
    {
        File audioFile = new File(audioFilePath);
 
        try 
        {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.addLineListener(this);
            audioClip.open(audioStream);
            audioClip.start();
             
            while (!playCompleted) 
            {
                try 
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException ex) {}
            }
             
            audioClip.close();
             
        } 
        catch (UnsupportedAudioFileException ex) {} 
        catch (LineUnavailableException ex) {} 
        catch (IOException ex) {}
         
    }
     
    @Override
    public void update(LineEvent event) 
    {
        LineEvent.Type type = event.getType();
         
        if (type == LineEvent.Type.START) {} 
        else if (type == LineEvent.Type.STOP) 
        {
            playCompleted = true;
        }
 
    }

}