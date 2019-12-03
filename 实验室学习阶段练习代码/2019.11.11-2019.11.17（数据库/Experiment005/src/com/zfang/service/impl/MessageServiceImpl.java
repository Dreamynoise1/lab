package com.zfang.service.impl;

import java.util.List;

import com.zfang.dao.MessageDao;
import com.zfang.dao.impl.MessageDaoImpl;
import com.zfang.entity.Message;
import com.zfang.service.MessageService;

public class MessageServiceImpl implements MessageService{
	private MessageDao messageDao = new MessageDaoImpl();
	@Override
	public List<Message> findLastFive() {
		// TODO Auto-generated method stub
		return messageDao.findLastFive();
	}

}
