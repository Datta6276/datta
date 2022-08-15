package encap;

public class Result extends Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Result  ab = new Result();
		ab.setstudent_roll_nu(930);
		ab.setStudentname("Datta");
         ab.setStudentsbranch("Science");
         ab.setstudentsmarks(86);
         
         
         System.out.println(ab.getStudent_roll_nu());
         System.out.println(ab.getStudentname());
         System.out.println(ab.getStudentsbranch());
         System.out.println(ab.getStudentsmarks());
	}

}
