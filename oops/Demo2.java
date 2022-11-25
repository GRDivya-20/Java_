class Demo2 
{
      int y=25;//non-static variable
     void disp()//non-static function
    {
         
        System.out.println("running disp() method");
    }
    
}
class mainclass2
{
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("y value is "+new Demo2().y);
        new Demo2().disp();
        
        System.out.println("main ended");
    }
}
    

