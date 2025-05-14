package train_Ticket_Booking_System;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketBookingMainClass_V1 {
	public static void main(String[] args) {
		
		Irctc_Class i=new Irctc_Class();
		
		Scanner scan=new Scanner(System.in);
		boolean status=true;
		int ticketNum;
		
		while(status) {
		int attempts=2;
		System.out.println("Press 1 to Book Ticket");
		System.out.println("Press 2 to show Tickets");
		System.out.println("Press 3 to Search Ticket by usig Ticket Number");
		System.out.println("Press 4 to search ticket by using Boarding Point");
		System.out.println("Press 5 to update the boarding point using ticket number");
		System.out.println("Press 6 to update the cost using Ticket number");
		System.out.println("Press 7 to Cancel the ticket");
		System.out.println("Press 8 to exit");
		
		int ch=scan.nextInt();

		switch(ch) 
		{
		case 1 : {
			System.out.println("Enter the ticket number");
			ticketNum=scan.nextInt();
			
			System.out.println("Enter the boarding point");
			String boardingPoint=scan.next();
			
			System.out.println("Enter the destination point");
			String destinationPoint=scan.next();
			
			System.out.println("Enter the Seat number");
			int seatNum=scan.nextInt();
			
			System.out.println("Enter the cost of the ticket");
			int cost=scan.nextInt();
			
			i.bookTicket(new TicketClass(ticketNum,boardingPoint,destinationPoint,seatNum,cost));
		}
		break;
		
		case 2 : try{
					i.displayTicket();
				}
				catch(ExceptionClass e) {
					System.out.println(e.getMsg());
					System.out.println();
				}
		break;
		
		case 3 : 
			while(attempts>0) {
			try{
				System.out.println("Enter the ticket number to search the ticket");
				ticketNum=scan.nextInt();
				i.searchTicket(ticketNum);
				break;
		    } catch(ExceptionClass e) {
		    	System.out.println(e.getMsg());
		    	System.out.println();
		    	break;
		    } catch(InputMismatchException e1) {
		    	attempts--;
		    	System.out.println("Invalid Input");
				if (attempts > 0) {
					System.out.println("Re-enter the ticket number:");
				}
				scan.next();
				}
			}
			if(attempts==0) {
				System.out.println("Returning to main menu\n");
			}
		break;
		
		case 4 : 
			while(attempts>0) {
				try{
					System.out.println("Enter the boarding point to search the ticket");
					String boardingPoint = scan.next();
					i.searchTicket(boardingPoint);
					break;
				} catch(ExceptionClass e) {
					System.out.println(e.getMsg());
					break;
				} catch(InputMismatchException e1) {
					attempts--;
					System.out.println("Invalid Input");
					if (attempts > 0) {
						System.out.println("Re-enter the valid boarding point name : ");
							
					}
					scan.next();
					}
			}
			if(attempts==0) {
				System.out.println("Returning to main menu\n");
			}
		break;
		
		case 5 : 
			while(attempts>0) {
				try{
					System.out.println("Enter the ticket number");
					ticketNum=scan.nextInt();
					i.updateTicket(ticketNum);
					break;
				} catch(ExceptionClass e) {
					System.out.println(e.getMsg());
					break;
				} catch(InputMismatchException e1) {
					attempts--;
					System.out.println("Invalid Input");
					if (attempts > 0) {
						System.out.println("Re-enter the ticket number:");	
					}
					scan.next();
					}
			}
			if(attempts==0) {
				System.out.println("Returning to main menu\n");
			}
		break;
		
		case 6 :
			while(attempts>0) {
				try{
					System.out.println("Enter the ticket number");
					ticketNum=scan.nextInt();
					i.updateTicketCost(ticketNum);
					break;
				} catch(ExceptionClass e) {
					System.out.println(e.getMsg());
					break;
				} catch(InputMismatchException e1) {
					attempts--;
					System.out.println("Invalid Input");
					if (attempts > 0) {
						System.out.println("Re-enter the ticket number:");	
					}
					scan.next();
					}
			}
			if(attempts==0) {
				System.out.println("Returning to main menu\n");
			}
		break;
		
		case 7 : 	
				while(attempts>0) {
				try{
					System.out.println("Enter the ticket number");
					ticketNum=scan.nextInt();
					i.cancelTicket(ticketNum);
					break;
				} catch(ExceptionClass e) {
					System.out.println(e.getMsg());
					System.out.println();
					break;
				} catch(InputMismatchException e1) {
					attempts--;
					System.out.println("Invalid Input");
					if (attempts > 0) {
						System.out.println("Re-enter the ticket number:");	
					}
					scan.next();
					
				}
				}
				if(attempts==0) {
					System.out.println("Returning to main menu\n");
					break;
				}
							
		break;
		
		case 8 : {
			status=false;
			System.out.println("Thank you visit again");
		}
		break;
		
		default:System.out.println("Wrong choice");
		}
		}
	}
}
