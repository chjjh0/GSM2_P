package service;

import java.util.List;
import repository.MemberBean_p;

public interface MemberService_p {
	public void createMember(MemberBean_p member);
	public List<MemberBean_p> findList();
	public List<MemberBean_p> findBySome(String some);
	public MemberBean_p findById(String id);
	public void updateMember(MemberBean_p member);
	public void deleteMember(MemberBean_p member);
	public int countMember();
}
