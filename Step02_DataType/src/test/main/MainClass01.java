package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작");
		/*정수형: byte,short,int,long */
		/*실수형: float,double */
		byte iByte=10;
		short iShort=10;
		int iInt=10;
		long iLong=10;
		
		int tmp=iByte;
		
		
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3;  // d,f를 뒤에 붙이지 않으면 자동으로 double형으로 간주
		
		
		byte tmp2=(byte)iInt;
		System.out.println("main 메소드가 종료");
		
	}
}
