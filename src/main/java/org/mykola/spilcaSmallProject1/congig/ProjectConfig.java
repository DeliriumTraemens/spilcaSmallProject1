package org.mykola.spilcaSmallProject1.congig;

import org.mykola.spilcaSmallProject1.filter.RequestValidationFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(new RequestValidationFilter(), BasicAuthenticationFilter.class);
        http.authorizeRequests().anyRequest().permitAll();
    }
}
