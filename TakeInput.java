// import scanner class //
import java.util.*;

public class TakeInput {
    public static void main (String args[]) {
        try (// // take input //
        Scanner sc = new Scanner(System.in)) {
            ///////////////////////////////////////////////
            // take 2 variables and print their sum
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }

        // // for multi input
        // String nameMult = sc.nextLine();
        // // nextInt()
        // // nextFloat()

        // // print the input name
        // System.out.println(nameMult);


    }
}
