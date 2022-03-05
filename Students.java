package assignment4;

public class Students {

	
	/*  Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/
		public void getStudentInfo(int id)
		{
			System.out.println(id);
		}
		public void getStudentInfo(String name)
		{
			System.out.println(name);
		}
		public void getStudentInfo(char email)
		{
			System.out.println(email);
		}
		public void getStudentInfo(double mobilenumber)
		{
			System.out.println(mobilenumber);
		}
          public static void main(String[] args) {
        	  Students stud=new Students();
        	  stud.getStudentInfo(1018558964);
        	  stud.getStudentInfo("Arthi");
        	  stud.getStudentInfo("arthiarulk@gmail.com");
        	  stud.getStudentInfo("9566292468");
	}

}
