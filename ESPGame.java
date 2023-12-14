package weekFive;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         Random rand = new Random();
         int correct = 0;
         for(int i=0;i<10;i++){
             String color = "";
             int nums = rand.nextInt(5);
             switch(nums){
                 case 0:
                     color = "red";
                     break;
                 case 1:
                     color = "green";
                     break;
                 case 2:
                     color = "blue";
                     break;
                 case 3:
                     color = "orange";
                     break;
                 case 4:
                     color = "yellow";
                     break;
             }
             System.out.printf("%d: What color has the computer chosen? \n",i+1);
             String guess = console.nextLine();
             System.out.println("The computer chose " +color);
             if (guess.equals(color)){
                 correct++;
             }



         }
        System.out.println("You got "+correct+" right");






    }
}
