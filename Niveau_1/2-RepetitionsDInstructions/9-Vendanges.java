/*Error*/

import static algorea.Robot.*;
class Main {
   public static void main(String[] args) {
     
     for (int i = 0; i < 20; i++){
       
        ramasser();
       
        
        
       for (int j = 0; j < 15; j++){
           droite();
        }
        
        deposer();
        
        for (int k = 0; k < 15; k++){
           gauche();
        }
     }   
   }
}
