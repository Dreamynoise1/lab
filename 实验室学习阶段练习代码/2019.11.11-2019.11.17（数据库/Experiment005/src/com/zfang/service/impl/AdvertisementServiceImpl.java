package com.zfang.service.impl;

import java.util.List;

import com.zfang.dao.AdvertisementDao;
import com.zfang.dao.impl.AdvertisementDaoImpl;
import com.zfang.entity.Advertisement;
import com.zfang.service.AdvertisementService;

public class AdvertisementServiceImpl implements AdvertisementService{
	private AdvertisementDao advertisementDao = new AdvertisementDaoImpl();
	@Override
	public List<Advertisement> findTopFive() {
		return advertisementDao.findTopFive();
	}

	@Override
	public Advertisement getUp(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertisement getDown(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
