package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import command.ListCommand_p;
import repository.MemberBean_p;

public class MemberDAOImpl_p implements MemberDAO_p{
	private static MemberDAO_p instance = new MemberDAOImpl_p();
	private MemberDAOImpl_p() {	}
	public static MemberDAO_p getInstance() {return instance;}

	@Override
	public void insertMember(MemberBean_p member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberBean_p> selectList() {
		MemberBean_p m = null;
		List<MemberBean_p> list = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"chjjh0",
					"c1c2");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					" SELECT * FROM MEMBER ");
			list = new ArrayList<>();
			while(rs.next()) {
				m = new MemberBean_p();
				m.setMemId(rs.getString("MEMID"));
				m.setTeamId(rs.getString("TEAMID"));
				m.setName(rs.getString("NAME"));
				m.setAge(rs.getString("AGE"));
				m.setRoll(rs.getString("ROLL"));
				list.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<MemberBean_p> selectBySome(String some) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean_p selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberBean_p member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean_p member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

}
