package com.cavalierfou.chessopenings.customentity;

public class MoveCustom {

	private long id;

	private String blackColumnFrom;

	private String blackColumnTo;

	private String blackLineFrom;

	private String blackLineTo;

	private String blackPiece;

	private long moveNumber;

	private long openingId;

	private String whiteColumnFrom;

	private String whiteColumnTo;

	private String whiteLineFrom;

	private String whiteLineTo;

	private String whitePiece;

	public MoveCustom() {
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