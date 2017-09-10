package com.zc.gui.bean;

import java.util.Date;

public class GrInfo{
	private String grId;
	private String grGrantoraddr;
	private int grAmount;
	private Date grCreatetime;
	private Date grAcceptdeadline;
	private Date grApplydeadline;
	public String getGrId() {
		return grId;
	}
	public void setGrId(String grId) {
		this.grId = grId;
	}
	public String getGrGrantoraddr() {
		return grGrantoraddr;
	}
	public void setGrGrantoraddr(String grGrantoraddr) {
		this.grGrantoraddr = grGrantoraddr;
	}
	public int getGrAmount() {
		return grAmount;
	}
	public void setGrAmount(int grAmount) {
		this.grAmount = grAmount;
	}
	public Date getGrCreatetime() {
		return grCreatetime;
	}
	public void setGrCreatetime(Date grCreatetime) {
		this.grCreatetime = grCreatetime;
	}
	public Date getGrAcceptdeadline() {
		return grAcceptdeadline;
	}
	public void setGrAcceptdeadline(Date grAcceptdeadline) {
		this.grAcceptdeadline = grAcceptdeadline;
	}
	public Date getGrApplydeadline() {
		return grApplydeadline;
	}
	public void setGrApplydeadline(Date grApplydeadline) {
		this.grApplydeadline = grApplydeadline;
	}
	
}
