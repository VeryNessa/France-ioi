import static algorea.Robot.*;

class Main {
   public static void main(String[] args) {
      for (int i = 1; i <= 10; i++){
      
         for (int j = 0; j < i; j++){
            droite();
           
         }
         
         
         ramasser();
         
         
         for (int l = 0; l < i; l++){
            gauche();
            
         }
         
         deposer();
        
     } 
   }
}
