package com.zhang.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zhang.entity.Product;
import com.zhang.util.DBUtil;
import com.zhang.util.DbcpConnection;

public class ConnectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setId(19);
		p.setName("jinsha");
		p.setPrice(23);
		saveProduct(p);
//		deleteProductById(19);
//		updateProduct(p);
	}
private static void updateProduct(Product p) {
		// TODO Auto-generated method stub
	Connection conn = DBUtil.getConnection();
	PreparedStatement ps=null;
	try {
		ps = conn.prepareStatement("update product set name=?,price=? where id = ?");
		ps.setString(1, p.getName());
		ps.setInt(2, p.getPrice());
		ps.setInt(3, p.getId());
		int rs = ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
/*删除数据*/
	private static void deleteProductById(int id) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement("delete from product where id=?");
			ps.setInt(1, id);
			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/*添加数据*/
	private static void saveProduct(Product p) {
		// TODO Auto-generated method stub
		Connection conn = DbcpConnection.getConnection();
		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement("insert into product(id,name,price) values(?,?,?)");
			ps.setInt(1, p.getId());
			ps.setString(2, p.getName());
			ps.setInt(3, p.getPrice());
			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
