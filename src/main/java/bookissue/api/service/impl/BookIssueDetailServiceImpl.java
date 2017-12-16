package bookissue.api.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import bookissue.api.db.BookIssueRepo;
import bookissue.api.model.BookIssue;
import bookissue.api.service.BookIssueDetailService;

public class BookIssueDetailServiceImpl  implements BookIssueDetailService {

	@Autowired BookIssueRepo bookIssueRepo;

	@Override
	public boolean cancelBookIssue(BookIssue bookIssue) {
		return bookIssueRepo.issueBook(bookIssue);
	}

	@Override
	public boolean issueBook(BookIssue bookIssue) {
		return true;
	}

	@Override
	public Integer countBookIssueUser(Integer userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer countBookIssue(Integer bookId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
