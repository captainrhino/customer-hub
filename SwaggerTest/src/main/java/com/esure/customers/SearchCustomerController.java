package com.esure.customers;
 
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esure.test.CustomerRequest;
import com.esure.test.CustomerResponse;

import io.swagger.annotations.ApiOperation;
 
@RestController
public class SearchCustomerController {
 
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
 

    @RequestMapping(value="/handle", method=RequestMethod.GET)
    @ResponseBody
    public CustomerResponse handleRequest(@Valid @ModelAttribute CustomerRequest search, BindingResult result) {
    	System.out.println("handle request");
    	
    	return new CustomerResponse();
    }

    
    @RequestMapping(value = "/xxx")
    public String searchxxx() {
    //public String searchxxx() {
    	
    	//System.out.println(searchRequest);
    	//System.out.println(searchRequest.getFirstParam());
    	//System.out.println(searchRequest.getSecondParam());
    	System.out.println("in search xxx");
    	
        return "serching..";
    }
    
    
/*    
    @ApiOperation(value = "getcustomers", nickname = "getcustomers")
    @RequestMapping(method = RequestMethod.GET, path="/customers", produces = "application/json")
//    @ApiImplicitParams({
//        @ApiImplicitParam(name = "name", value = "User's name", required = false, dataType = "string", paramType = "query", defaultValue="Erin")
//      })
//    @ApiResponses(value = { 
//            @ApiResponse(code = 200, message = "Success", response = CustomerSearchResponse.class),
//            @ApiResponse(code = 401, message = "Unauthorized"),
//            @ApiResponse(code = 403, message = "Forbidden"),
//            @ApiResponse(code = 404, message = "Not Found"),
//            @ApiResponse(code = 500, message = "Failure")})   
    public CustomerSearchResponse getCustomers(@RequestParam(value="name", defaultValue="Erin") String name) {
    //public CustomerSearchResponse getCustomers(@ApiParam(hidden=true) @Valid CustomerSearchRequest request) {
    	
    	//System.out.println(request.getFoo());
    	System.out.println("hello");
    	
        return new CustomerSearchResponse("Harry", "Potter");
    }
      */
}
  