package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.NotificationDgi;
import com.example.demo.dao.NotificationDgiDao;

@Service
public class NotificationDgiService {
	@Autowired
	private NotificationDgiDao notificationDgiDao;

	public NotificationDgi findByRefNotifictionDgi(String refNotifictionDgi) {
		return notificationDgiDao.findByRefNotifictionDgi(refNotifictionDgi);
	}

	public int deleteByRefNotifictionDgi(String refNotifictionDgi) {
		return notificationDgiDao.deleteByRefNotifictionDgi(refNotifictionDgi);
	}

	
	
}
