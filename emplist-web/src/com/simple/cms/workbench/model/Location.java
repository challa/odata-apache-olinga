package com.simple.cms.workbench.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the "sap.iot.device.configuration.data::location" database table.
 * 
 */
@Entity
@Table(name="\"sap.iot.device.configuration.data::location\"")
@NamedQuery(name="Location.findAll", query="SELECT s FROM Location s")
public class Location implements Serializable {
	
	@Id
	@Column(unique=true, nullable=false)
	private int ID;

	private String NAME;

	public Location() {
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