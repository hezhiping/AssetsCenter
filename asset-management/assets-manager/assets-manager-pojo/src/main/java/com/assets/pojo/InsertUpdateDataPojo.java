package com.assets.pojo;

import java.util.List;

public class InsertUpdateDataPojo {
	
	private String type;
	
	private List<?> insertUpdateData;

	public List<?>  getInsertUpdateData() {
		return insertUpdateData;
	}

	public void setInsertUpdateData(List<?>  insertUpdateData) {
		this.insertUpdateData = insertUpdateData;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
