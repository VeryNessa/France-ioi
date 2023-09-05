import algorea.Scanner;

class Main{

   static Scanner entrée = new Scanner (System.in);
   
   public static void main(String[] args){
   
      int nbMembres = entrée.nextInt();
      
      int premEquip = 0;
      int deuxEquip = 0;
      
      for (int i = 1; i <= nbMembres; i++){
         
         premEquip += entrée.nextInt();
         deuxEquip += entrée.nextInt();
         
      }
      
      if (premEquip > deuxEquip){
      
          System.out.println("L'équipe 1 a un avantage");
          System.out.println("Poids total pour l'équipe 1 : " + premEquip);
           System.out.println("Poids total pour l'équipe 2 : " + deuxEquip);
          
       }
       else{
           System.out.println("L'équipe 2 a un avantage");
          System.out.println("Poids total pour l'équipe 1 : " + premEquip);
           System.out.println("Poids total pour l'équipe 2 : " + deuxEquip);
       }
    }
 }
