import java.text.DecimalFormat;
import java.util.Scanner;
class Student{
	private String studentNumber = null;
	private String studentName = null;
	private int markForMaths = -1;
	private int markForEnglish = -1;
	private int markForScience = -1;
	
	public Student(String number, String name) {
		this.studentNumber = number;
		this.studentName = name;
	}
	public Student() {
		
	}
	public String getNumber() {
		return this.studentNumber;
	}
	public String getName() {
		return this.studentName;
	}
	public void enterMarks(int markForMaths, int markForEnglish, int markForScience) {
		this.markForMaths = markForMaths;
		this.markForEnglish = markForEnglish;
		this.markForScience = markForScience;
	}
	public int getMathsMark() {
		return this.markForMaths;
	}
	
	public int getEnglishMark() {
		return this.markForEnglish;
	}
	public int getScienceMark() {
		return this.markForScience;
	}
	public double calculateAverage() {
		return (this.markForEnglish + this.markForMaths + this.markForScience)/3.0;
		
	}
	@Override
	public String toString() {
		String info = new String();
		info += "Student Info:\n";
		info += "Number:" + getNumber() + "\n";
		info += "Name:" + getName() + "\n";
		info += "Math:" + getMathsMark() + "\n";
		info += "English:" + getEnglishMark() + "\n";
		info += "Science:" + getScienceMark() + "\n";
		DecimalFormat decimalFormat = new DecimalFormat(".00");
		info += "Ave:" + decimalFormat.format(calculateAverage());
		
		return info;
	}
}
public class StudentTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
		String Number = inScanner.next();
		String Name = inScanner.next();
		int Math = inScanner.nextInt();
		int Eng = inScanner.nextInt();
		int Sci = inScanner.nextInt();
		Student student = new Student(Number, Name);
		student.enterMarks(Math, Eng, Sci);
		System.out.println(student);
	}

}

