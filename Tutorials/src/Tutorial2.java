import java.util.Scanner;
public class Tutorial2{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Your favorite number: ");
        if (userInput.hasNextInt()) {

            int numberEntered = userInput.nextInt();

            System.out.println("You entered" + numberEntered);

            int numEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numEnteredTimes2);


            int numberABS = Math.abs(numberEntered);
            int whichIsBigger = Math.max(5,7);

            double numSqrt = Math.sqrt(5.23);

        } else {
            System.out.println("Please entere a integer");

        }
    }
}

}

