package com.mah312.actuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseMonitoring implements HealthIndicator {

    private final String DB_SERVICE_NAME = "mysql service";

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        if (isDatabaseHealthy()) {
            return Health.up().withDetail(DB_SERVICE_NAME, "the service is running").build();
        }
        return Health.down().withDetail(DB_SERVICE_NAME, "the service is down").build();
    }

    private Boolean isDatabaseHealthy() {
        //based on our logic
        return true;
    }
}
