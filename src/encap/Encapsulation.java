package encap;

public class Encapsulation {

	private int student_roll_nu;
	public int getStudent_roll_nu() {
		return student_roll_nu;
	}
	public void setstudent_roll_nu(int student_roll_nu) {
		this.student_roll_nu = student_roll_nu;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentsbranch() {
		return studentsbranch;
	}
	public void setStudentsbranch(String studentsbranch) {
		this.studentsbranch = studentsbranch;
	}
	public int getStudentsmarks() {
		return studentsmarks;
	}
	public void setstudentsmarks (int studentsmarks) {
		this.studentsmarks = studentsmarks;
	}
	private String studentname;
	private String studentsbranch;
	private int studentsmarks;
}
