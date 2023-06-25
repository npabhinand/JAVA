

public class Array {
    public static void main(String a[]){
        int nums [][]=new int[3][4];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
            }
        }
       for (int n[]:nums)
       {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
       }


      int arr[][]=new int[3][];
      arr[0]=new int[3];
      arr[1]=new int[6];
      arr[2]=new int[4];
    for(int i=0;i<arr.length;i++)
    {
        for (int j=0;j<arr[i].length;j++)
        {
            arr[i][j]=(int)(Math.random()*100);
        }
    }
    for (int n[]:arr)
    {
        for(int m:n)
        {
            System.out.print(m+" ");
        }
        System.out.println();
    }

        

    }
    
    
}
