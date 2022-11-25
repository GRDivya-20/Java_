class Program1
{
    static int x=100;
    static void test()
    {
        System.out.println("running test() function");
        System.out.println("x value is " +x);
        x=200;
    }
    public static void main(String[] args) {
        System.out.println("main started");
        test();
        System.out.println("main ended");
    }
}