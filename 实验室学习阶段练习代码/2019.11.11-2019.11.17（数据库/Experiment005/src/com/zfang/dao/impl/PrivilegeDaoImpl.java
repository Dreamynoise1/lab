package com.zfang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zfang.dao.PrivilegeDao;
import com.zfang.entity.User;
import com.zfang.utils.JdbcUtil;

public class PrivilegeDaoImpl implements PrivilegeDao{
	
	@Override
	public List<String> getAllPrivilegeUrls() {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        List<String> privilegeUrls = new ArrayList<>();
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "SELECT DISTINCT p.url FROM Privilege p WHERE p.url IS NOT NULL";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
            	privilegeUrls.add(rs.getString("url"));
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return privilegeUrls;
	}

	@Override
	public List<String> getUserPrivilegeUrls(User user) {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        List<String> privilegeUrls = new ArrayList<>();
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "SELECT DISTINCT p.url FROM Privilege p join User u on u.role_id = p.roleId where u.id = ?";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            st.setLong(1, user.getId());
            rs = st.executeQuery();
            while(rs.next()) {
            	privilegeUrls.add(rs.getString("url"));
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return privilegeUrls;
	}

}
