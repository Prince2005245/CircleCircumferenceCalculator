package GitHub_Work.CircleCircumferenceCalculator;
import java.util.Scanner;

public class CircCircumCalc {
    public static void main(String[] args) {
        int a = 2;
        int b = (int) 3.1415;
        int radius;
        int cf;
        System.out.println("Hello this program will calculate the Circumferance of a cirlce with the help of you giving me the radius. ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius: ");
        radius = input.nextInt();
        input.close();

        cf = a * b * radius;
         
        System.out.println("The circumference of the circle is " + cf);
    }
    
}
