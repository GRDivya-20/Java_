class Demo3 {
    static int x=10;//static variable
    static void test()//static function
    {
        System.out.println("running test() method");
    }
    
}
class Demo4
{
    int y=30;
    void disp()
    {
        System.out.println("running disp() method");
    }
}
class mainclass3
{
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("x value is "+Demo3.x);
        Demo3.test();
        System.out.println("y value is "+new Demo4().y);
        new Demo4().disp();
        System.out.println("main ended");
    }
}

