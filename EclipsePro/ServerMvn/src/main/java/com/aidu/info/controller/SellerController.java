package com.aidu.info.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.aidu.info.service.SellerService;

@Component    
@Path("Sellers")
public class SellerController {
	
	private SellerService sellerService;
	
	@GET
    @Path("/getAllSellers")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllSellers() {
		
		
		return sellerService.getAllSellers();
	}

}
