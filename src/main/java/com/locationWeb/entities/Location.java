package com.locationWeb.entities;

import javax.persistence.Column;
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
@Table(name = "location_table")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String code;
	@Column
	private String name;
	@Column
	private String type;

	public Location(String code, String name, String type) {
		super();
		this.code = code;
		this.name = name;
		this.type = type;
	}

}
