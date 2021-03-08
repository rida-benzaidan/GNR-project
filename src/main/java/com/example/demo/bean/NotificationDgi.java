package com.example.demo.bean;

import javax.persistence.*;

@Entity
public class NotificationDgi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String refNotifictionDgi;
	@ManyToOne
	private Taxe taxe;
	@ManyToOne
	private  Redevable redevable;
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

	public String getdateNotification() {
		return dateNotification;
	}

	public void gsetdateNotification(String dateNotification) {
		this.dateNotification=dateNotification;
	}



}

