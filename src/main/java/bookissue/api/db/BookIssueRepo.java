package bookissue.api.db;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bookissue.api.model.BookIssue;

@Repository
@Transactional
public class BookIssueRepo {
	
	
	  @Autowired
	    private DSLContext dsl;

	    public boolean  issueBook(BookIssue bookIssue){
	   /*     dsl.insertInto(BOOKISSUE)
	            .columns(BOOKISSUE.ISSUE_ID, BOOKISSUE.BOOK_ID, BOOKISSUE.BOOK_NAME, BOOKISSUE.BOOK_STATUS, BOOKISSUE.BOOK_ISSUE_DATE,BOOKISSUE.BOOK_RETURN_DATE)
	            .values(bookIssue.getBookIssueId(),
	            		bookIssue.getBookId(),
	            		bookIssue.getBookName(),
	            		bookIssue.getBookStatus(),
	            		bookIssue.getBookIssueDate(),
	            		bookIssue.getBookReturnDate()
	            .execute();*/
	            return true;
	    }
	    
	    public boolean  cancelBookIssue(BookIssue bookIssue){
	 	  
	 	            return true;
	 	    }
	    
	
	   
}
