package dao;

import java.util.List;
import repository.MemberBean_p;

public interface MemberDAO_p {
	public void insertMember(MemberBean_p member);
	public List<MemberBean_p> selectList();
	public List<MemberBean_p> selectBySome(String some);
	public MemberBean_p selectById(String id);
	public void updateMember(MemberBean_p member);
	public void deleteMember(MemberBean_p member);
	public int countMember();
}
