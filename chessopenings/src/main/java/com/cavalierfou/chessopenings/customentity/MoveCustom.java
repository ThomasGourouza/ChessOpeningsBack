package com.cavalierfou.chessopenings.customentity;

public class MoveCustom {

	private Long moveNumber;

	private String color;

	private String piece;

	private String columnFrom;

	private String lineFrom;

	private String columnTo;
	
	private String lineTo;

	public MoveCustom() {
		// default constructor
	}

	public Long getMoveNumber() {
		return moveNumber;
	}

	public void setMoveNumber(Long moveNumber) {
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