public class Fatorial{

    public static void main (String args[]){
        int fatorial=1;
        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                fatorial=fatorial*j;
            }
            System.out.println(fatorial);
            fatorial=1;
        }
    }
}