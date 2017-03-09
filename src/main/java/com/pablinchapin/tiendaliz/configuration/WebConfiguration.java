/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.tiendaliz.configuration;

import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author pvargas
 */
@Configuration
public class WebConfiguration {
    
    @Bean
    ServletRegistrationBean h2ServletRegistrationBean(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebdavServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;    
    }
    
}
