package com.syntaxerror.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class Users {



  @Id
  @Column(name="user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int userId;

  @Column(name="name")
  private String name;

  @Column(name="age")
  private int age;

  @Column(name="salary")
  private float salary;



  public Users(int userId, String name, int age, float salary) {
    this.userId = userId;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public Users() {
    super();
    // TODO Auto-generated constructors stub
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Users{" +
        "userId=" + userId +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", salary=" + salary +
        '}';
  }
}
