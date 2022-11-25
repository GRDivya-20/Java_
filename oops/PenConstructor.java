class PenConstructor {
    String brand;
    String color;
    double price;

    PenConstructor(String arg1,String arg2,double arg3)
    {
      brand=arg1;
      color=arg2;
      price=arg3;

    }
     void details()
     {
        System.out.println("brand: "+brand+ " color: "+color+ " price: "+price);
     }
    
}
class Mainclass3{
    public static void main(String[] args) {
        System.out.println("main started");
        PenConstructor p1=new PenConstructor("cello","red", 25.00);
        p1.details();
        System.out.println("...............................................");
        PenConstructor p2=new PenConstructor("bright","black", 30.00);
        p2.details();


         System.out.println("main ended");
    }
}
