package com.minimart.crm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Customer")
public class Customer {
	private String name;
	private String nic;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}

}
