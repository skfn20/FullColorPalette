package hashmap;

import java.util.HashMap;
import java.util.Iterator;

class Member{
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
		this.setMemberName(memberName);
		this.setMemberID(memberID);
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
}

public class MemberhashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberhashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}

}
