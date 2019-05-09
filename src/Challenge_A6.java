import java.util.Scanner;

public class Challenge_A6 {

    public static void main(String[] args){

        int i,j,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = input.nextInt();


        for(i=1; i <= n; i++){
            for(j=1; j<=i; j++) {
                System.out.print(j);

            }
            System.out.println("");
        }

    }
}
