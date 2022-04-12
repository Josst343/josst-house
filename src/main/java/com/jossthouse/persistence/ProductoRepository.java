package com.jossthouse.persistence;

import com.jossthouse.persistence.crud.ProductoCrudRepository;
import com.jossthouse.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

}
