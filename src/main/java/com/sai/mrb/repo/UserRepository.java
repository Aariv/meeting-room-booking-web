package com.sai.mrb.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.mrb.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
