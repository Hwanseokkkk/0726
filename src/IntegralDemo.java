
public class IntegralDemo {
   public static void main(String[] args) {
	  System.out.printf("255의 10진수 : %d\n", 255);
	  System.out.println("255의  2진수  : " + Integer.toBinaryString(255));  //b는 boolean(참, 거짓)의 약자
	  System.out.printf("255의  8진수  : %o%n", 255);
	  System.out.printf("255의 16진수 : %x\n", 255);      //진법 변화 코드
	  
	  System.out.println("---------------------------------------");
	  
	  System.out.printf("0b01110000의 10진수 : %d\n", 0b01110000);   //컴퓨터에게 2진수를 표현하려면 숫자(0)b를 붙혀야한다
	  System.out.println("0b01110000의  2진수  : " + Integer.toBinaryString(0b01110000)); 
	  System.out.printf("0b01110000의  8진수  : %o%n", 0b01110000);
	  System.out.printf("0b01110000의 16진수 : %x\n", 0b01110000);
	  
	  System.out.println("---------------------------------------");
	  
	  System.out.printf("056의 10진수 : %d\n", 056);   //컴퓨터에게 8진수를 표현하려면 숫자(0)을(옥타) 붙혀야한다
	  System.out.println("056의  2진수  : " + Integer.toBinaryString(056)); 
	  System.out.printf("056의  8진수  : %o%n", 056);
	  System.out.printf("056의 16진수 : %x\n", 056);  
	  
	  System.out.println("---------------------------------------");
	  
	  System.out.printf("0xAB의 10진수 : %d\n", 0xAB);   //컴퓨터에게 16진수를 표현하려면 숫자(0)x를 붙혀야한다
	  System.out.println("0xAB의  2진수  : " + Integer.toBinaryString(0xAB)); 
	  System.out.printf("0xAB의  8진수  : %o%n", 0xAB);
	  System.out.printf("0xAB의 16진수 : %x\n", 0xAB);  
	  
  }
}
