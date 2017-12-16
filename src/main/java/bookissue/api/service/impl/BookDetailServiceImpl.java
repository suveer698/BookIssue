package bookissue.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bookissue.api.db.BookDetailRepo;
import bookissue.api.model.BookDetail;
import bookissue.api.service.BookDetailService;

public class BookDetailServiceImpl implements BookDetailService{
	
	@Autowired BookDetailRepo bookDetailRepo;

	@Override
	public List<BookDetail> viewAllBooks( Integer userId) {
	  BookDetail bookDetail = new BookDetail();
	  
	  bookDetail.setBookId(1234);
	  bookDetail.setBookName("ABC");
	  bookDetail.setBookQuantity(50);
	  
	  List<BookDetail> bookDetailList = new ArrayList<BookDetail>();
	  
	  bookDetailList.add(bookDetail);
	  return bookDetailList;
		
	}

	@Override
	public List<BookDetail> bookIssueHistory(Integer userId) {
		
		BookDetail bookDetail = new BookDetail();
		bookDetail.setBookId(2345);
		bookDetail.setBookName("DEF");
		bookDetail.setBookQuantity(100);
		
		  List<BookDetail> bookDetailList = new ArrayList<BookDetail>();
		  
		  bookDetailList.add(bookDetail);
		  return bookDetailList;
	}

	@Override
	public Integer bookCount(Integer bookId) {
		
		return 1234;
	}

}
