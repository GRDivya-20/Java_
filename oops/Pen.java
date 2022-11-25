class pen{
    String brand;
    String color;
    double price;

}
class  MainClass2{
    public static void main(String[] args) {
        System.out.println("main started");
        pen p1=new pen();
        p1.brand="cello";
        p1.color="black";
        p1.price=20.00;
        System.out.println("brand: "+p1.brand+  " color: "+p1.color + " price: Rs "+p1.price);
        pen p2=new pen();
        p2.brand="renolds";
        p2.color="blue";
        p2.price=30.00;
        System.out.println("brand: "+p2.brand+  " color: "+p2.color + " price: Rs "+p2.price);
       
    }
    
}
