package com.zj.nacos.consumer.fegin;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zj
 * @date 2021/1/25 9:40
 */
@FeignClient(name = "nacos-config-test")
public interface FeignClientService  {
        @GetMapping("/config/discovery/{name}")
        public String test(@PathVariable String name);
}
