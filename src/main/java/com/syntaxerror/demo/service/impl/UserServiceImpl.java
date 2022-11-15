package com.syntaxerror.demo.service.impl;

import com.syntaxerror.demo.entity.Users;
import com.syntaxerror.demo.repository.UserRepository;
import com.syntaxerror.demo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  // inject dependency for database transactions
  @Autowired
  private UserRepository userRepository;

  @Override
  public List<Users> getAllUsers(){
    return (List<Users>) userRepository.findAll();
  }

  @Override
  public Users getUserById(int userId){
    return userRepository.findById(userId).orElse(null);
  }

  @Override
  public Users addOrUpdateUsers(Users user) {
    return userRepository.save(user);
  }

  @Override
  public Users deleteUser(int userId) throws Exception{
    Users deletedUser = null;
    try {
      deletedUser = userRepository.findById(userId).orElse(null);
      if(deletedUser == null) {
        throw new Exception("user not available");
      } else {
          userRepository.deleteById(userId);
      }
    }
    catch(Exception ex) {
      throw ex;
    }
    return  deletedUser;
  }



}
