package com.ilan.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		
		return "<p>Java Web Service</p>";
		
	}
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		
		return "<p>Version: 1.0</p>";
		
	}
}
