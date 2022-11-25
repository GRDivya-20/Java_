class Demo1 
{
    static int x=10;//static variable
    static void test()//static function
    {
        System.out.println("running test() method");
    }
    
}
class mainclass1
{
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("x value is "+Demo1.x);
        Demo1.test();
        System.out.println("main ended");
    }
}
