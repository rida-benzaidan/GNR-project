package com.example.demo.ws;

import com.example.demo.bean.Taxe;
import com.example.demo.service.TaxeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gestion-notification/taxe")
public class TaxeWs {
    public Taxe findByRefTaxe(String refTaxe) {
        return taxeService.findByRefTaxe(refTaxe);
    }

    public List<Taxe> findAll() {
        return taxeService.findAll();
    }

    @Autowired
    TaxeService taxeService;
}
