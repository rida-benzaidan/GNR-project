package com.example.demo.service;

import com.example.demo.bean.Taxe;
import com.example.demo.dao.TaxeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxeService {


    public Taxe findByRefTaxe(String refTaxe) {
        return taxeDao.findByRefTaxe(refTaxe);
    }

    public List<Taxe> findAll() {
        return taxeDao.findAll();
    }


    @Autowired
    private TaxeDao taxeDao;
}
