package mini_projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AudioPlayer {

    public static void main(String[] args) {
        // **** How to play audio with java

            Scanner sc = new Scanner(System.in);
            String filePath="src\\audio.LdMHgSK9.wav.part";
            File file = new File(filePath);

            try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)){

                Clip clip=AudioSystem.getClip();
                clip.open(audioInputStream);
                System.out.println("No problems detected All good !");
                String response="";

                while(!response.equals("Q")){
                    System.out.println("P= play");
                    System.out.println("S= stop");
                    System.out.println("R= reset");
                    System.out.println("Q= quit");
                    System.out.print("Enter your choice :");
                    response=sc.nextLine().toUpperCase();

                    switch(response){
                        case "P" ->clip.start();
                        case "S" ->clip.stop();
                        case "R" ->clip.setMicrosecondPosition(0);
                        case "Q" ->clip.close();
                        default -> System.out.println("Wrong choice");

                    }

                }

            }
            catch (FileNotFoundException e) {
                System.out.println("Could not locate the file");
            }
            catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                throw new RuntimeException(e);
            }
            catch (InputMismatchException e){
                System.out.println("Invalid file path");
                sc.nextLine();
            } finally {
                System.out.println("Closing Clip,, bye bye");
                sc.close();
            }

    }
}
