/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DistanceMultiple {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many point pairs do you want to calculate the distance of?\n");
        int nr = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < nr; i++) {
            int x1,x2,y1,y2;
            System.out.println("Enter your first point pair: ");
            String input = scan.nextLine();
            Scanner s = new Scanner(input);
            s.useDelimiter("[(),\\s]+");
            x1 = s.nextInt();
            y1 = s.nextInt();
            x2 = s.nextInt();
            y2 = s.nextInt();
            double d;

            System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));

        }

    }

}