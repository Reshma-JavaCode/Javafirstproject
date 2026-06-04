import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		
		int item,q;
		Scanner sc=new Scanner(System.in);
		
		String s="", res="";
		String orderSummary="";
		double price,total=0;
		do {
		System.out.println("Enter item");
		item=sc.nextInt();
		switch(item) {
		case 1->{
			s="abc";
			price=100;
			System.out.println("Enter Quantity");
			q=sc.nextInt();
			total=total+(price*q);
			orderSummary+=s+" x "+q +" = "+(price*q);
			
		}
		case 2->
		{
			s="xyz";
			price=500;
			System.out.println("Enter Quantity");
			q=sc.nextInt();
			total=total+(price*q);
			orderSummary+=s+" x "+q +" = "+(price*q);
		}
		default->System.out.println("invalid");
		}
		System.out.println("Do u want to continue(Y/N)");
		res= sc.next();
		}while(res.equalsIgnoreCase("Y"));
		
		System.out.println(orderSummary);
		System.out.println("Total bill: "+total);
		}
	}


