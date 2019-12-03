package com.zfang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zfang.dao.MessageDao;
import com.zfang.entity.Message;
import com.zfang.utils.JdbcUtil;

public class MessageDaoImpl implements MessageDao{

	@Override
	public List<Message> findLastFive() {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        List<Message> messages = new ArrayList<>();
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "SELECT * FROM Message m ORDER BY m.publishTime DESC LIMIT 0,5";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
            	Message message = new Message();
            	message.setId(rs.getLong("id"));
            	message.setAgree(rs.getBoolean("agree"));
            	message.setAgreeCount(rs.getInt("agreeCount"));
            	message.setContent(rs.getString("content"));
            	message.setDisagreeCount(rs.getInt("disagreeCount"));
            	message.setPublishTime(rs.getDate("publishTime"));
            	messages.add(message);
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return messages;
	}

}
