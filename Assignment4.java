package ola;

import java.util.Scanner;

public class Ola 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
	int baseFare = 50;
	int kmCharge = 10;
        System.out.println("Enter the distance you want to travel");
        int distanceTravlled = sc.nextInt();
		
	int olaMicro = 1;
	int olaMini = 2;
	int olaSedan = 3;
	int olaBike = 4;
	int olaShared = 5;

	int amountToPay = 0;
	
        int KOTAK=1;
        int ICICI=2;
        
	System.out.println("=========================");
	System.out.println("Select the Type of Cab:");
	System.out.println("1. OLA MICRO");
	System.out.println("2. OLA MINI");
	System.out.println("3. OLA SEDAN");
	System.out.println("4. OLA BIKE");
	System.out.println("5. OLA SHARED");
	System.out.println("=========================");
		
	System.out.println("Enter Your Choice:");
	int choice = sc.nextInt();
        
	switch(choice) 
        {
		
            case 1:
            {
                baseFare += 10;
		amountToPay = baseFare + (kmCharge*distanceTravlled);
                System.out.println("Do you want to apply promo code");
                System.out.println("1. KOTAK and get 20% Off Upto 150");
                System.out.println("2. ICICI for orders above Rs.250. Flat 20%");
                int promocode=sc.nextInt();
                double discount=0.20*amountToPay;
                if(promocode == ICICI && amountToPay >=250) 
                {
                    double discount1 = 0.20 * amountToPay;
                    System.out.println("Promo Code ICICI Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else if(promocode == KOTAK) 
                {
                    double discount1 = 0.20 * amountToPay;
                    if(discount1 > 150) 
                    {
                        discount1 = 150;
                    }
                    System.out.println("Promo Code KOTAK Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else 
                {
                    System.out.println("Invalid Promo Code");
                    System.out.println("Please Pay: \u20b9"+(amountToPay));
                }             
                break;
            }
				
            case 2:
            {
		baseFare += 20;
		amountToPay = baseFare + (kmCharge*distanceTravlled);
                System.out.println("Do you want to apply promo code");
                System.out.println("1. KOTAK and get 20% Off Upto 150");
                System.out.println("2. ICICI for orders above Rs.250. Flat 20%");
                int promocode=sc.nextInt();
                double discount=0.20*amountToPay;
                if(promocode == ICICI && amountToPay >=250) 
                {
                    double discount1 = 0.20 * amountToPay;
                    System.out.println("Promo Code ICICI Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else if(promocode == KOTAK) 
                {
                    double discount1 = 0.20 * amountToPay;
                    if(discount1 > 150) 
                    {
                        discount1 = 150;
                    }
                    System.out.println("Promo Code KOTAK Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else 
                {
                    System.out.println("Invalid Promo Code");
                    System.out.println("Please Pay: \u20b9"+(amountToPay));
                }
		break;
            }
			
            case 3:
            {
                baseFare += 50;
		amountToPay = baseFare + (kmCharge*distanceTravlled);
                System.out.println("Do you want to apply promo code");
                System.out.println("1. KOTAK and get 20% Off Upto 150");
                System.out.println("2. ICICI for orders above Rs.250. Flat 20%");
                int promocode=sc.nextInt();
                double discount=0.20*amountToPay;
                if(promocode == ICICI && amountToPay >=250) 
                {
                    double discount1 = 0.20 * amountToPay;
                    System.out.println("Promo Code ICICI Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else if(promocode == KOTAK) 
                {
                    double discount1 = 0.20 * amountToPay;
                    if(discount1 > 150) 
                    {
                        discount1 = 150;
                    }
                    System.out.println("Promo Code KOTAK Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else 
                {
                    System.out.println("Invalid Promo Code");
                    System.out.println("Please Pay: \u20b9"+(amountToPay));
                }
                break;
            }
				
            case 4:
            {
		baseFare += 5;
                amountToPay = baseFare + (kmCharge*distanceTravlled);
		System.out.println("Do you want to apply promo code");
                System.out.println("1. KOTAK and get 20% Off Upto 150");
                System.out.println("2. ICICI for orders above Rs.250. Flat 20%");
                int promocode=sc.nextInt();
                double discount=0.20*amountToPay;
                if(promocode == ICICI && amountToPay >=250) 
                {
                    double discount1 = 0.20 * amountToPay;
                    System.out.println("Promo Code ICICI Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else if(promocode == KOTAK) 
                {
                    double discount1 = 0.20 * amountToPay;
                    if(discount1 > 150) 
                    {
                        discount1 = 150;
                    }
                    System.out.println("Promo Code KOTAK Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else 
                {
                    System.out.println("Invalid Promo Code");
                    System.out.println("Please Pay: \u20b9"+(amountToPay));
                }
                break;
            }		
            case 5:
            {
		baseFare += 8;
		amountToPay = baseFare + (kmCharge*distanceTravlled);
		System.out.println("Do you want to apply promo code");
                System.out.println("1. KOTAK and get 20% Off Upto 150");
                System.out.println("2. ICICI for orders above Rs.250. Flat 20%");
                int promocode=sc.nextInt();
                double discount=0.20*amountToPay;
                if(promocode == ICICI && amountToPay >=250) 
                {
                    double discount1 = 0.20 * amountToPay;
                    System.out.println("Promo Code ICICI Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else if(promocode == KOTAK) 
                {
                    double discount1 = 0.20 * amountToPay;
                    if(discount1 > 150) 
                    {
                        discount1 = 150;
                    }
                    System.out.println("Promo Code KOTAK Applied. You Got Discount worth \u20b9"+discount1);
                    System.out.println("Please Pay: \u20b9"+(amountToPay-discount1));
                }
                else 
                {
                    System.out.println("Invalid Promo Code");
                    System.out.println("Please Pay: \u20b9"+(amountToPay));
                }
                break;
            }		
            default:
            {
		System.out.println("Please Select Cab to Porceed");
		break;		
            }	
	}
}
}
