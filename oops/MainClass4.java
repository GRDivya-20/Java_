class Demo5{
    int x=10;
    int y=20;
}
class MainClass4 {
    public static void main(String[] args) {
        System.out.println("main started");
        Demo5 d1=new Demo5();
        Demo5 d2=d1;
        System.out.println("x---> "+d1.x);
        System.out.println("y---> "+d1.y);
        d1.x=100;
        d1.y=200;
        System.out.println("x value d1 is "+d1.x);
        System.out.println("y value d1 is "+d1.y);

        System.out.println("x value d2 is "+d2.x);
        System.out.println("y value d2 is "+d2.y);
        System.out.println("y");
    }
    
}
