import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so  n :");
		int n=sc.nextInt();
		System.out.println("Nhap so  m :");
		int m=sc.nextInt();
		if(n>m)
		{
		System.out.println("Max :" +n);
		System.out.println("Min : "+m);
		}
		else
		{
		System.out.println("Max :" +m);
		System.out.println("Min : "+n);
		}
	}

}
