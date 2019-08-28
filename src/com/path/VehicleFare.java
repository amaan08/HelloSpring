package com.path;

import java.util.Map;

public class VehicleFare {

	Map<String, Integer> fareMap;

	public VehicleFare(Map<String, Integer> fareMap) {
		super();
		this.fareMap = fareMap;
	}

	@Override
	public String toString() {
		return "VehicleFare [fareMap=" + fareMap + "]";
	}
	
	
}
