public class Basic_A9 {


    public static void main (String[] args){

        double [] temperature ={1.1,2.3,2.2,1.3,3.1};

        double sum= 0;

        for (int i =0; i< temperature.length; i++){
            sum += temperature[i];
        }
        double average = sum/temperature.length;

        System.out.println(average);







    }
}
