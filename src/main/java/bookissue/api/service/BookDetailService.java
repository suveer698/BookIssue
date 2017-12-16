package bookissue.api.service;

import java.util.List;

import bookissue.api.model.BookDetail;

public interface BookDetailService {
	
	public List<BookDetail>  viewAllBooks(Integer userId);
	
	public List<BookDetail>   bookIssueHistory(Integer userId);
	
	public Integer bookCount(Integer bookId);
	
	

}
