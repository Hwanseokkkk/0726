
public class CharDemo {
   public static void main(String[] args) {
	  //char grade = 'B'; //홑따움표에는 단 한개의 글자만을 사용해야한다.
	  //System.out.println("grade = " + grade);
	  //char ch = '\n'; // \n은 escape(탈출문자)는 문자로 보지않는다. 두글자가 아닌 한글자로 인식한다.
	 //System.out.println("ch = " + ch);
	  //ch = 'C';
	  //System.out.println("ch = " + ch);
	  
	  
//	  System.out.printf("%c", 65); //A
//	  System.out.printf("%c", 65 + 1); //B
//	  System.out.printf("%c", '\n');
//	  char ch = 'C';
//	  System.out.printf("%c", ch); //C
//	  System.out.printf("%c", ch + 1); //D
//	  System.out.printf("%c", '\b'); // 백스페이스를 해라<<D아래에 커서가 올라가있음
//	  System.out.printf("%c", 'E'); //커서가 D에 있는 상태에서 E를 올리면 덮어진다.
	  char ch = '\uCAFE'; //유니코드 한글이므로 한글자이다. >>쫾
	  System.out.println("ch = " +ch);
}
}
