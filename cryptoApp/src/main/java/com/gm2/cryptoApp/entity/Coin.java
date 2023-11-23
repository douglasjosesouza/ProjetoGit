package com.gm2.cryptoApp.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Coin {
	
	private int id;
	private String name;
	private Timestamp datatime;
	private BigDecimal price;
	private BigDecimal quantity;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getDatatime() {
		return datatime;
	}
	public void setDatatime(Timestamp datatime) {
		this.datatime = datatime;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	
	

}



