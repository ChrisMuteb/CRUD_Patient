package com.lasuperbe.springboot.crudpatient.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class PatientSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails chris = User.builder()
                .username("chris")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails elie = User.builder()
                .username("elie")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails amos = User.builder()
                .username("amos")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(chris, elie, amos);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "api/patients").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "api/patients/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "api/patients").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "api/patients").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "api/patients/**").hasRole("ADMIN")
        );

        // use HTTP Basic authentication
        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf -> csrf.disable()); // disable Cross Site Request Forgery since it is not require for stateless REST APIs using POST, PUT, DELETE & PATCH

        return http.build();
    }
}
