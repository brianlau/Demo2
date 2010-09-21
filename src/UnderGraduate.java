
public class UnderGraduate extends Student {

	public UnderGraduate(String studentName) {
		super(studentName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String computeGrade(double score) {
		if(score >= 60.0)
			return "Pass";
		else{
			return "Fail";
		}

	}

}
