/**
 * 
 */
package com.olixstudios.dependencyInjection.cars;

import org.springframework.stereotype.Component;

import com.olixstudios.dependencyInjection.interfaces.Car;

/**
 * @author Ashwin
 *
 */
@Component
public class Ferrari implements Car{

	@Override
	public String specs() {
		return "You are calling the BOSS!, it's the FeRrArI";
	}
 
	
}
