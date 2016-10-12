package com.esure.test;


import java.util.concurrent.atomic.AtomicLong;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
 
@RestController
public class CustomerController {
 
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
 
    /**
     * 
     * XML
     * Add to raw header
     * accept:application/xml
     * FIRE REQUESThttp://localhost:8080/customers?firstName=fred
     * 
     * 
     * 
     * @param search
     * @param result
     * @return
     */
    @ApiOperation(value = "getCustomers", nickname = "getCustomers")
    @RequestMapping(method = RequestMethod.GET, path="/customers", produces = {"application/json","application/xml"})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "firstName", value = "first name", required = false, dataType = "string", paramType = "query", defaultValue="Harry"),
        @ApiImplicitParam(name = "lastName", value = "last name", required = false, dataType = "string", paramType = "query", defaultValue="Potter"),
        @ApiImplicitParam(name = "dob", value = "customers date of birth", required = false, dataType = "localDate", paramType = "query", defaultValue="1959/01/01"),
        @ApiImplicitParam(name = "postcode", value = "dob", required = false, dataType = "string", paramType = "query", defaultValue="RH1 0SG"),
        @ApiImplicitParam(name = "telephoneNumber", value = "telephone number", required = false, dataType = "string", paramType = "query", defaultValue="01727 123456")
      })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = CustomerResponse.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
    public @ResponseBody ResponseEntity<CustomerResponse> customers(@Valid @ModelAttribute CustomerRequest search, BindingResult result) {

    	System.out.println("firstName"+search.getFirstName());  
        return new ResponseEntity<CustomerResponse>(new CustomerResponse(), HttpStatus.OK);

    }
    
    
    
    @ApiOperation(value = "getCustomersByTelephone", nickname = "getCustomersByTelephone")
    @RequestMapping(value = "/customers/telephone/{telephoneNumber}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<CustomerResponse> getQuote(@PathVariable Long telephoneNumber) {
    	System.out.println(telephoneNumber);
    	return new ResponseEntity<CustomerResponse>(new CustomerResponse(), HttpStatus.OK);
     }
    
    
}
