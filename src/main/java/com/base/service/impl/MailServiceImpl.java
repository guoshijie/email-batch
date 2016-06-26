package com.base.service.impl;

import com.base.service.MailService;
import com.base.utils.DateUtils;
import com.base.utils.MailUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.mail.Address;
import javax.mail.MessagingException;
import java.util.Date;

/** 
 * @ClassName MailServiceImpl 
 * @Description TODO
 * @author guoshijie 
 * @date 2015年10月14日 下午10:55:49  
 */
@Service
public class MailServiceImpl implements MailService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void sendMail(String fromAddr, String pwd, Address[] toAddr, Address[] ccAddr, String bccAddr, String title, String content) {
		try {
			MailUtils.sendMail(fromAddr, pwd, toAddr, ccAddr, bccAddr, title, content);
		} catch (MessagingException e) {
			logger.error(ExceptionUtils.getStackTrace(e));
		}
	}

	@Override
	public String getMailTitle() {
		String today = DateUtils.dateToString(new Date(), "yyyy年MM月dd日");
		return today+"评论占比统计";
	}

	@Override
	public String getMailContent() {
		return null;
	}
	
}
