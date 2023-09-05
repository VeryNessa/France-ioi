import algorea.Scanner;

class Main{
   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
      int borneDepart = entrée.nextInt();
      int borneArrivée = entrée.nextInt();
      
      if (borneDepart < borneArrivée){
         System.out.println(borneArrivée-borneDepart);
         }
       else {
       System.out.println(borneDepart-borneArrivée);
       }
   }
}
