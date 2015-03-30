
public class Professor {

	private String name;
	private Lecture lecture;
	
	public Professor(){
	}
	public Professor(String name){
		this.setName(name);
	}
	public void addLecture(Lecture lecture) {
		this.lecture = lecture;	
	}
	public void showLecture() {
		// TODO Auto-generated method stub
		System.out.println(lecture.getName());
		System.out.println(lecture.getStudent().getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}