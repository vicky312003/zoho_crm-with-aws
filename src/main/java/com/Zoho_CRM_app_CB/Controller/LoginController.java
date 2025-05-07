package com.Zoho_CRM_app_CB.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";  // This refers to /WEB-INF/jsps/login.jsp
    }
}
