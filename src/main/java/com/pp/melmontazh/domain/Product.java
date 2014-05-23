package com.pp.melmontazh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String description;
    private String img;
    private String price;
    private long count;
    private boolean existence;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public boolean isExistence() {
		return existence;
	}
	public void setExistence(boolean existence) {
		this.existence = existence;
	}
    
    
}
