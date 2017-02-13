package com.myahal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropsService {
    @Value("${app.name}")
    private String appName;

    @Value("${app.comment}")
    private String appComment;

    public String getAppName() {
        return appName;
    }

    public String getComment() {
        return appComment;
    }
}
