public class Main {

	public static void main(String[] args) {
			Instructor instructor = new Instructor();
			instructor.id= 1 ;
			instructor.name= "Engin";
			instructor.sorName= "Demirog";
			instructor.lesson= "Java";
			instructor.category="Programlama";
			
			
			Student student = new Student();
			student.id=10;
			student.name="Hilal";
			student.sorName="Kömerik";
			student.lesson="Java";
			student.viewRate=57;
			
			
			InstructorManager instructorManager = new InstructorManager();
			instructorManager.bulkMessage(instructor);
			instructorManager.update(instructor);
			
			StudentManager studentManager = new StudentManager();
			studentManager.bulkMessage(student);
			studentManager.deletion(student);

	}

}
