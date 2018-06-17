package com.ebus.microservice.commonservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="common-service")
public class Configuration {
	
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
