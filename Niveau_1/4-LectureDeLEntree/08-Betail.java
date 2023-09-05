import algorea.Scanner;

class Main{
   static Scanner entrée = new Scanner(System.in);
   
   public static void main(String[] args){
   
   int fermier;
   int nbVakars=0;
   
      for (int i = 1; i <= 20; i++){
      
       fermier = entrée.nextInt();
      
       nbVakars += fermier;
      }
      
      System.out.println(nbVakars);
      
      }
      }
