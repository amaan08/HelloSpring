package com.path;

import java.util.Properties;

public class Toll {

	private Properties tollProp;

	public Properties getTollProp() {
		return tollProp;
	}

	public void setTollProp(Properties tollProp) {
		this.tollProp = tollProp;
	}

	@Override
	public String toString() {
		return "Toll [tollProp=" + tollProp + "]";
	}
	
	
}
