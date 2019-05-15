package org.ss.poc.demobook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBookApplication {
	
	/*@Configuration
	static class GlobalSecurityConfig extends GlobalAuthenticationConfigurerAdapter {
		@Override
		public void init( AuthenticationManagerBuilder auth ) throws Exception {
			auth.inMemoryAuthentication()
				.withUser( "sega" ).password( "{noop}sylla" ).roles( "USER" ).and()
				.withUser( "admin" ).password( "{noop}admin" ).roles( "USER, HERO" );
		}
	}*/
	public static void main( String[] args ) {
		SpringApplication.run( DemoBookApplication.class, args );
	}
	
}
