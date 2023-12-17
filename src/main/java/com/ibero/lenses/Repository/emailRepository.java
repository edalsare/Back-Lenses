package com.ibero.lenses.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibero.lenses.Model.Email;

@Repository
public interface emailRepository extends JpaRepository<Email, Integer>{

}
