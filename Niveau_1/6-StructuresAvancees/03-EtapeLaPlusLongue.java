import algorea.Scanner;

class Main{
   static Scanner scanner = new Scanner (System.in);
   public static void main(String[] args){
   
      int distMax = 0;
      int comp = 0;
      int joursMarche = scanner.nextInt();
      
      
      for(int i = 0; i <joursMarche; i++){
         
        comp = scanner.nextInt();
        
        if (comp > distMax){
        
           distMax = comp;
        }
     }
     System.out.println(distMax);
  }
}
