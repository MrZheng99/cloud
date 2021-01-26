package com.zj.nacos.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * restTemplate的配置类 通过负载均衡找到对应的服务的实际地址
 * 这样url中就不写服务的实际地址 可以写服务名
 * @author zj
 * @date 2021/1/26 9:22
 */

@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
