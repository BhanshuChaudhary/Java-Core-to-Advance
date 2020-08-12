package promocode;

import java.util.Scanner;

public class PromoCode 
{
    public static void main(String[] args) 
    {		
	Scanner scanner = new Scanner(System.in);
			
	int KOTAK200 = 1;
        int ICICTREATS = 2;
		
	double amountToPay = 1635.0;
					
	if(amountToPay >= 399) 
        {
            System.out.println("You are elibile for applying Promo Code");
            System.out.println("1. KOTAK200 for orders above Rs.399. 20% Off Upto 200");
            System.out.println("2. ICICTREATS for orders above Rs.499. Flat 20%");
			
            int promoCode = scanner.nextInt();
            double discount1 = 0.20 * amountToPay;
            if(discount1>200 && promoCode==1)
            {
                System.out.println("You can get high discount. Apply other promocode");
                System.out.println("Enter your choice");
                int promoCode1 = scanner.nextInt();
                double discount2 = 0.20 * amountToPay;
                if(discount2>200 && promoCode1==1)
                {
                    System.out.println("You can get high discount. Apply other promocode");
                }
                else if(promoCode1 == ICICTREATS && amountToPay >=499) 
                {
                    double discount = 0.20 * amountToPay;
                    System.out.println("Promo Code ICICTREATS Applied. You Got Discount worth \u20b9"+discount);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
                }
                else if(promoCode1 == KOTAK200) 
                {
                    double discount = 0.20 * amountToPay;
                    if(discount > 200) 
                    {
                        discount = 200;
                    }
                    System.out.println("Promo Code KOTAK200 Applied. You Got Discount worth \u20b9"+discount);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
                }
                else 
                {
                    System.out.println("Invalid Promo Code");
                    System.out.println("Please Pay: \u20b9"+(amountToPay));
                }
            }
            else if(promoCode == ICICTREATS && amountToPay >=499) 
            {
                double discount = 0.20 * amountToPay;
		System.out.println("Promo Code ICICTREATS Applied. You Got Discount worth \u20b9"+discount);
                System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
            }
            else if(promoCode == KOTAK200) 
            {
		double discount = 0.20 * amountToPay;
		if(discount > 200) 
                {
                    discount = 200;
		}
		System.out.println("Promo Code KOTAK200 Applied. You Got Discount worth \u20b9"+discount);
                System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
            }
            else 
            {
		System.out.println("Invalid Promo Code");
                System.out.println("Please Pay: \u20b9"+(amountToPay));
                System.out.println("Otherwise try again");
                System.out.println("Enter your choice");
                int promoCode2 = scanner.nextInt();
                double discount3 = 0.20 * amountToPay;
                if(discount3>200 && promoCode2==1)
                {
                    System.out.println("You can get high discount. Apply other promocode");
                }
                else if(promoCode2 == ICICTREATS && amountToPay >=499) 
                {
                    double discount = 0.20 * amountToPay;
                    System.out.println("Promo Code ICICTREATS Applied. You Got Discount worth \u20b9"+discount);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
                }
                else if(promoCode2 == KOTAK200) 
                {
                    double discount = 0.20 * amountToPay;
                    if(discount > 200) 
                    {
                        discount = 200;
                    }
                    System.out.println("Promo Code KOTAK200 Applied. You Got Discount worth \u20b9"+discount);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
                }
                else 
                {
                    System.out.println("Invalid Promo Code");
                    System.out.println("Please Pay: \u20b9"+(amountToPay));
                }
            }
            }
        else 
        {
            System.out.println("You are NOT elibile for applying any Promo Code");
            System.out.println("Please Pay: \u20b9"+amountToPay);
        }

	}
} 
