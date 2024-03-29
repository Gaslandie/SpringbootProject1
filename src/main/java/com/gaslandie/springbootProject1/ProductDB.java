package com.gaslandie.springbootProject1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//ProductDB qui est herite des methode de JpaRepository pour communiquer facilement avec notre base de donnees
@Repository
public interface ProductDB extends JpaRepository<Product,Integer> {
    
}