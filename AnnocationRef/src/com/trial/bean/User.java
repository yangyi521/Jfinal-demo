package com.trial.bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trial.impl.Fishing;

@Component("user")
public class User {
  private Fishing fish;
  @Autowired
public void setFish(Fishing fish) {
	this.fish = fish;
}
  public void method(){
	  fish.Fish();
  }
 
}
