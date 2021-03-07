package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.NotificationDgi;

@Repository
public interface NotificationDgiDao extends JpaRepository<NotificationDgi, Long>  {
	NotificationDgi findByRefNotifictionDgi(String refNotifictionDgi);
    int deleteByRefNotifictionDgi(String refNotifictionDgi);

    
}

