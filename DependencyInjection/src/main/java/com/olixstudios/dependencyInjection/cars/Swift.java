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
public class Swift implements Car{

	@Override
	public String specs() {
		return "Hey, this is me Swift. Mendak gaari";
	}
	
	

}
