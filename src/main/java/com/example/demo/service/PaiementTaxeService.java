package com.example.demo.service;

import com.example.demo.bean.PaiementTaxe;
import com.example.demo.dao.PaiementTaxeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementTaxeService {

    @Autowired
    private PaiementTaxeDao paiementTaxeDao;

    public PaiementTaxe findByRef(String ref){
        return paiementTaxeDao.findByRef(ref);
    };
    public List <PaiementTaxe> findAll(){
        return paiementTaxeDao.findAll();
    };

}
