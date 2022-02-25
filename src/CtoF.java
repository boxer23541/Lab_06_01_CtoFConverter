import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsius;
        double fahrenheit;
        boolean validInput = false;
        String trash;

        System.out.println("Enter temperature in degrees Celsius: ");

        do
        {
            if (in.hasNextDouble()) {
                validInput = true;
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = celsius * 1.8 + 32;
                System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
            } else {
                trash = in.nextLine();
                System.out.println("You entered \"" + trash + "\"");
                System.out.println("Please enter a valid number");
            }
        }while(!validInput);
    }
}
