
public class FloatingDemo {
  public static void main(String[] args) {
	 double avg = 0.089555556789;
	 System.out.printf("avg = %f\n", avg); //%f를 사용하면 소수점 6자리까지 나온다.(소수점7번째자리에서 반올림한다)
	 System.out.println("avg = " +avg); //printf를 사용하지않으면 소수점 나오지않음.
	 System.out.printf("avg = %.2f\n", avg); // %뒤에 .2(원하는 소수점 수) 까지 나오게한다.
	 System.out.printf("avg = %e\n",avg); // +면 양수 -면 음수를 뜻함 -02는 10의-2승을 뜻함
	 
	 float f = 0.123456789123456789f;
	 double d = 0.123456789123456789;
	 System.out.println("f = " + f);
	 System.out.println("d = " + d);
	 
   }
}
