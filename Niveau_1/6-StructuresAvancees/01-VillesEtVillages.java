/*Error : Fail test 10*/

import algorea.Scanner;

class Main {
   static Scanner entrée = new Scanner(System.in);

   public static void main(String[] args) {

      int nbLieux = entrée.nextInt();
      
      int cpt = 0;
      
      for (int i = 1; i <= nbLieux; i++){
          
          if (entrée.nextInt()> 10000){
             cpt += 1;
          }
       }
       System.out.print(cpt);
   }
}
