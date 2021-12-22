package com.async.springbootmultithreadingasync.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
// we are using lambok so need to create getters and setters
//using Mockaroo I created a dumy data file which created  1000 records that I selected 1000
@Data
@Entity
@Table(name = "user_table")
//using lambok we are generating no argument and all argument constructor
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name ;
    private String email;
    private String gender;

}
