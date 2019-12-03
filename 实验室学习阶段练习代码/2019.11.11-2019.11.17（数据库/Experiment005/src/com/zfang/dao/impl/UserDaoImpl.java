package com.zfang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zfang.dao.UserDao;
import com.zfang.entity.Role;
import com.zfang.entity.User;
import com.zfang.utils.JdbcUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public User findUserByName(String username) {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        User user = null;
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "select * from user where loginName = ?";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            st.setString(1,username);
            rs = st.executeQuery();
            if(rs.next()) {
               user = new User();
               user.setId(rs.getLong("id"));
               user.setRoleId(rs.getLong("role_id"));
               user.setLoginName(rs.getString("username"));
               user.setPassword(rs.getString("password")); 
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return user;
	}

	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        User user = null;
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "select * from user where loginName = ? and password = ?";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            st.setString(1,username);
            st.setString(2,password);
            rs = st.executeQuery();
            if(rs.next()) {
               user = new User();
               user.setId(rs.getLong("id"));
               user.setRoleId(rs.getLong("role_id"));
               user.setLoginName(rs.getString("username"));
               user.setPassword(rs.getString("password")); 
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return user;
	}

	@Override
	public Role findRoleByUser(User user) {
		Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        Role role = null;
        
        try {
            // 获取连接
            conn = JdbcUtil.getConnection();
            // 编写sql
            String sql = "select * from role where id = ?";
            // 创建语句执行者
            st= conn.prepareStatement(sql);
            st.setLong(1,user.getRoleId());
            rs = st.executeQuery();
            if(rs.next()) {
            	role = new Role();
            	role.setId(rs.getLong("id"));
            	role.setName(rs.getString("name"));
            	role.setDescription(rs.getString("description")); 
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	JdbcUtil.colseResource(conn, st, rs);
        }
        return role;
	}
}
