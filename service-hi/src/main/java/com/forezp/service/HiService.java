package com.forezp.service;

import com.forezp.api.IHiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 肖建伟 on 2017/11/11.
 */
@RestController("ad")
public class HiService implements IHiService {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @Override
    public String sayHi(@PathVariable String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
