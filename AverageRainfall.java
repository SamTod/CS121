package weekFive;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of years: ");
        int years = console.nextInt();
        int rain = 0;
        for(int i=0;i<years;i++){
            for(int x=0;x<12;x++){
                System.out.printf("Enter number of inches for year %d month %d: ",i+1,x+1);
                rain = console.nextInt() + rain;

            }

        }
        System.out.println("");
        System.out.printf("Number of months: %d \n", years*12);
        System.out.printf("Total inches of rainfall: %d \n", rain);
        System.out.printf("Average rainfall per month for %d years is: %f \n",years,(float)rain/(years*12));
    }
}
