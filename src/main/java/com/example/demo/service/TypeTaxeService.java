package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.TypeTaxe;
import com.example.demo.dao.TypeTaxeDao;

@Service
public class TypeTaxeService {
	@Autowired
	private TypeTaxeDao typetaxeDao;

	public TypeTaxe findByRefTypeTaxe(String refTypeTaxe) {
		return typetaxeDao.findByRefTypeTaxe(refTypeTaxe);
	}

	public int deleteByRefTypeTaxe(String refTypeTaxe) {
		return typetaxeDao.deleteByRefTypeTaxe(refTypeTaxe);
	}

	

}
