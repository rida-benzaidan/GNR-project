package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class NotificationDgi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String refNotifictionDgi;
	private String refTaxe;
	private String refRedivable;
	private String dateNotification;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getrefNotifictionDgi() {
		return refNotifictionDgi;
	}

	public void setrefNotifictionDgi(String refNotifictionDgi) {
		this.refNotifictionDgi = refNotifictionDgi;
	}

	public String getrefTaxe() {
		return refTaxe;
	}

	public void setrefTaxe(String refTaxe) {
		this.refTaxe=refTaxe;
	}
	
	public String getrefRedivable() {
		return refRedivable;
	}

	public void setrefRedivable(String refRedivable) {
		this.refRedivable=refRedivable;
	}

	public String getdateNotification() {
		return dateNotification;
	}

	public void gsetdateNotification(String dateNotification) {
		this.dateNotification=dateNotification;
	}



}

