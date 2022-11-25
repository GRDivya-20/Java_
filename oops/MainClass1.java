class Demo1{
    int x=10;
    void test()
    {
        System.out.println("running test() method");
    }

} 
 
 class MainClass1 {
    public static void main(String[] args) {
        System.out.println("main method started");
        //declare non-primitive or Reference
        Demo1 d1;
        //initializing reference variable
        d1=new Demo1();
        //assigning object  to d1
        //or
        //d1 is a name to object
        System.out.println("x value is "+d1.x);
        d1.test();
        System.out.println("modifying x value");
        d1.x=20;
        System.out.println("x value is "+d1.x);

    }
    
}
