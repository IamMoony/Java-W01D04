public class Basic_A9 {

    public static void main (String[] args){

        double [] temperature ={8.1,2.3,12.2,1.3,3.1,0.8};

        double sum= 0;

        for (int i =0; i< temperature.length; i++){
            sum += temperature[i];
        }
        double average = sum/temperature.length;

        System.out.println(average);


        double minval = temperature[0];

        for (int i = 0; i < temperature.length; i++){

            if (temperature[i] < minval){
                minval = temperature[i];
            }
        }

        System.out.println(minval);


        double maxval = temperature[0];

        for (int i = 0; i < temperature.length; i++){

            if(maxval < temperature[i]){
                maxval = temperature[i];
            }
        }

        System.out.println(maxval);
        
    }
}
