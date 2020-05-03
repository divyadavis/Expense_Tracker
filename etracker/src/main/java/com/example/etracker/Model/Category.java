package com.example.etracker.Model;

import java.math.BigInteger;

public class Category {

	
BigInteger Id;
int Transaction_Type;
String Category_Name;

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
public String getCategory_Name() {
	return Category_Name;
}
public void setCategory_Name(String category_Name) {
	Category_Name = category_Name;
}



}
