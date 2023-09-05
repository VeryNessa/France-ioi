import algorea.Scanner;

class Main{
   static Scanner scanner = new Scanner (System.in);
   
   public static void main(String[] args){
   
      int nbjoursRando = scanner.nextInt();
      
      int incantation = 16*(60*60);
      
      System.out.print(nbjoursRando*incantation);
      
   }
}
