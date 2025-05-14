package train_Ticket_Booking_System;

public class ExceptionClass extends RuntimeException {
	private String msg;
	public ExceptionClass() {}
	public ExceptionClass(String msg) {
		super();
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
