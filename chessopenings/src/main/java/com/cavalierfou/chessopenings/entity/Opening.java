package com.cavalierfou.chessopenings.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "openings" database table.
 * 
 */
@Entity
@Table(name="\"openings\"")
@NamedQuery(name="Opening.findAll", query="SELECT o FROM Opening o")
public class Opening implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"id\"")
	private long id;

	@Column(name="\"name\"")
	private String name;

	public Opening() {
		// default constructor
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}