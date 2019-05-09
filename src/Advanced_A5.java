import java.util.Scanner;

public class Advanced_A5 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to search in the array: ");
        int n = input.nextInt();

        int[] array = {5, 2, 7, 9, 3, 5, 8, 1, 5, 2, 4, 5};

        int score = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                score++;
            }
        }
        /*
        for(int numbers : array){
            if(numbers == n){
                score++;
            }
        }
        */
        System.out.println("The number exists " + score + " times in this array!");
    }
}