package com.ebus.microservice.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	

	
	public SecurityConfiguration() {
		
	}
	
	
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
    	//TODO: Enable valid url
    	//.csrf() is enabled by default
    	httpSecurity
		.authorizeRequests()
		// security disabled to run the application
		//.antMatchers("/pizza/delivery/**").hasRole("ADMIN")			
			.antMatchers("/css/**", "/common").permitAll()
			.antMatchers("/js/**").permitAll()
			.antMatchers("/**").permitAll()
			.and()
			.httpBasic()
			.and()
			.csrf();
    }
	
	

}
