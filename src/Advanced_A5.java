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

        //Simon
        int[] num ={1, 2, 2, 3, 4, 5, 41, 23, 22, 44, 55, 67};

        Scanner insert = new Scanner (System.in);

        System.out.println("Enter the number you want to find: ");
        int toFind = insert.nextInt();
        boolean found = false;
        int score2 = 0;

        for(int i=0; i<num.length; i++) {
            if(num[i] == toFind) {
                found = true;
                score2++;
            }
        }
        if(found){
            System.out.println("Your number was found " + score2 + " times");
        } else {
            System.out.println("Your number was not found");
    }



}