import algorea.Scanner;

class Main{

   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
      
         int supChampAr = entrée.nextInt();
         int supChampEv = entrée.nextInt();
         
         int calcul = 0;
         
         if (supChampAr > supChampEv){
         
            calcul = supChampAr-supChampEv;
            
            if (calcul <= 10){
            
               }
               else {
               System.out.println("La famille Arignon a un champ trop grand");
               }
            }
         
         else{
            calcul = supChampEv-supChampAr;
            
            if(calcul <= 10){
            }
            else{
                  System.out.println("La famille Evaran a un champ trop grand");
            }
         }
     }
  } 
