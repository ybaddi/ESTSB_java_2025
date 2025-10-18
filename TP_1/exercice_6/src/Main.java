import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter the number between 0 and 1000");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        /*
        int temp = x;
        while (temp>0){
            int rest = temp%10;
            sum += rest ;
            temp =temp/10;
        }
        */
        // String str = ((Integer)x).toString();
        String str =  String.valueOf(x);
        for(int i =0; i< str.length(); i++){
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println("the sum  degits of " + x + " is " + sum);

    }
}
