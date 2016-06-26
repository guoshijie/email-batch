package com.base.controller;

import com.base.common.AbstractBaseController;
import com.base.common.ErrorMessage;
import com.base.common.IRestMessage;
import com.base.orm.mybatis.bean.User;
import com.base.service.UserService;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by guoshijie on 16/1/21.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends AbstractBaseController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    /**
     * 查询用户
     * @return
     */
    @RequestMapping(value = "/getU")
    @ResponseBody
    public IRestMessage getU(String userId){
        IRestMessage msg = getRestMessageWithoutUser();
        try {
            Map map = (Map) userService.getUserById(Integer.parseInt(userId));
            msg.setCode(ErrorMessage.SUCCESS.getCode());
            msg.setResult(map);
            logger.info("The userId is:"+userId);
        } catch (Exception e) {
            logger.error("查询失败==>" + ExceptionUtils.getStackTrace(e));
        }
        return msg;
    }
}
