package StudentTest;

/*
 * @第四题有五个小问，都集成在这份代码里面了
 */
public class StudentTest {
	public static void main(String args[]){
		Student[] students=new Student[5];
		for(int i=0;i<3;i++)
		{
			Student tempStudent=new Student("00"+String.valueOf(i),"A simple one",66f,77f,88f);
			students[i]=tempStudent;
		}
		students[3]=new StudentXW("00"+String.valueOf(3),"jyc",77f,77f,77f,"学习委员");
		students[4]=new StudentBZ("00"+String.valueOf(4),"zyf",88f,88f,88,"班长");
		for(int i=0;i<5;i++)
		{
			String infoString="id:"+students[i].getid()+"   ";
			infoString+=students[i].testScore();
			System.out.println(students[i].getClass()+"  "+infoString);
		}
	}
}

class Student{
	String id;
	String name;
	float scoreOfenglish;
	float scoreOfmath;
	float scoreOfcomputer;
	float scoreOfsum;

//构造方法
	public Student(){
	}
	public Student(String aid,String aname,float ascoreOfenglish,float ascoreOfmath,float ascoreOfcomputer){
		this.id=aid;
		this.name=aname;
		this.scoreOfenglish=ascoreOfenglish;
		this.scoreOfmath=ascoreOfmath;
		this.scoreOfcomputer=ascoreOfcomputer;
		//this.scoreOfsum=ascoreOfenglish+ascoreOfmath+ascoreOfcomputer;
		this.scoreOfsum=sum();
	}
	
	//sum方法
	public float sum(){
		this.scoreOfsum=scoreOfcomputer+scoreOfenglish+
				scoreOfmath;
		return(this.scoreOfenglish+this.scoreOfmath+this.scoreOfcomputer);
	}
	//testScore测评成绩/平均分
	public float testScore(){
		return(this.scoreOfsum/3);
	}

	//6个get方法 
	public String getid(){
		return(id);
	}
	public String getname(){
		return(name);
	}
	public float getscoreOfenglish(){
		return(scoreOfenglish);
	}
	public float getscoreOfmath(){
		return(scoreOfmath);
	}
	public float getscoreOfcomputer(){
		return(scoreOfcomputer);
	}
	public float getscoreOfsum(){
		return(scoreOfsum);
	}

	//5个set方法
	public void setid(String newid){
		this.id=newid;
	}
	public void setname(String newname){
		this.name=newname;
	}
	public void setscoreOfenglish(float newscoreOfenglish){
		this.scoreOfenglish=newscoreOfenglish;
		this.scoreOfsum=sum();
	}
	public void setscoreOfmath(float newscoreOfmath){
		this.scoreOfmath=newscoreOfmath;
		this.scoreOfsum=sum();
	}
	public void setscoreOfcomputer(float newscoreOfcomputer){
		this.scoreOfcomputer=newscoreOfcomputer;
		this.scoreOfsum=sum();
	}	
	//toString方法
	public String toString(){
		return("学号："+this.id+"\n姓名："+name+"\n英语："+this.scoreOfenglish+"\n数学："+this.scoreOfmath+"\n计算机："+this.scoreOfcomputer+"\n总分："+this.scoreOfsum);
	}

	//compare方法/比较2学生总分
	public void compare(Student x){
		if(this.getscoreOfsum()>x.getscoreOfsum())System.out.println(this.getname()+"总分大于"+x.getname());
		if(this.getscoreOfsum()<x.getscoreOfsum())System.out.println(this.getname()+"总分小于"+x.getname());
		else System.out.println(this.getname()+"总分等于"+x.getname());
	}
		
	public boolean equals(Student x)
	{
		if(this.id==x.getid())
			return true;
		else {
			return false;
		}
	}


}
class StudentXW extends Student{
	String responsibility;

//构造方法
	public StudentXW(){
		super();
		responsibility="";
	}
	public StudentXW(String aid,String aname,float ascoreOfenglish,float ascoreOfmath,float ascoreOfcomputer,String aresponsibility){
		super(aid,aname,ascoreOfenglish,ascoreOfmath,ascoreOfcomputer);
		responsibility=aresponsibility;
	}
	
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	//testScore测评成绩/平均分
	public float testScore(){
		return(this.scoreOfsum/3+3);
	}
	
	//toString方法
	public String toString(){
		return("学号："+this.id+"\n姓名："+name+"\n英语："+this.scoreOfenglish+"\n数学："+this.scoreOfmath+"\n计算机："+this.scoreOfcomputer+"\n总分："+this.scoreOfsum+"\n职位："+this.responsibility);
}
}
class StudentBZ extends Student
{
	private String responsibilityString;
	public StudentBZ(String aid,String aname,float ascoreOfenglish,float ascoreOfmath,float ascoreOfcomputer,String aresponsibility){
		super(aid,aname,ascoreOfenglish,ascoreOfmath,ascoreOfcomputer);
		//super();//继承super类的有参数构造函数
		this.responsibilityString=aresponsibility;
	}
	
	public String getResponsibilityString() {
		return responsibilityString;
	}

	public void setResponsibilityString(String responsibilityString) {
		this.responsibilityString = responsibilityString;
	}
	@Override
	public float testScore()
	{
		float score;
		score=this.scoreOfsum/3+5;
		return score;
	}
}
