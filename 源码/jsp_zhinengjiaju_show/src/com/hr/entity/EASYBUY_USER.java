package com.hr.entity;

//”√ªß
public class EASYBUY_USER {
	private String EU_USER_ID;
	private String EU_USER_NAME;
	private String EU_PASSWORD;
	private String EU_SEX;
	private String EU_BIRTHDAY;
	private String EU_IDENTITY_CODE;
	private String EU_EMAIL;
	private String EU_MOBILE;
	private String EU_ADDRESS;
	private String EU_COURTY;
	private String EU_LIKE;
	
	private int EU_STATUS;
	
	public EASYBUY_USER(String eU_USER_ID, String eU_USER_NAME, String eU_PASSWORD, String eU_SEX, String eU_BIRTHDAY,
			String eU_IDENTITY_CODE, String eU_EMAIL, String eU_MOBILE, String eU_ADDRESS, String eU_COURTY,
			String eU_LIKE, int eU_STATUS) {
		super();
		EU_USER_ID = eU_USER_ID;
		EU_USER_NAME = eU_USER_NAME;
		EU_PASSWORD = eU_PASSWORD;
		EU_SEX = eU_SEX;
		EU_BIRTHDAY = eU_BIRTHDAY;
		EU_IDENTITY_CODE = eU_IDENTITY_CODE;
		EU_EMAIL = eU_EMAIL;
		EU_MOBILE = eU_MOBILE;
		EU_ADDRESS = eU_ADDRESS;
		EU_COURTY = eU_COURTY;
		EU_LIKE = eU_LIKE;
		EU_STATUS = eU_STATUS;
	}

	public String getEU_COURTY() {
		return EU_COURTY;
	}

	public void setEU_COURTY(String eU_COURTY) {
		EU_COURTY = eU_COURTY;
	}

	public String getEU_LIKE() {
		return EU_LIKE;
	}

	public void setEU_LIKE(String eU_LIKE) {
		EU_LIKE = eU_LIKE;
	}

	public String getEU_USER_ID() {
		return EU_USER_ID;
	}
	public void setEU_USER_ID(String eUUSERID) {
		EU_USER_ID = eUUSERID;
	}
	public String getEU_USER_NAME() {
		return EU_USER_NAME;
	}
	public void setEU_USER_NAME(String eUUSERNAME) {
		EU_USER_NAME = eUUSERNAME;
	}
	public String getEU_PASSWORD() {
		return EU_PASSWORD;
	}
	public void setEU_PASSWORD(String eUPASSWORD) {
		EU_PASSWORD = eUPASSWORD;
	}
	public String getEU_SEX() {
		return EU_SEX;
	}
	public void setEU_SEX(String eUSEX) {
		EU_SEX = eUSEX;
	}
	public String getEU_BIRTHDAY() {
		return EU_BIRTHDAY;
	}
	public void setEU_BIRTHDAY(String eUBIRTHDAY) {
		EU_BIRTHDAY = eUBIRTHDAY;
	}
	public String getEU_IDENTITY_CODE() {
		return EU_IDENTITY_CODE;
	}
	public void setEU_IDENTITY_CODE(String eUIDENTITYCODE) {
		EU_IDENTITY_CODE = eUIDENTITYCODE;
	}
	public String getEU_EMAIL() {
		return EU_EMAIL;
	}
	public void setEU_EMAIL(String eUEMAIL) {
		EU_EMAIL = eUEMAIL;
	}
	public String getEU_MOBILE() {
		return EU_MOBILE;
	}
	public void setEU_MOBILE(String eUMOBILE) {
		EU_MOBILE = eUMOBILE;
	}
	public String getEU_ADDRESS() {
		return EU_ADDRESS;
	}
	public void setEU_ADDRESS(String eUADDRESS) {
		EU_ADDRESS = eUADDRESS;
	}
	public int getEU_STATUS() {
		return EU_STATUS;
	}
	public void setEU_STATUS(int eUSTATUS) {
		EU_STATUS = eUSTATUS;
	}
	
}
