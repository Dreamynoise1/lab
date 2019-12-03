package com.zfang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zfang.dao.AdvertisementDao;
import com.zfang.entity.Advertisement;
import com.zfang.utils.JdbcUtil;

public class AdvertisementDaoImpl implements AdvertisementDao{

	@Override
	public List<Advertisement> findTopFive() {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        List<Advertisement> advertisements = new ArrayList<>();
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "SELECT * FROM Advertisement a ORDER BY a.position DESC LIMIT 0,5";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
            	Advertisement advertisement = new Advertisement();
            	advertisement.setId(rs.getLong("id"));
            	advertisement.setImageName(rs.getString("imageName"));
            	advertisement.setPicUrl(rs.getString("picUrl"));
            	advertisement.setPosition(rs.getInt("position"));
            	advertisement.setUrl(rs.getString("url"));
            	advertisement.setPublishTime(rs.getDate("publishTime"));
            	advertisements.add(advertisement);
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return advertisements;
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
