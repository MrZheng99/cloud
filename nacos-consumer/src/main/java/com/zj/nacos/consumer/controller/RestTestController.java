package com.zj.nacos.consumer.controller;

import com.zj.nacos.consumer.config.RestTemplateConfig;
import com.zj.nacos.consumer.feign.FeignClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zj
 * @date 2021/1/25 9:31
 */
@Api(tags = "restTemplate远程调用其他服务")
@RestController
public class RestTestController {
    @Resource
    private RestTemplate restTemplate;

    @ApiOperation("调用")
    @GetMapping("/restTemplate/{name}")
    public String test(@PathVariable String name) {
        return restTemplate.getForObject("http://nacos-config-test/config/discovery/{1}",String.class,name);
    }
}
