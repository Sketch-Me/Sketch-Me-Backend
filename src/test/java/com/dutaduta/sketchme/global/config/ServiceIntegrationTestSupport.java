package com.dutaduta.sketchme.global.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
@RequiredArgsConstructor
public abstract class ServiceIntegrationTestSupport extends OutsideWorldSupport {
    
}
