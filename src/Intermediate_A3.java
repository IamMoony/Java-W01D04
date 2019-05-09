import java.util.Scanner;

public class Intermediate_A3 {

    public static void main (String[] args) {

        Scanner insert = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int n = insert.nextInt();

        System.out.println("Enter the second number: ");
        int m = insert.nextInt();

        for (int i = n; i < m; i++){
            if (i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
