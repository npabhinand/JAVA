class Over{
   public int add(int x, int y){
      return x*y;
   }
   public int add(int x, int y,int z){
      return x+y+z;
   }
}
class Overloading{
   public static void main(String args[]){
      Over obj=new Over();
      int r1=obj.add(4,6,5);
      System.out.println(r1);
   }
}