package com.simple.cms.workbench.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the "sap.iot.device.configuration.data::connector" database table.
 * 
 */
@Entity
@Table(name="\"sap.iot.device.configuration.data::connector\"")
@NamedQuery(name="Connector.findAll", query="SELECT c FROM Connector c")
public class Connector implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID", unique=true, nullable=false)
	@SequenceGenerator( name = "connectorseq", sequenceName = "\"sap.iot.device.configuration.data::connector_id\"", allocationSize = 1, initialValue = 1 )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "connectorseq" )
	private int id;
	
	@Column(name="ACTIVE",nullable=false)
	private int active;
	
	@Column(name="ALIVESIGNALINTERVAL")
	private int alivesignalinterval;
	
	@Column(name="CONFIGUPDATEINTERVAL")
	private int configupdateinterval;

	@Column(name="CUSTOM_CONNECTOR_ID")
	private String customConnectorId;
	
	@Column(name="CUSTOMER",nullable=false)
	private int customer;

	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="IOTCOREURL")
	private String iotcoreurl;
	
	@Column(name="LASTALIVESIGNAL")
	private Timestamp lastalivesignal;
	
	@Column(name="LASTKNOWNIP")
	private String lastknownip;
	
	@Column(name="LISTENINGIP")
	private String listeningip;
	
	@Column(name="LISTENINGPORT")
	private int listeningport;
	
	@Column(name="LOCATION",nullable=false)
	private int location;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SETUPUPDATEENABLED")
	private int setupupdateenabled;
	
	@Column(name="VERSION")
	private String version;

	public Connector() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getAlivesignalinterval() {
		return alivesignalinterval;
	}

	public void setAlivesignalinterval(int alivesignalinterval) {
		this.alivesignalinterval = alivesignalinterval;
	}

	public int getConfigupdateinterval() {
		return configupdateinterval;
	}

	public void setConfigupdateinterval(int configupdateinterval) {
		this.configupdateinterval = configupdateinterval;
	}

	public String getCustomConnectorId() {
		return customConnectorId;
	}

	public void setCustomConnectorId(String customConnectorId) {
		this.customConnectorId = customConnectorId;
	}

	public int getCustomer() {
		return customer;
	}

	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIotcoreurl() {
		return iotcoreurl;
	}

	public void setIotcoreurl(String iotcoreurl) {
		this.iotcoreurl = iotcoreurl;
	}

	public Timestamp getLastalivesignal() {
		return lastalivesignal;
	}

	public void setLastalivesignal(Timestamp lastalivesignal) {
		this.lastalivesignal = lastalivesignal;
	}

	public String getLastknownip() {
		return lastknownip;
	}

	public void setLastknownip(String lastknownip) {
		this.lastknownip = lastknownip;
	}

	public String getListeningip() {
		return listeningip;
	}

	public void setListeningip(String listeningip) {
		this.listeningip = listeningip;
	}

	public int getListeningport() {
		return listeningport;
	}

	public void setListeningport(int listeningport) {
		this.listeningport = listeningport;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSetupupdateenabled() {
		return setupupdateenabled;
	}

	public void setSetupupdateenabled(int setupupdateenabled) {
		this.setupupdateenabled = setupupdateenabled;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}