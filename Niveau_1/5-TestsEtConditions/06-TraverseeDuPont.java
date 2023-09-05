import algorea.Scanner;

class Main{
   static Scanner entrée = new Scanner(System.in);

   public static void main(String[] args){
   
      int premDé = entrée.nextInt();
      int deuxDé = entrée.nextInt();
      
      int calcul = premDé+deuxDé;
      
      if (calcul >=10){
         System.out.println("Taxe spéciale !");
         System.out.println(36);
      }
      else{
         System.out.println("Taxe régulière");
         System.out.println(2*calcul);
      }
   }
}
