import algorea.Scanner;

class Main{

   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){

      int positionDepart = entrée.nextInt();
      int largeurEmplacement = entrée.nextInt();
      int nbVendeurs = entrée.nextInt();
      
      int calcul = positionDepart;
      
      System.out.println(calcul);
      for (int i = 1; i<=nbVendeurs; i++){
         
         calcul = calcul + largeurEmplacement;
         
         System.out.println(calcul);
         
      }
   }
}
