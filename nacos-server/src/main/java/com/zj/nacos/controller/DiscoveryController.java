package com.zj.nacos.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author zj
 * @date 2021/1/25 9:06
 */
@RestController
@RequestMapping("/discovery")
@Api(tags = "服务注册发现")
public class DiscoveryController {
    /**
     *     回显服务
     */
    @ApiOperation("回显测试")
    @GetMapping("/{string}")
    public String test(@PathVariable String string) {
        return "echo: " + string;
    }
}