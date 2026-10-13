package metodusgyakorlas;

public class MetodusGyakorlas {

    public static void main(String[] args) {
        koszon();
        szamol();
        nagyobbVagyKisebb();
        osztalyzatErtekelo();
        eredmenyErtekelo();
        
    } 
    private static void koszon() {
        System.out.println("Szia!");
    }

    private static void szamol() {
        int a = 2;
        int b = 3;
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    private static void nagyobbVagyKisebb() {
        int a = 5;
        int b = 3;
        if (a > b) {
            System.out.println("a nagyobb mint b ");
        } else {
            System.out.println("b nagyobb mint a ");
        }
    }

    private static void osztalyzatErtekelo() {
         int jegy = 1;
        System.out.print("A matekjegyed (");
        System.out.print(jegy +") ");
        if (jegy == 1) {
            System.out.println("Elégtelen");
        } else if (jegy == 2) {
            System.out.println("Elégséges");
        } else if (jegy == 3) {
            System.out.println("Közepes");
        } else if (jegy == 4) {
            System.out.println("Jó");
        } else if (jegy == 5) {
            System.out.println("Jeles");
        }
    }
    
    private static void eredmenyErtekelo(){
        int eredmeny = 30;
        System.out.print(eredmeny);
        System.out.println("%-ot értél el" +  " Jegyed:");
        if (eredmeny <= 50){
             System.out.println("1");
        }
        else if (eredmeny <= 60){
             System.out.println("2");
        }
        else if (eredmeny <= 70){
             System.out.println("3");
        }
        else if (eredmeny <=80){
             System.out.println("4");
        }
        else if (eredmeny <= 100){
             System.out.println("5");
        }
    }
    }

