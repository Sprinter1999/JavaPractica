import java.text.DecimalFormat;
import java.util.Scanner;



class ScoreException extends Exception{}
class StudentNumberException extends Exception{}
public class StudentTest {

	public static void main(String[] args) {
		String name,id;
        int math,english,science;
        Scanner cin =new Scanner(System.in);
        Student aStu=new Student();

        try{
            id=cin.next();
            name=cin.next();
            math=cin.nextInt();
            english=cin.nextInt();
            science=cin.nextInt();
            aStu=new Student(id,name);//
            aStu.enterMarks(math,english,science);//
            System.out.println(aStu);
        }
        catch (StudentNumberException e)
        {
            System.out.println("Illegal number format");
            //System.exit(0);
        }
		catch (ScoreException e)
		{
		    System.out.println("Illegal score format");
		    //System.exit(0);
		}
               
            
        
	}

}
class Student{
	private String studentNumber = null;
	private String studentName = null;
	private int markForMaths = -1;
	private int markForEnglish = -1;
	private int markForScience = -1;
	
    static private final int maxk = 100;
    static private final int mink = 0;
    
	public Student(String number, String name) throws StudentNumberException{
		//this.studentNumber = number;
		this.studentName = name;
		
        if ('2' != number.charAt(0) || '0' != number.charAt(1) || 10 != number.length())
            throw new StudentNumberException();
        for (int i = 2; i < number.length() ; i++)
            if (!Character.isDigit(number.charAt(i)))
                throw new StudentNumberException();
        
        this.studentNumber=number;
	}
	public Student() {
		
	}
	public String getNumber() {
		return this.studentNumber;
	}
	public String getName() {
		return this.studentName;
	}
	void enterMarks(int markForMaths,int markForEnglish,int markForScience)throws ScoreException{
        if(markForMaths >maxk || markForMaths <mink || markForEnglish > maxk || markForEnglish < mink || markForScience > maxk || markForScience < mink)
            throw new ScoreException();
        else{
            this.markForMaths=markForMaths;
            this.markForEnglish=markForEnglish;
            this.markForScience=markForScience;
        }
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
	public String toString() 
	{
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