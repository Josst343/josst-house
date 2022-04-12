package com.jossthouse.persistence.crud;

import com.jossthouse.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

}
