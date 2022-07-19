package com.kpmg.githubactionsdemo.service;

import com.kpmg.api1.Githubclass;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class MyService {
  private Githubclass gitclass;
  public String name(){
    return "My Name!";
  }
}
