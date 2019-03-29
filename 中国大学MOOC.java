//翁恺 面向程序设计第一周编程练习
import java.util.Scanner;

class Fraction{
	int a;
	int b;
	public Fraction(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void print() {
		int max;
		int min;
		if(a<b) {		//求最大公约数，辗转相除法。
			min=a;
			max=b;
		}
		else {
			min=b;
			max=a;
		}
		while(min!=0) {
			int r=max%min;
			max=min;
			min=r;
		}
		a=a/max;
		b=b/max;
		if(a==b) {
			System.out.println(1);
		}
		else {
			System.out.println(a+"/"+b);
		}
	}
	public Fraction plus(Fraction r) {
		Fraction c=new Fraction(0, 1);        //类对象可以看成是管理者，如果c=b的话，c会指向b所管理的单元；
		int x=a*r.b+r.a*b;                    //所以需要新增一个类对象来返回，不然类对象b的内容也会跟着被修改。
		int y=b*r.b;                          //注意！类对象如果是null的话，使用这个类对象会报错！
		c.a=x;
		c.b=y;
		return c;
	}
	public Fraction multiply(Fraction r) {
		Fraction c=new Fraction(0, 1);
		int x=a*r.a;
		int y=b*r.b;
		c.a=x;
		c.b=y;
		return c;
	}
	public double toDouble() {
		double d=a/b;
		return d;
	}
	
}
public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}
