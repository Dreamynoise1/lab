package com.zfang.service;

import java.util.List;

import com.zfang.entity.Message;

public interface MessageService{

	List<Message> findLastFive();
	
}
