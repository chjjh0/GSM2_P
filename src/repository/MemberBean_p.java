package repository;

import lombok.Data;

@Data
public class MemberBean_p {
	private String memId, teamId, name, age, roll, ssn, password, gender;

	@Override
	public String toString() {
		return "MemberBean_p [memId=" + memId + ", teamId=" + teamId + ", name=" + name + ", age=" + age + ", roll="
				+ roll + ", ssn=" + ssn + ", password=" + password + ", gender=" + gender + "]";
	}
	
	
}
