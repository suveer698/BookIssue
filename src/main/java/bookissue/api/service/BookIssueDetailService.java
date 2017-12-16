package bookissue.api.service;

import bookissue.api.model.BookIssue;

public interface BookIssueDetailService {
	
	public boolean issueBook(BookIssue bookIssue);
	
	public  Integer countBookIssueUser(Integer userId);
	
	public  Integer countBookIssue(Integer bookId);
		
	public boolean cancelBookIssue(BookIssue bookIssue);
	

}
