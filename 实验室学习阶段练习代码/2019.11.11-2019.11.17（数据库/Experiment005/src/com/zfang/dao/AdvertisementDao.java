package com.zfang.dao;

import java.util.List;

import com.zfang.entity.Advertisement;

public interface AdvertisementDao{
	List<Advertisement> findTopFive();
	//获取上一条记录
	Advertisement getUp(Long id);
	//获取下一条记录
	Advertisement getDown(Long id);
}
