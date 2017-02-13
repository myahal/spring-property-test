package com.myahal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
//@SpringBootTest(properties = "app.name=test-props-test")
public class PropsServiceTest {
    @Autowired
    PropsService service;

    @Test
    public void test_getAppName() {
        assertThat(service.getAppName()).isEqualTo("test-props-test");
    }

    @Test
    public void test_getComment() {
        assertThat(service.getComment()).isEqualTo("this is test");
    }
}
