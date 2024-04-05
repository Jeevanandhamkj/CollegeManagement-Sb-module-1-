//package com.example.collegemanage.SecurityConfig;
//
//import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled = true)
//class Config {
//	
//@Bean
//PasswordEncoder passwordEncoder()
//{
//	return new BCryptPasswordEncoder();
//}
//@Bean
// UserDetailsService userDetailsService()throws Exception{
//	 UserDetails Admin =User.withUsername("ADMIN")
//			 .password(passwordEncoder().encode("admin")).roles("Admin").build();
//	 UserDetails NonTech =User.withUsername("jeeva")
//			 .password(passwordEncoder().encode("3699")).roles("NonTech").build();
//	 UserDetails Tech =User.withUsername("sachin")
//			 .password(passwordEncoder().encode("srt")).roles("Tech").build();
//	 
//	 return new InMemoryUserDetailsManager(Admin,NonTech,Tech);
//			 
// }
//
//@Bean
//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    http.csrf().disable()
//        .authorizeHttpRequests()
//            .requestMatchers(HttpMethod.POST, "/Department/add").hasRole("Admin") 
//            .requestMatchers(HttpMethod.GET, "/Department/get/{id}").permitAll() 
//            .requestMatchers(HttpMethod.GET, "/Department/getAll").hasRole("Admin") 
//            .requestMatchers(HttpMethod.DELETE, "/Department/delete/{id}").hasRole("Admin") 
//            .requestMatchers(HttpMethod.PUT, "/Department/update").hasRole("Admin") 
//            .anyRequest().authenticated() 
//        .and()
//        .formLogin(); // Enable form-based login
//
//    return http.build();
//}
//
//@Bean
//AuthenticationProvider authenticationProvider() throws Exception {
//	DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
//	authenticationProvider.setUserDetailsService(userDetailsService());
//	authenticationProvider.setPasswordEncoder(passwordEncoder());
//	return authenticationProvider;
//}  
//
//}
