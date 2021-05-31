package com.cavalierfou.chessopenings.customentity;

public class MoveCustom {

	private Long moveNumber;

	private String whitePiece;
	private String whiteColumnFrom;
	private String whiteLineFrom;
	private String whiteColumnTo;
	private String whiteLineTo;

	private String blackPiece;
	private String blackColumnFrom;
	private String blackLineFrom;
	private String blackColumnTo;
	private String blackLineTo;

	public MoveCustom() {
		// default constructor
	}

	public Long getMoveNumber() {
		return moveNumber;
	}

	public void setMoveNumber(Long moveNumber) {
		this.moveNumber = moveNumber;
	}

	public String getWhitePiece() {
		return whitePiece;
	}

	public void setWhitePiece(String whitePiece) {
		this.whitePiece = whitePiece;
	}

	public String getWhiteColumnFrom() {
		return whiteColumnFrom;
	}

	public void setWhiteColumnFrom(String whiteColumnFrom) {
		this.whiteColumnFrom = whiteColumnFrom;
	}

	public String getWhiteLineFrom() {
		return whiteLineFrom;
	}

	public void setWhiteLineFrom(String whiteLineFrom) {
		this.whiteLineFrom = whiteLineFrom;
	}

	public String getWhiteColumnTo() {
		return whiteColumnTo;
	}

	public void setWhiteColumnTo(String whiteColumnTo) {
		this.whiteColumnTo = whiteColumnTo;
	}

	public String getWhiteLineTo() {
		return whiteLineTo;
	}

	public void setWhiteLineTo(String whiteLineTo) {
		this.whiteLineTo = whiteLineTo;
	}

	public String getBlackPiece() {
		return blackPiece;
	}

	public void setBlackPiece(String blackPiece) {
		this.blackPiece = blackPiece;
	}

	public String getBlackColumnFrom() {
		return blackColumnFrom;
	}

	public void setBlackColumnFrom(String blackColumnFrom) {
		this.blackColumnFrom = blackColumnFrom;
	}

	public String getBlackLineFrom() {
		return blackLineFrom;
	}

	public void setBlackLineFrom(String blackLineFrom) {
		this.blackLineFrom = blackLineFrom;
	}

	public String getBlackColumnTo() {
		return blackColumnTo;
	}

	public void setBlackColumnTo(String blackColumnTo) {
		this.blackColumnTo = blackColumnTo;
	}

	public String getBlackLineTo() {
		return blackLineTo;
	}

	public void setBlackLineTo(String blackLineTo) {
		this.blackLineTo = blackLineTo;
	}

}