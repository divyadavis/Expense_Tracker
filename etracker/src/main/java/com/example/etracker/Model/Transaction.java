package com.example.etracker.Model;

import java.math.BigInteger;
import java.util.Date;

public class Transaction {
	
	BigInteger Id;
	int Transaction_Type;
	BigInteger User_Id;
	String Item;
	BigInteger Category_Id;
	double Amount;
	Date Transaction_Date;
	public BigInteger getId() {
		return Id;
	}
	public void setId(BigInteger id) {
		Id = id;
	}
	public int getTransaction_Type() {
		return Transaction_Type;
	}
	public void setTransaction_Type(int transaction_Type) {
		Transaction_Type = transaction_Type;
	}
	public BigInteger getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(BigInteger user_Id) {
		User_Id = user_Id;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public BigInteger getCategory_Id() {
		return Category_Id;
	}
	public void setCategory_Id(BigInteger category_Id) {
		Category_Id = category_Id;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public Date getTransaction_Date() {
		return Transaction_Date;
	}
	public void setTransaction_Date(Date transaction_Date) {
		Transaction_Date = transaction_Date;
	}
	
	
	

}
