/**
 * 
 */
package com.olixstudios.dependencyInjection.cars;

import org.springframework.stereotype.Component;

/**
 * @author zinki
 *
 */
@Component
public class Engine {

	String type;

	/**
	 * 
	 */
	public Engine() {
		type = "V8";
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
