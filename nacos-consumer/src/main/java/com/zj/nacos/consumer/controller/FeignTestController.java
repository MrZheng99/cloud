package com.zj.nacos.consumer.controller;

import com.zj.nacos.consumer.fegin.FeignClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zj
 * @date 2021/1/25 9:31
 */
@Api(tags = "feign远程调用其他服务")
@RestController
public class FeignTestController {
    @Autowired
    private FeignClientService remoteClient;
    @ApiOperation("调用")
    @GetMapping("/feign/{name}")
    public String test(@PathVariable String name) {
        return remoteClient.test(name);
    }
}
