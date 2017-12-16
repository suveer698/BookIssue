package bookissue.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bookissue.api.model.BookReservation;
import bookissue.api.service.BookReservationDetailService;



@RestController("/bookreservation")
public class BookReservationDetailApi {

    @Autowired
    private BookReservationDetailService bookReservationDetailService;

    @RequestMapping(value = "/issueBook" ,method = RequestMethod.POST)
    public BookReservation issueBook(@RequestBody BookReservation bookReservation){
    	return bookReservationDetailService.reserveBook(bookReservation);
    }
    
    @RequestMapping( value = "/cancelBook",method = RequestMethod.POST)
    public boolean cancelBookIssue(@RequestBody BookReservation bookReservation){
    	return bookReservationDetailService.cancelBookResvation(bookReservation);
    }
    
    @RequestMapping( value = "/bookResvationCount",method = RequestMethod.POST)
    public Integer bookReservationCount(@RequestParam Integer userId ){
    	return bookReservationDetailService.bookReservationCountUser(userId);
    }

   


}
