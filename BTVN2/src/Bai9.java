import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so  a :");
		int a=sc.nextInt();
		System.out.println("Nhap so  b :");
		int b=sc.nextInt();
		if(a==0)
		{
			if(b!=0)System.out.println("Phương trình vô nghiệm");
			if(b==0)System.out.println("Phương trình vô số nghiệm");
		}
		if(a!=0)
		{
			System.out.println("phương trình có nghiệm : "+(float)-b/a);
		}

	}

}
