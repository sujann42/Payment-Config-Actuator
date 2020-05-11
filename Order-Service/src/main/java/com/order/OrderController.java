package com.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OrderController {

    //This @Value("${organization.name}") will fetch the value from
    // application.properties file to local variables
    @Value("${organization.name}")
    private String organizationName;
    @Value("${service.welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String getOrder() {
        return (organizationName + " **** " + welcomeMessage);
    }
}
