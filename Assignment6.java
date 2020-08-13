package patyminheritance;

class Payment
{
    int number1;
    int bill;

    public Payment() 
    {
        
    }
    public Payment(int number1,int bill) 
    {
        this.number1=number1;
        this.bill=bill;
    }
    void show()
    {
        System.out.println("Amount of"+bill+" paid to "+number1);
    }
    
}
class MobileBill extends Payment
{
    String operator1;
    public MobileBill(int number1,int bill,String operator1) 
    {
        super(number1,bill);
        this.operator1=operator1;
    }
    void show()
    {
        System.out.println("Recharge of "+bill+" is done against number "+number1+" and "+operator1+" would thank you for choosing us!!!");
    }
}

class DishCable extends MobileBill
{
    int subscriptionID;
    public DishCable(int number1,int bill,String operator2,int subscriptionID) 
    {
        super(number1,bill,operator2);
        this.subscriptionID=subscriptionID;
    }
    void show()
    {
        System.out.println("Recharge of "+bill+" is successful against registered number "+number1+" and subscription ID "+subscriptionID);
    }
}
public class PatymInheritance 
{

    public static void main(String[] args) 
    {
        Payment pym=new Payment(989898989,500);
        MobileBill mb=new MobileBill(987654321,598,"Airtel");
        DishCable dc=new DishCable(123456789,2400,"TataSky",888899999);
        pym.show();
        mb.show();
        dc.show();
    }
    
}
