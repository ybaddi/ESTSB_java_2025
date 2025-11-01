import java.util.Scanner;

public class CarreImpairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de valeur: ");
        int number_of_value = sc.nextInt();

        int[] carreTab = new int[number_of_value];

        for(int i=0; i<number_of_value; i++ ){
            int impaire = 2*i + 1;
            int carre = impaire * impaire;
            carreTab[i] = carre;
            System.out.println(impaire + " a pour carre " + carre);


        }
    }
}
