package com.cavalierfou.chessopenings.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "moves" database table.
 * 
 */
@Entity
@Table(name="\"moves\"")
@NamedQuery(name="Move.findAll", query="SELECT m FROM Move m")
public class Move implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"id\"")
	private long id;

	@Column(name="\"opening_id\"")
	private long openingId;

	@Column(name="\"move_number\"")
	private long moveNumber;

	@Column(name="\"color\"")
	private String color;

	@Column(name="\"piece\"")
	private String piece;

	@Column(name="\"column_from\"")
	private String columnFrom;

	@Column(name="\"line_from\"")
	private String lineFrom;

	@Column(name="\"column_to\"")
	private String columnTo;

	@Column(name="\"line_to\"")
	private String lineTo;

	public Move() {
		// default constructor
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOpeningId() {
		return openingId;
	}

	public void setOpeningId(long openingId) {
		this.openingId = openingId;
	}

	public long getMoveNumber() {
		return moveNumber;
	}

	public void setMoveNumber(long moveNumber) {
		this.moveNumber = moveNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPiece() {
		return piece;
	}

	public void setPiece(String piece) {
		this.piece = piece;
	}

	public String getColumnFrom() {
		return columnFrom;
	}

	public void setColumnFrom(String columnFrom) {
		this.columnFrom = columnFrom;
	}

	public String getLineFrom() {
		return lineFrom;
	}

	public void setLineFrom(String lineFrom) {
		this.lineFrom = lineFrom;
	}

	public String getColumnTo() {
		return columnTo;
	}

	public void setColumnTo(String columnTo) {
		this.columnTo = columnTo;
	}

	public String getLineTo() {
		return lineTo;
	}

	public void setLineTo(String lineTo) {
		this.lineTo = lineTo;
	}

}