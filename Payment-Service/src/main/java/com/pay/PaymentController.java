package com.pay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PaymentController {

    @Value("${organization.name}")
    private String organizationName;
    @Value("${service.welcome.message}")
    private String welcomeMessage;



    @GetMapping("/")
    public String getPayment() {
        return (organizationName + " **** " + welcomeMessage);
    }
}
