package com.simple.cms.workbench.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "sap.iot.device.configuration.data::customer" database table.
 * 
 */
@Entity
@Table(name="\"sap.iot.device.configuration.data::customer\"")
@NamedQuery(name="Customer.findAll", query="SELECT s FROM Customer s")

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	private String externalid;

	private String name;

	public Customer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExternalid() {
		return this.externalid;
	}

	public void setExternalid(String externalid) {
		this.externalid = externalid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}