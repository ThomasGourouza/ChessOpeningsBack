package com.cavalierfou.chessopenings.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "relations" database table.
 * 
 */
@Entity
@Table(name="\"relations\"")
@NamedQuery(name="Relation.findAll", query="SELECT r FROM Relation r")
public class Relation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"id\"")
	private long id;

	@Column(name="\"child_opening_id\"")
	private long childOpeningId;

	@Column(name="\"parent_opening_id\"")
	private long parentOpeningId;

	public Relation() {
		// default constructor
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getChildOpeningId() {
		return this.childOpeningId;
	}

	public void setChildOpeningId(long childOpeningId) {
		this.childOpeningId = childOpeningId;
	}

	public long getParentOpeningId() {
		return this.parentOpeningId;
	}

	public void setParentOpeningId(long parentOpeningId) {
		this.parentOpeningId = parentOpeningId;
	}

}