package com.async.springbootmultithreadingasync.service;

import com.async.springbootmultithreadingasync.entity.User;
import com.async.springbootmultithreadingasync.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;


@Service
public class Userservice {
    @Autowired
    private UserRepo userRepo;
//To check the statement we are adding log here
    Logger logger = LoggerFactory.getLogger(Userservice.class);
    //we are our csv file make it as a obj and persist in db for that
//the user data is comin from the csv file so we are using method argument as Multipartfile
    public CompletableFuture<List<User>> saveuser(MultipartFile file){
        //we are start and end time to check the execution
        Long Starttime= System.currentTimeMillis();
        Long Endtime =System.currentTimeMillis();

    }
//writing a method to pass our csv file
   private List<User> parseCSVFile(final MultipartFile file) throws Exception
   {
       final List<User> users = new ArrayList<>();
       try(final BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))){
           String line;
           while ((line= String.valueOf(br.readLine()!=null))){

           }
       }



   }    }
