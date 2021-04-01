package com.example.demo.ws;


import com.example.demo.bean.PaiementTaxe;
import com.example.demo.service.PaiementTaxeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gestion-notification/paiementTaxe")
public class PaiementTaxeWs {
    @GetMapping("/ref/{ref}")
    public PaiementTaxe findByRef(@PathVariable String ref) {
        return paiementTaxeService.findByRef(ref);
    }
    @GetMapping("/")
    public List<PaiementTaxe> findAll() {
        return paiementTaxeService.findAll();
    }

    @Autowired
    PaiementTaxeService paiementTaxeService;
}
