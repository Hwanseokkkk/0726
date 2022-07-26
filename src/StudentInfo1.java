import java.util.Scanner;
public class StudentInfo1 {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("귀하의 키는 ? ");
	 double height = sc.nextDouble();
	 
	 
	 System.out.println("귀하의 몸무게는 ? ");
	 double weight = sc.nextDouble();
	 
	 System.out.println("키와 몸무게 : " + height +"," + weight);
	 
	 System.out.println("귀하의 키는 ? ");
	 height = sc.nextDouble();
	 
	 
	 System.out.println("귀하의 몸무게는 ? ");
	 weight = sc.nextDouble(); 
	 //그때그때마다 바뀌는 변수 때문에 double을 지웠다.
	 
}
}
