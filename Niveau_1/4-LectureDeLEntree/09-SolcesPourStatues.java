import algorea.Scanner;

class Main{
   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
   
      int socleSol = entrée.nextInt();
      
      int socleSup = entrée.nextInt();
      
      int calcul = 0;
      
      for (int i = socleSol; i >= socleSup; i=i-1){
      
         calcul = (i * i) + calcul;
         
      }
      
      System.out.print(calcul);
   }
}
