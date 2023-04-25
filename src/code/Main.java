package code;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Main {
    static File file;
    static Clip clip;
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {


        file=new File("src/Music/Relax Music - Nicmusic -009.wav");
        AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(file);
        clip=AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
        LOADING loading =new LOADING();
        loading.iterate();
    }
}
