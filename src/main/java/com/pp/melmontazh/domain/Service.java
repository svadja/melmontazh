package com.pp.melmontazh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="Services")
public class Service {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String description;
    private String img;
    private String price;
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
	public boolean isExistence() {
		return existence;
	}
	public void setExistence(boolean existence) {
		this.existence = existence;
	}
    
}
