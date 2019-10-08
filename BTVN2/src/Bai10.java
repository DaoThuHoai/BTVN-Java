import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so  a :");
		float a=sc.nextFloat();
		System.out.println("Nhap so  b :");
		float b=sc.nextFloat();
		System.out.println("Nhap so  c :");
		float c=sc.nextFloat();
		if(a==0)
	    {
	        if(b==0)
	            {
	                if(c==0)
	                {
	                	System.out.println("Phương trình vô số nghiệm");
	                }
	                
	                else
	                {
	                	System.out.println("Phương trình vô nghiệm");
	                }
	            }
	        else
	            System.out.println("Phuong trinh co nghiem duy nhat la: " +(float)-c/b);
	    }
	    else
	    {
	    	float d;
	        d=b*b-4*a*c;
	        if (d<0)
	            System.out.println("Phương trình vô nghiệm");
	        else if (d==0)
	            System.out.println("Phương trình có nghiệm kép "+ -b/(2*a));
	        else
	            System.out.println("Phuong trinh co 2 nghiem phan biet la: x1 = " + (-b+Math.sqrt(d))/(2*a) + "và x2 = " + (-b-Math.sqrt(d))/(2*a));    

	}

}