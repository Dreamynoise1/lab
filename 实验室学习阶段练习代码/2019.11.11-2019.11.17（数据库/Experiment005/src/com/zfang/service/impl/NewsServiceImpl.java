package com.zfang.service.impl;

import java.util.List;

import com.zfang.dao.NewsDao;
import com.zfang.dao.impl.NewsDaoImpl;
import com.zfang.entity.News;
import com.zfang.param.SplitBean;
import com.zfang.service.NewsService;

public class NewsServiceImpl implements NewsService{
	private NewsDao newsDao = new NewsDaoImpl();
	@Override
	public List<News> findAll(int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findSinglePage(int type, SplitBean splitBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findLastFive(int type) {
		// TODO Auto-generated method stub
		return newsDao.findLastFive(type);
	}

	@Override
	public News getPrevious(Long id, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public News getNext(Long id, int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
