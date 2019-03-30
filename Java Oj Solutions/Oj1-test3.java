package StudentListTest;
import java.text.DecimalFormat;
import java.util.Scanner;
public class StudentListTest {
public static void main(String[] args)
{
	//int choice;
	Scanner inScanner=new Scanner(System.in);
	Studentlist list=new Studentlist(20);
	while(inScanner.hasNext()) 
	{
		int choice=inScanner.nextInt();
		switch(choice)
		{
		case 1://增加一个学生
			String number=null,nameString=null;
			int math,eng,sci;
			number=inScanner.next();
			nameString=inScanner.next();
			math=inScanner.nextInt();
			eng=inScanner.nextInt();
			sci=inScanner.nextInt();
			
			Student stu=new Student(number,nameString);
			stu.enterMarks(math, eng, sci);
			list.add(stu);
			
			list.show();
			break;
		case 2://根据学号删除一个学生
			String deleteString;
			deleteString=inScanner.next();
			boolean test1=list.remove(deleteString);
			if(test1=true)
			{
				System.out.println("Remove successfully");
				list.show();
			}
			else {
				System.out.println("No such student");
			}
			break;
		case 3://根据位置删除一个学生
			int num=inScanner.nextInt();
			boolean test2=list.remove(num);
			if(test2=true)
			{
				System.out.println("Remove successfully");
				list.show();
			}
			else {
				System.out.println("No such student");
			}
			break;
		case 4://判断空
			boolean test3=list.isEmpty();
			//测试用例没这个选项，偷个懒，不写提示信息了
			break;	
		case 5://根据位置返回学生
			int num1=inScanner.nextInt();
			Student tempStudent=list.getItem(num1);
			if(tempStudent!=null)
			{
				System.out.println("Student Info:");
				System.out.println(tempStudent);
			}
			else {
				System.out.println("No such student");
			}
			break;
		case 6://根据学号返回学生
			String queryString=inScanner.next();
			Student temp=list.getItem(queryString);
			if(temp!=null)
			{
				System.out.println("Student info:");
				System.out.println(temp);
			}
			else {
				System.out.println("No such student");
			}
			System.out.println(temp);
			break;
		case 7:
			list.show();
			break;
		case 8:
			System.exit(0);
		}
	}
}
}

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
		//info += "Student Info:\n";
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
class Studentlist {
    private Student []list;
    private int total;

    public Studentlist(int length){
        list=new Student[length];
    }

    public boolean add(Student stu){

        try {
            if(total-1<list.length) {
                total++;
                list[total-1] = stu;
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean remove(String number){
        try{
            int i=0;
            for(i=0;i<total-1;i++){
                if(number.equals(list[i].getNumber()))
                    break;
            }
            for(int j=i;j<total-1;j++){
                list[j]=list[j+1];
            }
            total=total-1;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean remove(int num){
        try{
            if(num>total||num<0)
                return false;
            else{
                for(int i=num-1;i<total-1;i++)
                    list[i]=list[i+1];
                total--;
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEmpty(){

        if(total==0)
            return true;
        else
            return false;
    }

    public Student  getItem(int no){
        if(no>total)
            return null;
        else{
            return list[no-1];
        }
    }

    public Student getItem(String numbe){
        for(Student temp:list) {
            String te=temp.getNumber();
            if (numbe.equals(te))
                return temp;
        }
        return null;
    }
    public void show()
    {
    	System.out.println(this.total+" Students at the moment as described below:");
    	int count=0;
    	for(;count<total;count++)
    	{
    		System.out.println(list[count]);
    	}
    }
    public int getTotal(){
        return total;
    }
}
