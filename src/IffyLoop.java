import java.util.Scanner;

public class IffyLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean redEyes = false;
        boolean endLoop = false;
        String response = "";

        while (endLoop == false) {
            System.out.println("Are your eyes red? ");
            response = input.nextLine();
            //the following if statement changes redEyes depending on the user's response
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                redEyes = true;
            } else {
                redEyes = false;
            }
            //the following if statement prints out different Strings depending on redEyes being true or false
            if (redEyes == true) {
                System.out.println("Go get some sleep.");
            } else {
                System.out.println("You look great.");
            }
            System.out.print("Do you want to try again? ");
            response = input.nextLine();
            //When user enters yes or y, endLoop will be true and the loop will end
            if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                endLoop = true;
            }
        }

        System.out.println("Goodbye.");
        input.close();
    }
}
