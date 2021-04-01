package com.example.demo.dao;

import com.example.demo.bean.PaiementTaxe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PaiementTaxeDao extends JpaRepository<PaiementTaxe  , Long> {

    PaiementTaxe findByRef(String ref);
    List<PaiementTaxe> findAll() ;




}
