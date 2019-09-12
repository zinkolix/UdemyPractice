/**
 * 
 */
package com.olixstudios.dependencyInjection.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.olixstudios.dependencyInjection.interfaces.Car;

/**
 * @author Ashwin
 *
 */
@Component
public class Ferrari implements Car{

	@Autowired
	Engine engine;
	
	@Override
	public String specs() {
		return "You are calling the BOSS!, it's the FeRrArI having the heart of " + engine.type;
	}
 
	
}
