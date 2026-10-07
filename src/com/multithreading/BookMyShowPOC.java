package com.multithreading;

//Resource
class BookMyShow
{
	int total_tickets=10;
	synchronized void bookMyShow(String name,int tickets) throws InterruptedException {
		
		if(tickets<=total_tickets)
		{
			Thread.sleep(2000);
			total_tickets-=tickets;
			System.out.println(tickets+" Tickets Booked "+name);
			System.out.println("Available Tickets are: "+total_tickets);
		}
		else
		{
			System.err.println(name+" Tickets Sold out!!!");
			System.out.println("Available Tickets are: "+total_tickets);	
		}
		
	}
	
}

class Customer extends Thread
{
	String name;
	BookMyShow bm;
	int tickets;
	
	public Customer( BookMyShow bm,String name,int tickets) {
		this.name = name;
		this.bm = bm;
		this.tickets=tickets;
	}
	
	@Override
	public void run()
	{
		try {
			bm.bookMyShow(name,tickets);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class BookMyShowPOC {
	public static void main(String[] args) {
		
		System.out.println("main started");
		BookMyShow b=new BookMyShow();
		Customer c1=new  Customer(b, "Reshma", 8);
		Customer c2=new  Customer(b, "Safiya", 8);
		 c1.start();
		 c2.start();
		System.out.println("main ended");
		/*Output: withot synchronized keyword
		 * main started
			main ended
8 Tickets Booked Safiya
8 Tickets Booked Reshma
Available Tickets are: 2
Available Tickets are: 2

		 */
		
		/*Output:
		 * with synchronized:
		 * main started
main ended
8 Tickets Booked Safiya
Available Tickets are: 2
Reshma Tickets Sold out!!!
Available Tickets are: 2
 			OR
main started
main ended
8 Tickets Booked Reshma
Available Tickets are: 2
Safiya Tickets Sold out!!!
Available Tickets are: 2

		 */
	}
}
