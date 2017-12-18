package com.hsy.springcloud.consumer.ribbon;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springboot.demo/com.hsy.springboot.demo.springboot.jdbc
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@SpringCloudApplication
public class SpringCloudConsumerRibbonApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudConsumerRibbonApplication.class)
                .web(true)
                .run(args)
                ;
    }
}
