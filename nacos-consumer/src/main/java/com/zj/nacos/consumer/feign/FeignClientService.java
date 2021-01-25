package com.zj.nacos.consumer.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zj
 * @date 2021/1/25 9:40
 */
@FeignClient(name = "nacos-config-test")
public interface FeignClientService  {
        /**
         * 测试feign
         * @param name 测试
         * @return 回显字符串
         */
        @GetMapping("/config/discovery/{name}")
        String test(@PathVariable String name);
}
