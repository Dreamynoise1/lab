package com.zfang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zfang.dao.NewsDao;
import com.zfang.entity.News;
import com.zfang.utils.JdbcUtil;

public class NewsDaoImpl implements NewsDao{

	@Override
	public List<News> findLastFive(int type) {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        List<News> news = new ArrayList<>();
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "SELECT * FROM News n WHERE n.type= ? ORDER BY n.publishTime DESC LIMIT 0,5";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            st.setInt(1, type);
            rs = st.executeQuery();
            while(rs.next()) {
            	News newSingle = new News();
            	newSingle.setId(rs.getLong("id"));
            	newSingle.setTitle(rs.getString("title"));
            	newSingle.setContent(rs.getString("content"));
            	newSingle.setPublishTime(rs.getDate("publishTime"));
            	newSingle.setType(rs.getInt("type"));
            	newSingle.setViewCount(rs.getInt("viewCount"));
            	news.add(newSingle);
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return news;
	}

}
