/**
 * 
 */
package com.rd.openshift.poc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author rohit
 *
 */
@JsonPropertyOrder({ "nameId" })
public class GetNameRequest {

	@JsonProperty("nameId")
	private String nameId;

	public String getNameId() {
		return nameId;
	}

	public void setNameId(String nameId) {
		this.nameId = nameId;
	}

}
