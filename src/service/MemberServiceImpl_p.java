package service;

import java.util.List;
import dao.*;
import repository.MemberBean_p;

public class MemberServiceImpl_p implements MemberService_p{
	private static MemberService_p instance = new MemberServiceImpl_p();
	private MemberServiceImpl_p() {}
	public static MemberService_p getInstance() {return instance;}
	
	@Override
	public void createMember(MemberBean_p member) {
		
	}

	@Override
	public List<MemberBean_p> findList() {
		return MemberDAOImpl_p.getInstance().selectList();
	}

	@Override
	public List<MemberBean_p> findBySome(String some) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean_p findById(String id) {
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
