package com.hepsiburada;

public class ResponseBody {

	boolean control;
	String searchName;
	public boolean isControl() {
		return control;
	}
	public void setControl(boolean control) {
		this.control = control;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public ResponseBody(boolean control, String searchName) {
		super();
		this.control = control;
		this.searchName = searchName;
	}
	
	public ResponseBody() {
		super();
	}
	
	
}
