package train_Ticket_Booking_System;

import java.util.ArrayList;
import java.util.ListIterator;

public class Irctc_Class {
	
	private TicketClass t;
	
	ArrayList<TicketClass> a = new ArrayList<TicketClass>();
	
	//Booking a ticket by creating a method
	public void bookTicket(TicketClass t) {
		a.add(t);
		System.out.println("Ticket booked successfully with ticket number "+t.getTicketNo()+"\n");
	}
	
	//Displaying the ticket details
	public void displayTicket() {
		if(a.isEmpty()) {
			//System.out.println("No tickets booked till now.\n");
			throw new ExceptionClass(getClass()+" : No tickets booked till now");
		}
		else {
			for(TicketClass t1:a)
			{
				t1.display();
				System.out.println();
			}
		}
	}
	
	//Searching ticket by using ticket number
	public void searchTicket(int ticketNum) {
		boolean isTicketFound=false;
		if(a.isEmpty()) {
			//System.out.println("No tickets booked till now\n");
		throw new ExceptionClass(getClass()+" : No tickets booked till now\n");
		}
		else {
			for(TicketClass t2:a) {
				if(t2.getTicketNo()==ticketNum) {
					System.out.println("Ticket found....\n");
					t2.display();
					isTicketFound=true;
				}
			}
		}
		if(isTicketFound==false) {
			  //System.out.println("Your entered ticket number not found...\n"); }
			throw new ExceptionClass(getClass()+" : No tickets booked till now\n");
		}
	}
	
	//Searching ticket by using Boarding point	
	public void searchTicket(String boardingPoint) {
		boolean isTicketFound=false;
		if(a.isEmpty()) {
			//System.out.println("No tickets booked till now\n");
			throw new ExceptionClass(getClass()+" : No tickets booked till now\n");
		}
		else {
			for(TicketClass t2:a) {
				if(t2.getBoardingPoint().equalsIgnoreCase(boardingPoint)) {
					System.out.println("Ticket found....\n");
					t2.display();
					isTicketFound=true;
				}
			}
		}
		if(isTicketFound==false) {
			  //System.out.println("Your entered ticket number not found...\n"); 
			throw new ExceptionClass(getClass()+" : Your entered ticket number not found...\n");
		}
	}
	
	//Update boarding point of ticket by using ticket number
	public void updateTicket(int ticketNum) {
		boolean isUpdated=false;
		if(a.isEmpty()) {
			//System.out.println("No tickets booked till now\n");
			throw new ExceptionClass(getClass()+" : No tickets booked till now\n");		
		}
		else {
			for(TicketClass t3:a) {
				if(t3.getTicketNo()==ticketNum) {
					t3.setBoardingPoint("kcg");
					isUpdated=true;
					System.out.println("Updated successfully...\n");
				}
			}
		}
		if(isUpdated==false) {
			//System.out.println("Entered ticket number not found\n");
			/*
			 * ExceptionClass e=new ExceptionClass();
			 * e.setMsg(getClass()+" : Your entered ticket number not found...\n");
			 */
			throw new ExceptionClass(getClass()+" : Your entered ticket number not found...\n");
		}
	}
	
	//Update cost of ticket by using ticket number
	public void updateTicketCost(int ticketNum) {
		boolean isUpdated=false;
		if(a.isEmpty()) {
			//System.out.println("No tickets booked till now\n");
			throw new ExceptionClass(getClass()+" : No tickets booked till now");

		}
		else {
			for(TicketClass t3:a) {
				if(t3.getTicketNo()==ticketNum) {
					t3.setCost(500);
					isUpdated=true;
					System.out.println("Updated successfully...\n");
				}
			}
		}
		if(isUpdated==false) {
			//System.out.println("Entered ticket number not found\n");
			throw new ExceptionClass(getClass()+" : Your entered ticket number not found...\n");

		}
	}
	
	//Cancel the ticket by using ticket number
	public void cancelTicket(int ticketNum) {
		boolean isCancelled=false;
		if(a.isEmpty()) {
//			System.out.println("No tickets booked till now\n");
			throw new ExceptionClass(getClass()+" : No tickets booked till now");
	
		}
		else {
			ListIterator<TicketClass> l=a.listIterator();
			while(l.hasNext()) {
				TicketClass t5=l.next();
				if(t5.getTicketNo()==ticketNum) {
					l.remove();
					isCancelled=true;
					System.out.println("Removed successfully\n");
				}
			}
		}
		if(isCancelled==false) {
			//System.out.println("Entered ticket number is not found "+ticketNum+"\n");
			throw new ExceptionClass(getClass()+" : Your entered ticket number not found...\n");

		}
	}
}
