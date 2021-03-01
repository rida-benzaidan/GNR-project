package com.example.gestion.dao;

import com.example.gestion.bean.NotificationRedevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRedevableDao extends JpaRepository<NotificationRedevable, Long> {
    NotificationRedevable findByRef(String ref);
    int deleteByRef(String ref);



}
