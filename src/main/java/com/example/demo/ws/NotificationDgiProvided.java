package com.example.demo.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.NotificationDgiService;
import com.example.demo.bean.NotificationDgi;

@RestController
@RequestMapping("gestion-notification/Dgi")
public class NotificationDgiProvided {

	@Autowired
	private NotificationDgiService notificationDgiService;
	
		@GetMapping("/refNotifictionDgi/{refNotifictionDgi}")
		public NotificationDgi findByRefNotifictionDgi(@PathVariable String refNotifictionDgi) {
		return notificationDgiService.findByRefNotifictionDgi(refNotifictionDgi);
	}
	
	@DeleteMapping("/refNotifictionDgi/{refNotifictionDgi}")
	public int deleteByRefNotifictionDgi(@PathVariable String refNotifictionDgi) {
		return notificationDgiService.deleteByRefNotifictionDgi(refNotifictionDgi);
	}

	
	

}
