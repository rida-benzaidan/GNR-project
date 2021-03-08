package com.example.demo.ws;

import com.example.demo.bean.NotificationRedevable;
import com.example.demo.service.NotificationRedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-notification/notificationRedevable")
public class NotificationRedevableWs {
    @GetMapping("/ref/{ref}")
    public NotificationRedevable findByRef(@PathVariable String ref) {
        return notificationRedevableService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return notificationRedevableService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<NotificationRedevable> findAll() {
        return notificationRedevableService.findAll();
    }

    @GetMapping("/id/{id}")
    public NotificationRedevable getOne(@PathVariable Long id) {
        return notificationRedevableService.getOne(id);
    }

    @PostMapping("/")
    public int save(@RequestBody NotificationRedevable notificationRedevable) {
        return notificationRedevableService.save(notificationRedevable);
    }

    @Autowired
    private NotificationRedevableService notificationRedevableService;


}