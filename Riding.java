class Parent{
   public int add(int x, int y){
    return x+y;
   }
}
class Child extends Parent{
    public int add(int x,int y){
        return x+y+1;
    }

}

public class Riding {
    public static void main(String args[]){
    Child obj=new Child();
    int r1 = obj.add(4,6);
    System.out.println(r1); 
}
}
