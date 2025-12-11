import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("donnez un mot :");
        String mot = sc.nextLine().toLowerCase();
        int[] result = new int[6];
        for(char c : mot.toCharArray()){
            switch(c){
                case 'a': result[0]++; break;
                case 'e': result[1]++; break;
                case 'i': result[2]++; break;
                case 'o': result[3]++; break;
                case 'u': result[4]++; break;
                case 'y': result[5]++; break;
            }
        }

        System.out.println("il comporte");
        String[] voyelles = {"a", "e", "i", "o" , "u" , "y"};
        for(int i = 0 ; i < 6; i++){
            System.out.println(result[i] + " fois la lettre "+ voyelles[i]);
        }
    }
        }
