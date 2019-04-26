package ComplexTest;

public class ComplexTest {
	public static void main(String[] args) 
	{
		Complex A=new Complex(1,2);
		Complex B=new Complex(3,4);
		Complex C=A.plus(B);
		System.out.print(C);
		Complex D=A.minus(B);
		System.out.print(D);
		Complex E=A.multiply(B);
		System.out.print(E);
	}
}
class Complex
{
	private int real;
	private int imag;
	public Complex()
	{
		//Nein actual content,just void
	}
	public Complex(int real,int imag) {
		// TODO Auto-generated constructor stub
		this.real=real;
		this.imag=imag;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	public Complex plus(Complex comp)
	{
		Complex resultComplex=new Complex();
		resultComplex.setReal(comp.getReal()+this.real);
		resultComplex.setImag(comp.getImag()+this.imag);
		return resultComplex;
	}
	public Complex minus(Complex comp)
	{
		Complex resultComplex=new Complex();
		resultComplex.setReal(comp.getReal()-this.real);
		resultComplex.setImag(comp.getImag()-this.imag);
		return resultComplex;
	}
	public Complex multiply(Complex comp)
	{
		Complex resultComplex=new Complex();
		resultComplex.setReal(comp.getReal()*this.real-
				comp.getImag()*this.imag);
		resultComplex.setImag(comp.getImag()*this.real+comp.getReal()
				*this.imag);
		return resultComplex;
	}
	@Override
	public String toString()
	{
		String infoString=new String();
		infoString+=getReal()+"+"+getImag()+"i"+"\n";
		return infoString;
	}
}