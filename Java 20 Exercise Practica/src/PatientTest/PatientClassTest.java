package PatientTest;

public class PatientClassTest {
	public static void main(String[] args)
	{
		Patient april=new Patient();
		april.setName("ZhangLi");
		april.setSex('f');
		april.setAge(33);
		april.setWeight(154.72f);
		april.setAllergies(true);
		System.out.print(april);
		
	}
}
class Patient
{
	private String name;
	private char sex;
	private int age;
	private float weight;
	private boolean allergies;
	//调用eclipseのsetter and getter按钮
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public boolean isAllergies() {
		return allergies;
	}
	public void setAllergies(boolean allergies) {
		this.allergies = allergies;
	}
	
	@Override
	public String toString()
	{
		String infoString=new String();
		infoString +="Name:"+getName()+"\n";
		infoString +="Age:"+getAge()+"\n";
		infoString +="Sex:"+getSex()+"\n";
		infoString +="isAllergic?:"+isAllergies()+"\n";
		return infoString;
	}
}