package com.skycloud.core.monitor;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author sky
 * @description
 **/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true, proxyTargetClass = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**.html", "/**.css", "/img/**", "/**.js", "/third-party/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/login",
                        "/api/**",
                    "/**/heapdump",
                    "/**/loggers",
                    "/**/liquibase",
                    "/**/logfile",
                    "/**/flyway",
                    "/**/auditevents",
                    "/**/jolokia",
                    "/**/hystrix.stream"
                ).permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/**").hasRole("USER")
                .antMatchers("/**").authenticated()
                .and()
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/login").permitAll()
                .defaultSuccessUrl("/")
                .and()
                .logout()
                .deleteCookies("remove")
                .logoutSuccessUrl("/login.html").permitAll()
                .and()
                .httpBasic();

    }


}