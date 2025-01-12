package com.ista.nomina.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ista.nomina.models.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {

}
