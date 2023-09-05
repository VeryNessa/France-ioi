import algorea.Scanner;

class Main{

   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
   
      int nbKarva = entrée.nextInt();
      
      for (int i = 1; i <= nbKarva; i++){
         
         int poids = entrée.nextInt();
         int age = entrée.nextInt();
         int longueurCorne = entrée.nextInt();
         int hauteurGarrot = entrée.nextInt();
         
         int note = (longueurCorne*hauteurGarrot) + poids;
         
         System.out.println(note);
       }
   }
}
