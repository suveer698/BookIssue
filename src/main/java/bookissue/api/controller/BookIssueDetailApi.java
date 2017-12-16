package bookissue.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bookissue.api.model.BookIssue;
import bookissue.api.service.BookIssueDetailService;



@RestController("/bookissue")
public class BookIssueDetailApi {

    @Autowired
    private BookIssueDetailService bookIssueDetailService;

    @RequestMapping(value = "/issueBook",method =RequestMethod.POST)
    public boolean issueBook(@RequestBody BookIssue bookIssue){
    	return bookIssueDetailService.issueBook(bookIssue);
    }
    
    @RequestMapping(value = "/cancelBook", method = RequestMethod.POST)
    public boolean cancelBookIssue(@RequestBody BookIssue bookIssue){
    	return bookIssueDetailService.cancelBookIssue(bookIssue);
    }
    
    @RequestMapping(value = "/issueBookCount", method = RequestMethod.GET)
    public Integer countBookIssue(@RequestParam Integer bookId){
    	return bookIssueDetailService.countBookIssue(bookId);
    }

   


}
