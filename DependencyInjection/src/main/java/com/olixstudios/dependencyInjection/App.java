/**
 * 
 */
package com.olixstudios.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.olixstudios.dependencyInjection.interfaces.Car;

/**
 * @author Ashwin
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("ferrari", Car.class);
		System.out.println(myCar.specs());
	}

}
