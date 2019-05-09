import java.util.Scanner;

public class Intermediate_A4 {

    public static void main (String[] args) {

        Scanner insert = new Scanner (System.in);

        System.out.println("Enter the number: ");
        int n = insert.nextInt();

        int b = 0;

        for(int i = 0; i <= n; i++){
           b += i;

        }

        System.out.println(b);

        }
    }

