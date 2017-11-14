package com.forezp.service;

import com.forezp.api.IHiService;
import com.forezp.mapper.UserMapper;
import com.forezp.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 肖建伟 on 2017/11/11.
 */
@RestController("ad")
public class HiService implements IHiService {

    private final static Logger logger = LoggerFactory.getLogger(HiService.class);

    @Value("${server.port}")
    String port;

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @Override
    public String sayHi(@PathVariable String name) {
        User user = new User();
        user.setAge(1);
        user.setUserName(name);
         userMapper.insert(user);
        logger.info("-------------->id = " + user.getUserId());
        return "hi " + name + ",i am from port:" + port;
    }
}
