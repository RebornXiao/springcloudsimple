package com.forezp.web;

import com.forezp.api.IHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController("hi")
public class HiController {

    @Autowired
    IHiService iHiService;

    @RequestMapping(value = "hi/{name}",method = RequestMethod.GET)
    public String sayHi(@PathVariable String name){
        return iHiService.sayHi(name);
    }
}
