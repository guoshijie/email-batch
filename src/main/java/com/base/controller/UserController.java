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
            msg.setCode(ErrorMessage.SUCCESS.getCode());
            msg.setResult(userId);
            logger.info("The userId is:"+userId);
        } catch (Exception e) {
            logger.error("后台管理用户删除失败==>" + ExceptionUtils.getStackTrace(e));
        }
        return msg;
    }

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public IRestMessage getUser(String userId){
        IRestMessage msg = getRestMessageWithoutUser();
        try {
            logger.info("The userId is:"+userId);
            User user = userService.getUserById(userId);
            msg.setCode(ErrorMessage.SUCCESS.getCode());
            msg.setResult(user);
        } catch (Exception e) {
            logger.error("后台管理用户删除失败==>" + ExceptionUtils.getStackTrace(e));
        }
        return msg;
    }

}
