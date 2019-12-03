package com.zfang.dao;

import java.util.List;

import com.zfang.entity.News;

public interface NewsDao{
	//查询最新的五条记录
	List<News> findLastFive(int i);
}
