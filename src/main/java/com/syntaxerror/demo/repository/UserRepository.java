package com.syntaxerror.demo.repository;

import com.syntaxerror.demo.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
