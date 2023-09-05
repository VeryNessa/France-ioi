import algorea.Scanner;

class Main{
   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
   
      int hArrivée = entrée.nextInt();
      int prixMidi = 10;
      
      for (int i = 1; i <= hArrivée; i++){
      
      prixMidi += 5;
       }
         if (prixMidi > 53){
      
            System.out.println(53);
         }
         else {
            System.out.println(prixMidi);
         }
     }
 } 
