import algorea.Scanner;

class Main{
  static Scanner scanner = new Scanner (System.in);
   
   public static void main(String[] args){
      
     int longueurChamp = scanner.nextInt();
      
     int aireChamp = longueurChamp * longueurChamp;
      
      System.out.print(aireChamp*23);
      
   }
}
