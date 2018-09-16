import java.util.Scanner;

public class Yuh {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int upperRange = 100, lowerRange = 0, currentGuess = 50, numberToGuess = sc.nextInt();


        while(true)
        {
            if(currentGuess == numberToGuess)
            {
                System.out.println("Number found! Your number was: " + currentGuess);
                break;
            }

            else if(numberToGuess > currentGuess)
            {
                lowerRange = currentGuess;
                currentGuess += (upperRange - lowerRange) / 2;
            }

            else
            {
                upperRange = currentGuess;
                currentGuess -= (upperRange - lowerRange) / 2;
            }
            System.out.println(currentGuess);
        }
    }
}
