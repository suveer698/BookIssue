package bookissue.api.model;

public class BookReservation {
	
	private int  bookReservationId;
	
	private int userId;
	
	
	private  int  reservedId;
	
	private int bookId;

	public int getBookReservationId() {
		return bookReservationId;
	}

	public void setBookReservationId(int bookReservationId) {
		this.bookReservationId = bookReservationId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getReservedId() {
		return reservedId;
	}

	public void setReservedId(int reservedId) {
		this.reservedId = reservedId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	

}
