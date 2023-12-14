package weekFive;
// Oyekunle and Sammy
// Lab 1
import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is your limit for the month? ");
        int max = Integer.parseInt(console.nextLine());
        int num2  = 0;
        for(int i=1; i<=4; i++){
            System.out.println("How much did you spend this week? ");
            int num = Integer.parseInt(console.nextLine());
            num2 = num + num2;
            }
        if(max < 0){
            int o = max - num2;
            System.out.println("Total: " + max);
            System.out.println("monthly spent: " + num2);
            System.out.println("You have gone over budget by " + o);
        }
        if(max>0){
            int o = max - num2;
            System.out.println("Total: " + max);
            System.out.println("monthly spent: " + num2);
            System.out.println("You have stuck to your budget by " + o);
        }
        if(max == 0){
            System.out.println("Total: " + max);
            System.out.println("monthly spent: " + num2);
            System.out.println("You have budgeted perfectly");
        }
    }
}
