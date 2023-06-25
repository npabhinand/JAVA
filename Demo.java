class Calculator{
    public  int add(int num1,int num2){
        int r=num1+num2;
        return r;
    }
}


public class Demo {
    public static void main(String args[]) {
        int x=4 ,y=9;
        Calculator calc=new Calculator();
        int result=calc.add(x,y);
        System.out.println(result);
        
    }
    
}
 