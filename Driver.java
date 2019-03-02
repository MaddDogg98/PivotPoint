//import scanner
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        //declare variables
        int[] numbers = new int[5];
        int n = numbers.length;
        int find;
        int endLoop = 0;
        Scanner key = new Scanner(System.in);

        //while loop to add numbers to the array
        for (int i = 0; i < numbers.length; i++)
        {
            //prompt user to enter 5 numebers into the array
            System.out.print("Please enter " + numbers.length + " numbers in order: ");
            numbers[i] = key.nextInt();
        }

        //assign the last number in the array to find
        find = numbers[numbers.length - 1];

        //print out the array
        System.out.print("[ ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("}");

        //find the pivot number
        System.out.println("The pivot point index is: " + PivotPoint.pivotedBinSearch(numbers, n, find));
    }
}
