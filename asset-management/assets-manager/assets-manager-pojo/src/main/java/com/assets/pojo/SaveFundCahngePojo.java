package com.assets.pojo;

import java.util.List;

public class SaveFundCahngePojo {
	
	private String type;
	
	private  List<FundChange> fundChanges;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<FundChange> getFundChanges() {
		return fundChanges;
	}

	public void setFundChanges(List<FundChange> fundChanges) {
		this.fundChanges = fundChanges;
	}
	
}
