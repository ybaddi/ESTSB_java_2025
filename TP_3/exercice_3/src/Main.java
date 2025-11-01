import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] values= new float[5];

        for(int i =0; i< 5; i++){
            System.out.println("Enter the value of index " + i);
            values[i] = sc.nextFloat();
        }

        float sum = 0;
        for(int i =0; i< 5; i++){
            sum += values[i] ;
        }

        float average = sum/5;

        float min = values[0];
        float max = values[0];

        for(int i =0; i< 5; i++){
            if(values[i] > max){
                max = values[i];
            }
            if(values[i] < min){
                min = values[i];
            }
        }

        System.out.println("la moyenne est  "+average);
        System.out.println("le plus petit est  "+min);
        System.out.println("le plus grand est  "+max);



    }
}
