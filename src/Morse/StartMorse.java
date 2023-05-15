package Morse;

import java.util.Scanner;

public class StartMorse {

    public static String sentence;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {

            sentence = scan.nextLine().toLowerCase();
            if(sentence.isEmpty()){
                System.out.println("Du skrev ingenting");
            }else{
                Logik logik = new Logik();
                System.out.println(logik.converterSB(sentence));
            }

        }
    }

}