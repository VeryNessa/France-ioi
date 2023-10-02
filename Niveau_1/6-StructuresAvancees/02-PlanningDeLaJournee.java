/*Error : Fail test 15*/
import algorea.Scanner;

class Main {
   static Scanner entrée = new Scanner(System.in);
   public static void main(String[] args) {
      
      int position = entrée.nextInt();  
      int nbVillage = entrée.nextInt();
      int cmpt=0;
      
      for (int i     = 1; i <= nbVillage; i++){
         int posVillage = entrée.nextInt();
         
         if (posVillage <= (position+50)){
         
            if (posVillage>=(position-50)){
               cmpt=cmpt+1;
        
            }
         }
      } 
      System.out.print(cmpt);
   }
}
