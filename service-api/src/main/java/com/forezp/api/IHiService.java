package com.forezp.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 肖建伟 on 2017/11/11.
 */
@FeignClient(value = "service-hi")
@RestController("ad")
public interface IHiService {

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
     String sayHi(@PathVariable(value = "name") String name);

}
