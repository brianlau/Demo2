
public abstract class Student {
	String name;
	
		public Student(String studentName){
			name = studentName;
		}

		public String getName(){
			return name;
		}
		
		public abstract String computeGrade(double score);
}
