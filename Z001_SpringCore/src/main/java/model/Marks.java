package model;

public class Marks {
		
		String subjectname;
		int marks;
		public String getSubjectname() {
			return subjectname;
		}
		public void setSubjectname(String subjectname) {
			this.subjectname = subjectname;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
		public void display()
		{
			System.out.println(subjectname+" "+marks);
		}
}
