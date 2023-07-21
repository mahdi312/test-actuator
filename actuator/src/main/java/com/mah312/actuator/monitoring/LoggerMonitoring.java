package com.mah312.actuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerMonitoring implements HealthIndicator {

    private final String LOGGER_SERVICE_NAME = "slf4j service";

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        if (isLoggingServiceUp()) {
            return Health.up().withDetail(LOGGER_SERVICE_NAME, "the service is running").build();
        }
        return Health.down().withDetail(LOGGER_SERVICE_NAME, "the service is down").build();
    }

    private Boolean isLoggingServiceUp() {
        //based on our logic
        return true;
    }
}
