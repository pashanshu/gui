package com.zc.gui.bean;

public class UiidReq {

	private String searchTxt;
	private String uiid;
	private int page;
	private int start;
	private int limit;
	private String pageNo;
	private String pageSize;

	public String getUiid() {
		return uiid;
	}

	public void setUiid(String uiid) {
		this.uiid = uiid;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSearchTxt() {
		return searchTxt;
	}

	public void setSearchTxt(String searchTxt) {
		searchTxt = searchTxt;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}
