
/*
La classe Professeur possède aussi cinq méthodes publiques :
• Un getter pour la moyenne du professeur c’est-à-dire une méthode d’en-tête
public double getMoyenne()
renvoie la valeur de l’attribut moyenne ;
• Un getter pour le nom du professeur c’est-à-dire une méthode d’en-tête
public String getNom()
renvoie le nom du professeur ;
• Un getter pour la liste des cours d’un professeur c’est-à-dire une méthode d’en-tête
public String[] getListeCours() renvoie la liste des cours d’un professeur ;
• La méthode d’en-tête
public void ajouterCours(String cours)
ajoute le cours reçue en paramètre à listeCours ; la méthode actualise en conséquence l’attribut moyenne
• La méthode d’en-tête
public String toString()
qui retourne une description du professeur considéré (par exemple : "Youssef (12.25)").
Bon courage !!!
 */
public class Eleve {
    private String nom;
    private double[] listeNotes;
    private double moyenne;
    private int nombrNotes;

    Eleve(String nom){
        this.nom = nom;
        this.listeNotes = new double[10];
        moyenne = 0.0;
        nombrNotes=0;
    }

    public double getMoyenne(){
        return moyenne;
    }

    public String getNom(){
        return nom;
    }

    public double[] getlisteNotes(){
        return listeNotes;
    }

    public void ajouterNote(double note){
        if(listeNotes.length<10) {
            // listeCours[listeCours.length+1]=cours;
            listeNotes[nombrNotes] = note;
            nombrNotes++;
            // calcule la moyenne
            calculeMoyenne();
        }
    }

    public void calculeMoyenne(){
        if(nombrNotes == 0) { // listeCours.length ==0
            moyenne = 0.0;
        }else{
            double somme = 0.0;
            for(double item : listeNotes)
                somme+=item;
           moyenne = somme / nombrNotes;
        }
    }
    public String toString(){
        return nom + " (" + moyenne +")";
    }
}
