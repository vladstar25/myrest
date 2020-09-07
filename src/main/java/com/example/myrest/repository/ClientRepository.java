package com.example.myrest.repository;

import com.example.myrest.model.Client;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ClientRepository extends CrudRepository<Client, Integer> {
}
