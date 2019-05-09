import java.util.Scanner;

public class Basic_A8 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] mynumbers = new int[10];

        for (int i = 0; i < mynumbers.length; i++){

            System.out.print("Enter the " + (i+1) + ") number: ");
            mynumbers[i] = input.nextInt();

        }

        for (int i = mynumbers.length-1; i >= 0; i--){

            System.out.print(mynumbers[i]);

        }
    }
}
