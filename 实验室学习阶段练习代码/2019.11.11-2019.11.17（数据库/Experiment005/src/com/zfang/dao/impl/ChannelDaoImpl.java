package com.zfang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zfang.dao.ChannelDao;
import com.zfang.entity.Channel;
import com.zfang.utils.JdbcUtil;

public class ChannelDaoImpl implements ChannelDao{

	@Override
	public List<Channel> findAll(int type) {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        List<Channel> channels = new ArrayList<>();
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "SELECT * FROM Channel c WHERE c.type =?";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            st.setInt(1, type);
            rs = st.executeQuery();
            while(rs.next()) {
            	Channel channel = new Channel();
            	channel.setImageName(rs.getString("imageName"));
            	channel.setId(rs.getLong("id"));
            	channel.setPicUrl(rs.getString("picUrl"));
            	channel.setProfile(rs.getString("proFile"));
            	channel.setType(rs.getInt("type"));
            	channels.add(channel);
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return channels;
	}
}
