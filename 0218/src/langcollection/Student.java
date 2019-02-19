package langcollection;

public class Student {
	private String studentName;
	private String studentId;
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof Student) {
			Student ms = (Student)obj;
			if(this.studentName.equals(ms.studentName))
				return true;
			else 
				return false;
		}
		
		return false;
	}

}
