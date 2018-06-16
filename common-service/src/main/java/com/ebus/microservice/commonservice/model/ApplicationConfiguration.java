package com.ebus.microservice.commonservice.model;


public class ApplicationConfiguration {
	
	protected ApplicationConfiguration() {
		
	}
	
	public ApplicationConfiguration(int autoApprovalInterval, boolean isUserEditable) {
		this.autoApprovalInterval = autoApprovalInterval;
		this.isUserEditable = isUserEditable;
	}
	
	private int autoApprovalInterval;
	private boolean isUserEditable;
	
	
	public int getAutoApprovalInterval() {
		return autoApprovalInterval;
	}
	public void setAutoApprovalInterval(int autoApprovalInterval) {
		this.autoApprovalInterval = autoApprovalInterval;
	}
	public boolean isUserEditable() {
		return isUserEditable;
	}
	public void setUserEditable(boolean isUserEditable) {
		this.isUserEditable = isUserEditable;
	}
	

}
