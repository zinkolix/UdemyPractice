/**
 * 
 */
package com.olixstudios.dependencyInjection.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.olixstudios.dependencyInjection.interfaces.Car;
import com.olixstudios.dependencyInjection.interfaces.Engine;

/**
 * @author Ashwin
 *
 */
public class Ferrari implements Car{

	@Autowired
	@Qualifier("V6Engine")
	Engine engine;
	
	@Override
	public String specs() {
		return "You are calling the BOSS!, it's the FeRrArI having the heart of " + engine.type();
	}
 
	
}
