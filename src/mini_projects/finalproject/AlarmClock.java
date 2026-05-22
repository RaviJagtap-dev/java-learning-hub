package mini_projects.finalproject;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    public AlarmClock(LocalTime alarmTime){
        this.alarmTime=alarmTime;

    }
    @Override
    public void run() {


        while( LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);

                LocalTime currentTime = LocalTime.now();
                System.out.printf( "\rAlarm time: %02d:%02d:%02d",
                                     currentTime.getHour(),
                                     currentTime.getMinute(),
                                     currentTime.getSecond() );

            }catch(InterruptedException e){
                e.printStackTrace();
                System.out.println("Thread was interrupted");

            }

        }
        System.out.println("\n******** Alarm Noises ***************");
        String filePath="src\\audio.LdMHgSK9.wav.part";
        File file = new File(filePath);

        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)){
            Clip clip=AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            Thread.sleep(clip.getMicrosecondLength());
            System.exit(0);

        } catch (LineUnavailableException | UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
