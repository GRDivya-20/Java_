class EmployeeConstructor {
    String name;
    int phno;
    double sal;
    String role;

    EmployeeConstructor(String arg1,int arg2,double arg3,String arg4)
    {
      name=arg1;
      phno=arg2;
      sal=arg3;
      role=arg4;

    }
     void details()
     {
        System.out.println("Name: "+name+ " Phonenumber: "+phno+ " Salary: "+sal+ " role: "+role);
     }
    
}
class Mainclass3{
    public static void main(String[] args) {
        System.out.println("main started");
        EmployeeConstructor e1=new EmployeeConstructor("keshav",99765412, 25000,"java trainer");
        e1.details();
        System.out.println("...............................................");
        EmployeeConstructor e2=new EmployeeConstructor("manoj",998765433, 3000,"sql trainer");
        e2.details();


         System.out.println("main ended");
    }
}

    

