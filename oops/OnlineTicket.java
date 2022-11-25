class OnlineTicket
{
    int no_of_tickets;
void Availableseats(){
System.out.println("available tickets is"+no_of_tickets);
}

void Booking(int n)
{
    System.out.println("booking "+n+"tickets");
    if(n<no_of_tickets){
        no_of_tickets=no_of_tickets-n;
        System.out.println("booking is success");
    }
    else{
        System.out.println("failed :booking seats unsufficient");
    }
}

void cancelling(int n){
    System.out.println("cancelling "+n+"tickets");
    no_of_tickets=no_of_tickets+n;
}
}

class Mainclassonlineticket{
    public static void main(String[] args) {
        System.out.println("main startred");
        OnlineTicket tc1=new OnlineTicket();
        tc1.no_of_tickets=100;
        System.out.println("no of seats"+tc1.no_of_tickets);
        tc1.Availableseats();
        tc1.Booking(10);
        tc1.Booking(20);
        tc1.cancelling(10);
        System.out.println("main ended");
    }
}


    


