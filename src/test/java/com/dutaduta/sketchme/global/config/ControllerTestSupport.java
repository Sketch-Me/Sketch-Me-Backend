package com.dutaduta.sketchme.global.config;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@WebMvcTest(controllers = {
}, excludeFilters = { //!Added!
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
//                SecurityConfig.class,
//                WebSecurityConfig.class
        })}
)
@AutoConfigureMockMvc(addFilters = false) //security filter 비활성화
public abstract class ControllerTestSupport {

}

