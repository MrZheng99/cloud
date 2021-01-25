package com.zj.nacos.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zj
 * @date 2021/1/24 15:47
 */
@Api(tags = "配置中心测试")
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${test.db-name}")
    private String dbName;
    @GetMapping("/dbName")
    @ApiOperation("获取dbName")
    public String getDbName() {
        return dbName;
    }
}
