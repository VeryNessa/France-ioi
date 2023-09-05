import static algorea.Robot.*;
class Main {
   public static void main(String[] args) {
      
      for (int j = 0; j < 9; j ++){
         haut();
      }
      
      for (int i = 0; i < 4; i++){
         droite();
         
         for (int k = 0; k < 8; k++){
            bas();
         }
         
         droite();
         
         for (int j = 0; j < 8; j ++){
            haut();
         }
      }
      
      droite();
      
       for (int m = 0; m < 9; m++){
            bas();
         }
         
      
      for (int l = 0; l < 9; l++){
      gauche();
      }
   }
}
