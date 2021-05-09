package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String words="";
        Scanner scan=new Scanner(System.in);
        try {
            FileWriter file = new FileWriter("/home/mostafa/Desktop/output");
            BufferedWriter buff = new BufferedWriter(file);
            while(!words.equals("stop")) {
                System.out.println("Enter Data:");
                words = scan.nextLine();
                buff.write(words+"\n");
                System.out.println("You Entered: " + words);
            }
            buff.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }



      }
}
