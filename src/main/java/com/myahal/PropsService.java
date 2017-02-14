package com.myahal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropsService {
    @Autowired
    PropsConfig propsConfig;

    public String getAppName() {
        return propsConfig.getName();
    }

    public String getComment() {
        return propsConfig.getComment();
    }
}
