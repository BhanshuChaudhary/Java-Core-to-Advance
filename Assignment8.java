package recrusion;

public class Recrusion 
{
    public static void main(String[] args) 
    {
        binary(5);
    }
    static void binary(int n)
    {
        if(n>1)
        {
            binary(n/2);
        }
        System.out.print(n%2);
        
    }
    
}
