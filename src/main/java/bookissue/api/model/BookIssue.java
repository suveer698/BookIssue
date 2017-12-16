package bookissue.api.model;

import java.util.Date;

public class BookIssue {
	
	
	private int bookIssueId;
	
	private int bookId;
	
	private String bookName;
	
	private Date bookIssueDate;
	
	private Date bookReturnDate;
	
	private boolean bookReadStatus;
	
	private String bookStatus;

	public int getBookIssueId() {
		return bookIssueId;
	}

	public void setBookIssueId(int bookIssueId) {
		this.bookIssueId = bookIssueId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getBookIssueDate() {
		return bookIssueDate;
	}

	public void setBookIssueDate(Date bookIssueDate) {
		this.bookIssueDate = bookIssueDate;
	}

	public Date getBookReturnDate() {
		return bookReturnDate;
	}

	public void setBookReturnDate(Date bookReturnDate) {
		this.bookReturnDate = bookReturnDate;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	public boolean isBookReadStatus() {
		return bookReadStatus;
	}

	public void setBookReadStatus(boolean bookReadStatus) {
		this.bookReadStatus = bookReadStatus;
	}
	
	

}
