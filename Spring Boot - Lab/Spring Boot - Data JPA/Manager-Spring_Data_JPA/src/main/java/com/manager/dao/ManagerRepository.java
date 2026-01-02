package com.manager.dao;

import org.springframework.data.repository.CrudRepository;

import com.manager.model.Manager;

public interface ManagerRepository extends CrudRepository<Manager, Integer> {

}
