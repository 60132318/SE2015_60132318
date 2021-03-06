import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HacksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Professor professor = new Professor("choi");
		//Lecture lecture1 = new Lecture("소프트웨어 공학");
		
		@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		
		Professor professor = (Professor)factory.getBean("professor");
		Lecture lecture2 = (Lecture)factory.getBean("Lecture2");
		Student student = (Student)factory.getBean("student");
		
		professor.addLecture(lecture2);
		lecture2.addStudent(student);
		professor.showLecture();
	
	}

}
