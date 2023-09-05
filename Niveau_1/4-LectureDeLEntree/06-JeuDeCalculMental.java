import algorea.Scanner;

class Main{

   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
   
      int nbNombres = entrée.nextInt();
      
      int calcul = 66;
      
      for (int i = 1; i <= nbNombres; i++){
      
      calcul =  calcul * i;
      
         System.out.println(calcul);
      }
      
   }
}
