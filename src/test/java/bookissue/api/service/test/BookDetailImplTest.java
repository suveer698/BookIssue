package bookissue.api.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import bookissue.api.model.BookDetail;
import bookissue.api.service.impl.BookDetailServiceImpl;

public class BookDetailImplTest {
	

	BookDetailServiceImpl bookDetailService = new BookDetailServiceImpl();


	@Test
	public void testViewAllBooks() {
		BookDetail bookDetail2 = new BookDetail();
		bookDetail2.setBookId(1234);
		bookDetail2.setBookName("ABC");
		bookDetail2.setBookQuantity(50);
	
	List<BookDetail> bookDetailList = bookDetailService.viewAllBooks(1234);
	
	Assert.assertEquals(bookDetailList.get(0).getBookQuantity(), bookDetail2.getBookQuantity());
	Assert.assertEquals(bookDetailList.get(0).getBookId(), bookDetail2.getBookId());
	Assert.assertEquals(bookDetailList.get(0).getBookName(), bookDetail2.getBookName());
	}

	@Test
	public void testBookIssueHistory() {
		BookDetail bookDetail2 = new BookDetail();
		bookDetail2.setBookId(2345);
		bookDetail2.setBookName("DEF");
		bookDetail2.setBookQuantity(100);
	
		
		List<BookDetail> bookDetailList = bookDetailService.bookIssueHistory(2345);
	
	Assert.assertEquals(bookDetailList.get(0).getBookQuantity(), bookDetail2.getBookQuantity());
	Assert.assertEquals(bookDetailList.get(0).getBookId(), bookDetail2.getBookId());
	Assert.assertEquals(bookDetailList.get(0).getBookName(), bookDetail2.getBookName());
	}
/*
	@Test
	public void testBookCount() {
		Integer count = bookDetailService.bookCount(1234);
		Assert.assertNotEquals(1234.0, count.longValue());
	}*/

}
