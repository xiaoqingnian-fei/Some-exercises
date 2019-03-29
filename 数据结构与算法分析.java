//习题1.5  编写一种递归方法实现数N的二进制中的'1'的个数
import java.util.Scanner;

public class B {
	public static void printOut(int n){     //递归实现单个输出整数
		if(n>=10) {
			printOut(n/10);
		}
		System.out.println(n%10);
	}
	public static int f(int n) {            //递归实现找数N二进制中'1'的个数
		if(n==0) {
			return 0;
		}
		if(n%2==0) {
			return f(n/2);
		}
		else {
			return f(n/2)+1;
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		printOut(n);
		f(n);
		System.out.println(f(n));
	}

}
