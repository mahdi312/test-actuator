package com.mah312.actuator.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


/**
 * creating a customized @Endpoint  with a specific id that can be mapped to the end of url : /actuator/{id}
 */
@Endpoint(id = "user-logging-status")
@Component
public class UserLoggingStatusMonitoring {

    public static Map<String, String> info = new HashMap<>();

    /**
     * @return a map of information that contain user logging status and username and whatever we need to show ...
     */
    @ReadOperation
    public static Map<String, String> getUserLoggingInfo() {
        info.put("userName", "mahdi");
        info.put("status", "log in");
        return info;
    }
}
