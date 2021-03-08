package com.example.demo.ws;

import com.example.demo.bean.Redevable;
import com.example.demo.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-notification/Redevable")
public class RedevableWs {

        @GetMapping("/ref/{ref}")
        public Redevable findByRef(@PathVariable String ref) {
            return redevableService.findByRef(ref);
        }

        @DeleteMapping("/ref/{ref}")
        public int deleteByRef(@PathVariable String ref) {
            return redevableService.deleteByRef(ref);
        }

        @GetMapping("/")
        public List<Redevable> findAll() {
            return redevableService.findAll();
        }

        @GetMapping("/id/{id}")
        public Redevable getOne(@PathVariable Long id) {
            return redevableService.getOne(id);
        }

        @PostMapping("/")
        public int save(@RequestBody Redevable redevable) {
            return redevableService.save(redevable);
        }

        @Autowired
        private RedevableService redevableService;



}
