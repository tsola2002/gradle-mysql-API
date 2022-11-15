package com.syntaxerror.demo.service;

import com.syntaxerror.demo.entity.Users;
import java.util.List;

public interface UserService {

  public List<Users> getAllUsers();
  public Users getUserById(int userId);
  public Users addOrUpdateUsers(Users user);
  public Users deleteUser(int userId) throws Exception;
}
