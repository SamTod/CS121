package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppendsss {
    public static void main(String[] args) {
        try{
            FileWriter filewrite = new FileWriter("course.txt",true);
            PrintWriter output = new PrintWriter(filewrite);

            String course = JOptionPane.showInputDialog("Enter course name: ");
            String credits = JOptionPane.showInputDialog("Enter course credits: ");
            String score = JOptionPane.showInputDialog("Enter course score: ");
            output.printf("%s %s %s", course,credits,score);
            filewrite.close();
            output.close();
        }catch(FileNotFoundException e){
            System.err.println("error reading file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
