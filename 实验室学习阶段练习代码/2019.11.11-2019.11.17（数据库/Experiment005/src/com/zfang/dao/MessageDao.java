package com.zfang.dao;

import java.util.List;

import com.zfang.entity.Message;

public interface MessageDao {
	//查询最新5条留言
	List<Message> findLastFive();
}
