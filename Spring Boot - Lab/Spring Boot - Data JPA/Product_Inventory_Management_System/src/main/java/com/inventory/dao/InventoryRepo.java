package com.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.inventory.model.Product;

@Repository
public interface InventoryRepo extends JpaRepository<Product, Long>{

}
