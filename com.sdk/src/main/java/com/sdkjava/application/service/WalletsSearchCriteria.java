package com.sdkjava.application.service;

import java.sql.Timestamp;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WalletsSearchCriteria {
	
	
	private Timestamp fromDate;
	private Timestamp toDate;
	private List<String> tagNames;
	
	
	public Timestamp getFromDate() {
		return fromDate;
	}
	public void setFromDate(Timestamp fromDate) {
		this.fromDate = fromDate;
	}
	public Timestamp getToDate() {
		return toDate;
	}
	public void setToDate(Timestamp toDate) {
		this.toDate = toDate;
	}
	public List<String> getTagNames() {
		return tagNames;
	}
	public void setTagNames(List<String> tagNames) {
		this.tagNames = tagNames;
	}
	
	
	

}
