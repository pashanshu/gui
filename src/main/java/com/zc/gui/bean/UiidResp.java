package com.zc.gui.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class UiidResp {
	private Boolean success;
	private String resultCode;
	private String resultDesc;
	private String message;
	private int rowCount;
	private List<Object> resultList;


	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public List<Object> getResultList() {
		return resultList;
	}

	public void setResultList(List<Object> resultList) {
		this.resultList = resultList;
	}

}
