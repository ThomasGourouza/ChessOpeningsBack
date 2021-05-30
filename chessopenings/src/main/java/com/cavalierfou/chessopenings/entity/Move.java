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

	@Column(name="\"black_column_from\"")
	private String blackColumnFrom;

	@Column(name="\"black_column_to\"")
	private String blackColumnTo;

	@Column(name="\"black_line_from\"")
	private String blackLineFrom;

	@Column(name="\"black_line_to\"")
	private String blackLineTo;

	@Column(name="\"black_piece\"")
	private String blackPiece;

	@Column(name="\"move_number\"")
	private long moveNumber;

	@Column(name="\"opening_id\"")
	private long openingId;

	@Column(name="\"white_column_from\"")
	private String whiteColumnFrom;

	@Column(name="\"white_column_to\"")
	private String whiteColumnTo;

	@Column(name="\"white_line_from\"")
	private String whiteLineFrom;

	@Column(name="\"white_line_to\"")
	private String whiteLineTo;

	@Column(name="\"white_piece\"")
	private String whitePiece;

	public Move() {
		// default constructor
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBlackColumnFrom() {
		return this.blackColumnFrom;
	}

	public void setBlackColumnFrom(String blackColumnFrom) {
		this.blackColumnFrom = blackColumnFrom;
	}

	public String getBlackColumnTo() {
		return this.blackColumnTo;
	}

	public void setBlackColumnTo(String blackColumnTo) {
		this.blackColumnTo = blackColumnTo;
	}

	public String getBlackLineFrom() {
		return this.blackLineFrom;
	}

	public void setBlackLineFrom(String blackLineFrom) {
		this.blackLineFrom = blackLineFrom;
	}

	public String getBlackLineTo() {
		return this.blackLineTo;
	}

	public void setBlackLineTo(String blackLineTo) {
		this.blackLineTo = blackLineTo;
	}

	public String getBlackPiece() {
		return this.blackPiece;
	}

	public void setBlackPiece(String blackPiece) {
		this.blackPiece = blackPiece;
	}

	public long getMoveNumber() {
		return this.moveNumber;
	}

	public void setMoveNumber(long moveNumber) {
		this.moveNumber = moveNumber;
	}

	public long getOpeningId() {
		return this.openingId;
	}

	public void setOpeningId(long openingId) {
		this.openingId = openingId;
	}

	public String getWhiteColumnFrom() {
		return this.whiteColumnFrom;
	}

	public void setWhiteColumnFrom(String whiteColumnFrom) {
		this.whiteColumnFrom = whiteColumnFrom;
	}

	public String getWhiteColumnTo() {
		return this.whiteColumnTo;
	}

	public void setWhiteColumnTo(String whiteColumnTo) {
		this.whiteColumnTo = whiteColumnTo;
	}

	public String getWhiteLineFrom() {
		return this.whiteLineFrom;
	}

	public void setWhiteLineFrom(String whiteLineFrom) {
		this.whiteLineFrom = whiteLineFrom;
	}

	public String getWhiteLineTo() {
		return this.whiteLineTo;
	}

	public void setWhiteLineTo(String whiteLineTo) {
		this.whiteLineTo = whiteLineTo;
	}

	public String getWhitePiece() {
		return this.whitePiece;
	}

	public void setWhitePiece(String whitePiece) {
		this.whitePiece = whitePiece;
	}

}