package com.zfang.service;

import java.util.List;

import com.zfang.entity.News;
import com.zfang.param.SplitBean;

public interface NewsService{
	//根据type类型，来查询相应的列表
	List<News> findAll(int type);
	List<News> findSinglePage(int type,SplitBean splitBean);
	//查询最新的五条记录
	List<News> findLastFive(int i);
	//查询上一条记录
	News getPrevious(Long id, int type);
	//查询下一条记录
	News getNext(Long id, int type);
}
