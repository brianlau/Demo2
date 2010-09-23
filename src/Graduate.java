// BLAAJAAHHAJA
public class Graduate extends Student{

	public Graduate(String studentName) {
		super(studentName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String computeGrade(double score) {
		if(score >= 70.0)
			return "Pass";
		else{
			return "Fail";
		}

	}

}
