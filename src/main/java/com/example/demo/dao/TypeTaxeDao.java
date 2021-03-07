package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.TypeTaxe;


@Repository
public interface TypeTaxeDao extends JpaRepository<TypeTaxe, Long>  {
	TypeTaxe findByRefTypeTaxe(String refTypeTaxe);
    int deleteByRefTypeTaxe(String refTypeTaxe);

}

