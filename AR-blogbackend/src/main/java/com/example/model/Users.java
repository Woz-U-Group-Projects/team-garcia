package com.example.model;

import java.sql.Timestamp;

public class Users {
    private int user_id;
    private String first_name;
    private String last_name;
    
    public int getUser_id() {
    	return user_id;
    }
    public void setuser_id(int user_id) {
    	this.user_id = user_id;
    }
    public String getFirst_name() {
    	return first_name;
    }
    public void setFirst_name(String first_name) {
    	this.first_name = first_name;
    }
    public String getLast_name() {
    	return last_name;
    }
    public void setLast_name(String last_name) {
    	this.last_name = last_name;
    }
}