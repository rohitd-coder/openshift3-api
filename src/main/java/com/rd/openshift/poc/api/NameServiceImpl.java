package com.rd.openshift.poc.api;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.rd.openshift.poc.model.GetNameRequest;

@Component
public class NameServiceImpl implements NameService {

	public Response getName(GetNameRequest request) {

		String resp = "{\"firstName\": \"FirstName\", \"lastName\": \"LastName\"}";

		return Response.ok(resp).build();
	}

}
