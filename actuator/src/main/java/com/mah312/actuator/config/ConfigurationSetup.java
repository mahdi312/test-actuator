package com.mah312.actuator.config;

import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.boot.actuate.audit.InMemoryAuditEventRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationSetup {

    //enable audit events that's contain user logging status - just remember that is provided by developers itself
    @Bean
    public AuditEventRepository getAuditionEvents() {
        return new InMemoryAuditEventRepository();
    }

}
