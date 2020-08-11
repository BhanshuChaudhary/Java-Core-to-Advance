package shiftoperators;

public class ShiftOperators 
{
    public static void main(String[] args) 
    {
        //Right Shift >>
        int a=16;
        int b=a>>4;//divide the number by 2 power shift
        System.out.println("Right shift operator "+b);
        
        //Left Shift <<
        int c=16;
        int d=c<<5;//multiply the number by 2 power shift
        System.out.println("Right shift operator "+d);
        
        //Right Shift >> with negative numbers
        int a1=-16;
        int b1=a1>>3;
        System.out.println("Right shift operator "+b1);
        
        //Left Shift << with negative numbers
        int c1=-16;
        int d1=c1<<5;
        System.out.println("Right shift operator "+d1);
        
        
        //Unsigned Right shift >>>
        int a2=16;
        int b2=a2>>>2;
        System.out.println("Unsigned Right shift operator "+b2);
        
        //Unsigned Right Shift >>> with negative numbers
        int a3=-16;
        int b3=a3>>>30;
        System.out.println("Right shift operator "+b3);
    }
    
}
