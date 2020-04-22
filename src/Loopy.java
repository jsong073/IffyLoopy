import java.util.Scanner;

public class Loopy {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String fiveWords = "";

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a word (" + (i + 1) + "/5): ");
            fiveWords += input.nextLine() + " ";
        }
        System.out.println(fiveWords);
    }
}
