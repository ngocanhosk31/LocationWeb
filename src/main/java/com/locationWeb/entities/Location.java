package com.locationWeb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="location")
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String code;
private String name;
private String type;
public Location(String code, String name, String type) {
	super();
	this.code = code;
	this.name = name;
	this.type = type;
}

}
