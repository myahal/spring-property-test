package com.myahal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropsController {
    @Autowired
    PropsService service;

    @RequestMapping(value = "/props", method = RequestMethod.GET)
    public String props() {
        return service.getAppName();
    }
}
