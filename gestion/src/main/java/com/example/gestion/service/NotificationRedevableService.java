package com.example.gestion.service;

import com.example.gestion.bean.NotificationRedevable;
import com.example.gestion.dao.NotificationRedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class NotificationRedevableService {
    public NotificationRedevable findByRef(String ref) {
        return notificationRedevableDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return notificationRedevableDao.deleteByRef(ref);
    }

    public List<NotificationRedevable> findAll() {
        return notificationRedevableDao.findAll();
    }

    public NotificationRedevable getOne(Long aLong) {
        return notificationRedevableDao.getOne(aLong);
    }

    public int save(NotificationRedevable entity) {
        return 1;
        //return notificationRedevableDao.save(entity);
    }

    @Autowired
    private NotificationRedevableDao notificationRedevableDao;


}
