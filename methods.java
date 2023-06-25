class computer
    {
        public void ram()
        {
            System.out.println("Ram is 6GB");
        }
        public String rom(int x)
        {
            return "1 TB";
        }
    }
    class methods
    {
        public static void main(String args[]) 
            {
                int x=1;
                computer obj=new computer();
                // obj.ram();
                // String y=
                System.out.println(obj.rom(x));
            }
    }
   