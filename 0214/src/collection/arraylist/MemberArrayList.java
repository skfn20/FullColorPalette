package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import colllection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		
		return false;
		
		/*
		 * iterator�� �̿��Ͽ� member arraylist�� ���� 
		 * set interface�� ���� ������ ���� ��쿡  �����ϴ�.
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberID();
			if(tempId == memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
		*/
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
