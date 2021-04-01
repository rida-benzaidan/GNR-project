package com.example.demo.dao;

import com.example.demo.bean.Taxe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxeDao extends JpaRepository<Taxe , Long> {
    public Taxe findByRefTaxe(String refTaxe);
    public List<Taxe> findAll();
}
