/**
 * 
 */
package com.olixstudios.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.olixstudios.dependencyInjection.cars.Ferrari;
import com.olixstudios.dependencyInjection.cars.Swift;
import com.olixstudios.dependencyInjection.specs.V12;
import com.olixstudios.dependencyInjection.specs.V6;

/**
 * @author Ashwin
 *
 */
@Configuration
@ComponentScan("com.olixstudios.dependencyInjection")
public class AppConfig {

	@Bean("ferrari")
	public Ferrari ferrari() {
		return new Ferrari();
	}

	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}

	@Bean("V12Engine")
	public V12 v12() {
		return new V12();
	}

	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
	}

}
