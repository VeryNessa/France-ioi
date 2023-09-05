import algorea.Scanner;

class Main{

   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
   
      int nbPaquets = entrée.nextInt();
      int poidsPaquet = entrée.nextInt();
      
      int poids= nbPaquets*poidsPaquet;
      
      if (poids > 105){
         System.out.println("Surcharge !");
         }
         
    }
}
