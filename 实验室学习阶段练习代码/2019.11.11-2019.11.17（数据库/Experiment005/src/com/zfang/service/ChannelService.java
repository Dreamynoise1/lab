package com.zfang.service;

import java.util.List;

import com.zfang.entity.Channel;

public interface ChannelService{
	List<Channel> findAll(int type);
}
