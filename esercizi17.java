
import java.util.Scanner;

public class esercizi17 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // \n per andare a capo
        System.out.println("E'obbligatorio regolare la velocità in caso di nebbia o foschia e cos'altro bisogna fare? (risposta da 1 a 4\n");
        System.out.println("risposta 1: no bisogna accelerare e accendere i fari");
        System.out.println("risposta 2: si bisogna decellerare, aumentare la distanza di sicurezza e accendere i fari e i fendinebbia");
        System.out.println("risposta 3: bisogna prestare la massima attenzione, , aumentare la distanza di sicurezza e accendere gli abbaglianti");
        System.out.println("risposta 4: bisogna accendere gli abbaglianti, attaccarsi alle macchine e driftare ad ogni curva");
    


            switch (prendiUnInt(scanner, 4)) {
                case 1:
                    System.out.println("sbagliato, riprova sarai più fortunato");
                    break;
                case 2:
                    System.out.println("risposta esattaa!!");
                    break;
                case 3:
                    System.out.println("eh, eh, ci sei quasi");
                    break;
                case 4:
                    System.out.println("sbagliato, see ciao Toretto");
                    break;


                
        
                default: 
                    System.out.println("default");
                    break;

        }



        System.out.println("E' obbligatorio regolare la velocità nei dossi e nelle curve? (risposta da 1 a 4)\n");
        System.out.println("risposta 1: si bisogna prestare la massima attenzione, e regolare la velocità nelle curve");
        System.out.println("risposta 2: bisogna affondare il piede sul gas e prendere a tutta velocità dossi e tornanti");
        System.out.println("risposta 3: no bisogna accelerare solo nelle curve");
        System.out.println("risposta 4: si bisogna avere una velocità moderata e decellerare se serve nelle curve");
    


            switch (prendiUnInt(scanner, 4)) {
                case 1:
                    System.out.println("eh, eh, ci sei quasi");
                    break;
                case 2:
                    System.out.println("we tokyio drift, non stai mica in fausto e furio");
                    break;
                case 3:
                    System.out.println("sbagliato, riprova sarai più fortunato ");
                    break;
                case 4:
                    System.out.println("risposta esattaa!!");
                    break;


                
        
                default: 
                    System.out.println("default");
                    break;
                
        }
        
            

        
        
    }


    public static int prendiUnInt (Scanner scan, int NumeroMassimo) {

        System.out.println("digita un numero");
        try {
            int n = scan.nextInt();
            if (n<= NumeroMassimo) {
                return n;
            } else {
            scan.nextLine();
                return prendiUnInt(scan, NumeroMassimo);
            }
        } catch (Exception e) {
            scan.nextLine();
            return prendiUnInt(scan, NumeroMassimo);
        } finally {
            System.out.println("controllo eseguito");
        }

    }

}