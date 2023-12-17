package com.ibero.lenses.Repository;

import org.springframework.stereotype.Repository;

import com.ibero.lenses.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface userRepository extends JpaRepository<User, Integer>{

}
