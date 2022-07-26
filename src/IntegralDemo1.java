
public class IntegralDemo1 {
	public static void main(String[] args) {
		//byte age = 26;  //26은 4byte이나 앞에 의미없는 0000000의 3byte를 없애버려서 1byte에 기입해도 에러가 나지않는다
		//short age = 32768; //short -32768 ~ 32767까지 이기에 32768의 숫자를 대입하게 되면 에러가 발생함
		byte a = 5;
		byte b = 9;
		//byte sum = a + b; //에러 : Type mismatch: cannot convert from int to byte , byte는 2항연산을 할 수 없다(+,-,x 등)
		int sum = a + b; //byte sum = (byte)(a+b); < 강제로 바이트로 변경하여 사용할 수는 있다.
		long money = 1_000_000_000_000L; //마지막에 L을 붙혀서 21억 이상의 숫자를 다룰수있다 Long, _는 숫자의 , 와 같은 의미이다(JAVA에서 _도 정수형으로 취급한다)
		
		
		
}
}