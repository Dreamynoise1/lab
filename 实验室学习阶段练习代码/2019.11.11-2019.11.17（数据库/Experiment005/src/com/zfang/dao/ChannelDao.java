package com.zfang.dao;

import java.util.List;

import com.zfang.entity.Channel;

public interface ChannelDao{
	List<Channel> findAll(int type);
}
