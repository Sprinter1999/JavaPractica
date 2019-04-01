package skr3;

public class BuyChick {
public static void main(String[] args)
{
	int x,y,z;
	for(x=0;x<=17;x++)
	{
		for(y=0;y<=33;y++)
		{
			for(z=0;z<=100;z+=3)
			{
				if((5*x+3*y+z/3)==100&&(x+y+z==100))
					System.out.format("Cock:%d,Hen:%d,Chicken:%d\n",x,y,z);
			}
		}
	}
}
}
