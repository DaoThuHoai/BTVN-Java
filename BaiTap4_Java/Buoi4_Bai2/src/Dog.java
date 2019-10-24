import java.util.Scanner;

public class Dog {
	public static final String In = null;
	private String name;
	private int MP=100;
	Scanner sc=new Scanner(System.in);
	public void InputName(String name) {
		this.name=name;
	}
	public void ShowMP() {
		System.out.println(MP);
	}
	public void Bark () {
		System.out.println(name +" sủa sủa");
		MP=MP-20;
	}

}
