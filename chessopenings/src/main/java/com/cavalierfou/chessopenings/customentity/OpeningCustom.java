package com.cavalierfou.chessopenings.customentity;

import java.util.List;

public class OpeningCustom {

	private Long id;

	private String name;

	private Long parentOpeningId;
	
	private List<Long> childOpeningIds;

	private List<MoveCustom> moves;

	public OpeningCustom() {
		// default constructor
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentOpeningId() {
		return parentOpeningId;
	}

	public void setParentOpeningId(Long parentOpeningId) {
		this.parentOpeningId = parentOpeningId;
	}

	public List<Long> getChildOpeningIds() {
		return childOpeningIds;
	}

	public void setChildOpeningIds(List<Long> childOpeningIds) {
		this.childOpeningIds = childOpeningIds;
	}

	public List<MoveCustom> getMoves() {
		return moves;
	}

	public void setMoves(List<MoveCustom> moves) {
		this.moves = moves;
	}

}