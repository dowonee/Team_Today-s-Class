package mypage_user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import customer.DBConnection;

public class Myclass_user_Dao {

	Connection conn = null; 
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 
	
	//수강중인 클래스 현황
	public ArrayList<Myclass_user> classlist_user(String id){
		ArrayList<Myclass_user> list = new ArrayList<Myclass_user>();
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			String sql = "";
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Myclass_user sl = new Myclass_user();
				sl.setClasscode(rs.getString("classcode"));
				sl.setNickname(rs.getString("nickname"));
				sl.setTitle(rs.getString("title"));
				sl.setPrice(rs.getString("price"));
				sl.setId(rs.getString("id"));
				sl.setProfile(rs.getString("profile"));
				list.add(sl);
			}
		} catch (SQLException e) {
			System.out.println("예외발생");
			e.printStackTrace();
		} finally{
			// DB 연결을 종료한다.
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return list;
	}
	
	//신청한 외주 현황
	
	
	
}
