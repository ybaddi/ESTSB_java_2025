import java.util.Scanner;

public class UtilTab {



    public static double sum(double[] tab){
        double sum = 0;

        for(int i=0; i< tab.length; i++){
            sum += tab[i];
        }
        return sum;
    }

    public static void inc(double[] tab, double value){

        for(int i=0; i< tab.length; i++){
            tab[i] += value;
        }

    }

    public static void display(double[] tab){
        System.out.print("[");
        for(int i=0; i< tab.length; i++){
            System.out.print(tab[i]);
            if(i<tab.length -1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        double[] tab = {1.5,2.3,4.5,6.0, 7.5, 8.9};

        display(tab);

        // sum
        double sum = UtilTab.sum(tab);
        System.out.printf("sum is %.3f \n" , sum);

        // incr
        display(tab);
        UtilTab.inc(tab,2);
        display(tab);

    }



}