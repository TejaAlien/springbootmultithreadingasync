package com.async.springbootmultithreadingasync.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

//this class is responsible to handle the thread pool related stuff
//@EnableAsync tag informs spring to run the task in background
@Configuration
@EnableAsync
public class Asyncconfig {
    //here we are creating bean for the Executor
    //If we don't create the below bean EnableAsync create default thread to perform the task
    //better to sue the below bean
@Bean
    public  Executor taskExecutor(){
        ThreadPoolTaskExecutor threadPoolExecutor = new ThreadPoolTaskExecutor();
threadPoolExecutor.setCorePoolSize(2);
threadPoolExecutor.setMaxPoolSize(2);
threadPoolExecutor.setQueueCapacity(100);
threadPoolExecutor.setThreadNamePrefix("userThread");
threadPoolExecutor.initialize();
       return threadPoolExecutor;
    }
}
