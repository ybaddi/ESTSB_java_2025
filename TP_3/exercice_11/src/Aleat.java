import java.util.Random;
public class Aleat {

    private int[] values;
    private int lim;

    public Aleat(int n,int lim ){
        this.lim=lim;
        this.values = new int[n];
        Random rand = new Random();
        for(int i=0; i< n; i++){
            values[i] = rand.nextInt(lim+1);
        }
    }

    public int getValue(int rang){
        if(rang >=0 && rang < values.length) return values[rang];
        return -1;
    }

    public int[] getValues(){
        int[] result = new int[values.length];
        for(int i=0; i< values.length; i++){
            result[i] = values[i];
        }
        return result;
    }


    public int[] histo(){
        int[] histo = new int[lim+1];
        for(int i=0; i< values.length; i++){
            histo[values[i]]++;
        }
        return histo;
    }

    public void display(){
        System.out.print("[");
        for(int i=0; i< values.length; i++){
            System.out.print(values[i]);
            if(i<values.length -1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Aleat a = new Aleat(20,5);
        a.display();

        System.out.println(a.getValue(30));

        int[] copie = a.getValues();
        System.out.print("[");
        for(int i=0; i< copie.length; i++){
            System.out.print(copie[i]);
            if(i<copie.length -1) System.out.print(", ");
        }
        System.out.println("]");

        int[] histo = a.histo();
        System.out.print("[");
        for(int i=0; i< histo.length; i++){
            System.out.print(histo[i]);
            if(i<histo.length -1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
