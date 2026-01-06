package com.instamart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instamart.model.Instamart;

@Repository
public interface InstamartRepo extends JpaRepository<Instamart, Long>{

}
