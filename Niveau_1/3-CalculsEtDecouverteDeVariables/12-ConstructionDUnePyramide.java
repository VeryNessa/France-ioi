class Main{
   public static void main(String[] args){
      int nbcubes = 0;
      int i =17;
         for (i = 17; i >= 1; i=i-2){
            nbcubes = (i * i * i)+ nbcubes;
         }
      System.out.print(nbcubes);
   }
}
