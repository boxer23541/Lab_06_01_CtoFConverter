import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsius;
        double fahrenheit;
        String trash;

        System.out.println("Enter temperature in degrees Celsius: ");

        if (in.hasNextDouble())
        {
            celsius = in.nextDouble();
            in.nextLine();
            fahrenheit = celsius * 1.8 + 32;
            System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Rerun the program and enter a valid number");
            System.exit(0);
        }

    }
}
