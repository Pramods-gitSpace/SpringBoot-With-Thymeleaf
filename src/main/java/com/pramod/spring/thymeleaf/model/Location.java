package com.pramod.spring.thymeleaf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {
	@Id
	private int id;
	private String name;
	private String code;
	private String type;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + ", code=" + code + ", type=" + type + "]";
	}

}
