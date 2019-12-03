package com.zfang.service.impl;

import java.util.List;

import com.zfang.dao.ChannelDao;
import com.zfang.dao.impl.ChannelDaoImpl;
import com.zfang.entity.Channel;
import com.zfang.service.ChannelService;

public class ChannelServiceImpl implements ChannelService{
	private ChannelDao channelDao = new ChannelDaoImpl();
	@Override
	public List<Channel> findAll(int type) {
		// TODO Auto-generated method stub
		return channelDao.findAll(type);
	}

}
