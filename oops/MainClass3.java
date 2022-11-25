class Demo3{
    int x=10;
    int y=20;
    
}






class MainClass3 {
    public static void main(String[] args) {
        System.out.println("main started");
        // System.out.println(new Demo3().x);
        // System.out.println(new Demo3().y);
        // System.out.println( new Demo3());//print object
        // System.out.println(new Demo3());
        // Demo3 d1=new Demo3();
        // //object aadress is assigned to d1
        // Demo3 d2=new Demo3();
        // //object aadress is assigned to d2
        // System.out.println(d1);
        // System.out.println(d2);
        Demo3 d1=new Demo3();
        System.out.println("d1---> "+d1);
        d1.x=25;
        d1.y=35;
        d1=new Demo3();//re-initializing of refernce variable
        System.out.println("d1---> "+d1);
        System.out.println("x value is "+d1.x);
        System.out.println("y value is "+d1.y);
        System.out.println("main ended");

    
    }
    
}
