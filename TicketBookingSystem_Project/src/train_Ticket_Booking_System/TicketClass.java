package train_Ticket_Booking_System;

public class TicketClass {
	
	private int ticketNo;
	private String boardingPoint;
	private String destinationPoint;
	private int seatNo;
	private int cost;
	
	public TicketClass() {}

	public TicketClass(int ticketNo, String boardingPoint, String destinationPoint, int seatNo, int cost) {
		super();
		this.ticketNo = ticketNo;
		this.boardingPoint = boardingPoint;
		this.destinationPoint = destinationPoint;
		this.seatNo = seatNo;
		this.cost = cost;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "\nticketNo=" + ticketNo + "\n boardingPoint=" + boardingPoint + "\n destinationPoint="
				+ destinationPoint + "\n seatNo=" + seatNo + "\n cost=" + cost + "\n------------------------------\n";
	}
	public void display() {
		System.out.println("\nTicket Number : "+getTicketNo() );
		System.out.println("Boarding Point :"+getBoardingPoint());
		System.out.println("Destination point : "+getDestinationPoint());
		System.out.println("Seat number : "+getSeatNo());
		System.out.println("Cost of the ticket : "+getCost()+"\n");
	}
}
