package com.example.demo.todo;

public class Todo {
 private static int nextId= 1;
 
 private int id;
 private String title;
 private String desc;
 
  public Todo(String title, String desc) {
	  this.id= nextId;
	  this.title= title;
	  this.desc= desc;
	  nextId++;
  }

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public int getId() {
	return id;
}


public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}
 
}
