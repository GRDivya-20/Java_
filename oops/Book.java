class Book {
    String brand;
    int pages;
    double price; 
    String size;

}
class MainClass{
    public static void main(String[] args) {
        System.out.println("main started");
        Book B1=new Book();
        B1.brand="classmate";
        B1.pages=100;
        B1.price=40.00;
        B1.size="long";
        System.out.println("brand: "+B1.brand+  " pages: "+B1.pages + " price: Rs "+B1.price+ " size: "+B1.size);
        Book B2=new Book();
        B2.brand="bafna";
        B2.pages=200;
        B2.price=50.00;
        B2.size="small";
        System.out.println("brand: "+B2.brand+  " pages: "+B2.pages + " price: Rs "+B2.price+ " size: "+B2.size);
    }
}
