import java.util.Scanner;

public class Main {

    private static int findGCD(int first_number, int second_number) {
        int gcd = 1;
        int k = 2;
        while (k<=first_number && k<=second_number){
            if(first_number%k == 0 && second_number % k == 0)
                gcd =k;
            k++;
        }
        return gcd;
    }

    private static int findGCD_2(int first_number, int second_number) {
        // division euclidien

        int a = Math.max( first_number,  second_number);
        int b = Math.min( first_number,  second_number);
        while (b !=0 ){
            int temp = b ;
            b = a%b;
            a = temp;
        }
        return a;
    }




    private static int findLCM(int first_number, int  second_number) {
        int a = first_number;
        int b = second_number;

        // division euclidien
        while (b !=0 ){
            int temp = b ;
            b = a%b;
            a = temp;
        }
//         int lcm = (first_number * second_number) / a;


        int lcm = (first_number * second_number) / findGCD(first_number,second_number);

    return lcm;

    }

    private static void showCarracters() {
        for(char c='A' ; c <= 'Z'; c++){
            if(c=='Z') System.out.println(c);
            else System.out.print(c + " - ");
        }
    }

    private static int countDigits(int first_number) {
//        int temp = first_number;
//        int res=0;
//        while(temp>0){
//            temp = temp/10;
//            res++;
//
//        }
//        return res;
        return ((Integer)first_number).toString().length();
//        return String.valueOf(first_number).length();
    }

    private static int reverse(int first_number) {
        int reverse = 0;
        int temp = first_number;

        while (temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        int first_number = sc.nextInt();
        System.out.println("enter the second number");
        int second_number = sc.nextInt();



        int gcd = findGCD(first_number, second_number);
        System.out.println(" the GCD of " + first_number + " and " + second_number + " is " + gcd);

        int gcd_2 = findGCD_2(first_number, second_number);
        System.out.println(" the GCD of " + first_number + " and " + second_number + " is " + gcd_2);

        int lcm = findLCM(first_number, second_number);         System.out.println(" the LCM of " + first_number + " and " + second_number + " is " + lcm);
//
        showCarracters();
        int count = countDigits(first_number);
        System.out.println("number of digist of " + first_number+ " is " + count);
//
//
//        int reverse = reverse(first_number);
//        System.out.println("the reverse of " + first_number+ " is " + reverse);

    }




}
