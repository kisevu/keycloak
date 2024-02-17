package com.ameda.kisevu.keycloak.controller;/*
*
@author ameda
@project keycloak
@package com.ameda.kisevu.keycloak.controller
*
*/

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class someController {

    @GetMapping("/hello-user")
    @PreAuthorize("hasRole('client-user')")
    public String helloUser(){
        return "Hello from keycloak and spring boot user";
    }
    @GetMapping("/hello-admin")
    @PreAuthorize("hasRole('client-admin')")
    public String helloAdmin(){
        return "Hello from keycloak and spring boot admin";
    }
}
