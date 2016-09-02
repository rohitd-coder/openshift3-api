package com.rd.openshift.poc.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rd.openshift.poc.model.GetNameRequest;

@Path("/ose")
public interface NameService {

	@Path("/name")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getName(GetNameRequest request);

}
