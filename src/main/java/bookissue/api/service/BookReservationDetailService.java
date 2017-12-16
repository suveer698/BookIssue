package bookissue.api.service;

import bookissue.api.model.BookReservation;

public interface BookReservationDetailService {
	
	public  BookReservation reserveBook( BookReservation bookReservation);
	
	public  boolean cancelBookResvation( BookReservation bookReservation);
	
	public Integer bookReservationCountUser(Integer userId);

}
