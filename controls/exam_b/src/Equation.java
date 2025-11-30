import java.util.Scanner;

public class Equation {
//    1. Ecrire un programme avec une classe Equation et une méthode static compute qui demande a l’utilisateur un
//nombre n et une puissance x et calcule la série suivant (Utiliser la boucle while) :
//Xn
//i=1
//((−1)(i+1) ∗ ix)
//2. Donner une deuxieme variante avec la boucle for.
//3. Ecrire la methode main pour tester les deux méthodes

    // youssef b'sibiss
    public static double  computeWhile(int n, int x){
        double result=0.0;
        int i =1;
        while(i <=n){
            result += Math.pow(-1,i+1) * Math.pow(i,x);
            i++;
        }
        return result;
    }

    public static double  computeFor(int n, int x){
        double result=0.0;

        for(int i=1; i <=n; i++){
            result += Math.pow(-1,i+1) * Math.pow(i,x);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la valeur de n");
        int n = sc.nextInt();
        System.out.println("Veuillez entrer la valeur de x");
        int x = sc.nextInt();

        System.out.println("la valeur avec la fonction compute avec while est : "+ computeWhile(n,x));
        System.out.println("la valeur avec la fonction compute avec for est : " + computeFor(n,x));
    }
}
