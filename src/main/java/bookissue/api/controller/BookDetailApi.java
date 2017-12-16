package bookissue.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bookissue.api.model.BookDetail;
import bookissue.api.service.BookDetailService;



@RestController("/bookdetail")
public class BookDetailApi {

    @Autowired
    private BookDetailService bookDetailService;

    @RequestMapping(value = "/viewAllBook", method = RequestMethod.GET)
    public List<BookDetail> viewBook(@RequestParam Integer userId){
    	return bookDetailService.viewAllBooks(userId);
    }
    
    @RequestMapping( value = "/bookHistory" ,method = RequestMethod.GET)
    public List<BookDetail> viewBookHistory(@RequestParam Integer userId){
    	return bookDetailService.bookIssueHistory(userId);
    }

    
    @RequestMapping( value = "/bookHistory" ,method = RequestMethod.GET)
    public Integer viewBookCount(@RequestParam Integer bookId){
    	return bookDetailService.bookCount(bookId);
    }
   


}
