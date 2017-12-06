package com.aidu.info.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;



@Component    
@Path("Sellers")
public class Sellers {
	@GET
    @Path("/getSellers")
    @Produces(MediaType.TEXT_PLAIN)
    public String userTest() {
        return "OK";
    }
}
