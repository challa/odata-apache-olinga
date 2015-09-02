package com.simple.cms.workbench.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: LocationByCustomer
 *
 */
@Entity
@Table(name="\"sap.iot.device.configuration.data::location\"")
@NamedQuery(name="LocationByCustomer.findAll", query="SELECT l.ID,l.NAME FROM Location l, Connector c WHERE c.customer=:customerid and l.ID=c.location group by l.ID,l.NAME")

public class LocationByCustomer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int ID;

	private String NAME;

	public LocationByCustomer() {
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}
   
}
