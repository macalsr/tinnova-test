package com.project.tinnova.repository;

import com.project.tinnova.model.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, Integer> {

    @Query("select v from Veiculos v")
    List<Veiculos> findAllBy(String q);



}
