package com.cavalierfou.chessopenings.customentity;

public class RelationCustom {

	private long id;

	private long childOpeningId;

	private long parentOpeningId;

	public RelationCustom() {
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