import algorea.Scanner;

class Main{
   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
   
      int codeSecret = entrée.nextInt();
      
      int bonCode = 64741;
      
      if (codeSecret > bonCode){
      
         System.out.print("Allez-vous en !");
      }
      else if (codeSecret < bonCode){
      
         System.out.print("Allez-vous en !");
      }
      else{
      System.out.print("Bon festin !");
   }
  }
}
