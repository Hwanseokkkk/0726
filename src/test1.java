
public class test1 {
   public static void main(String[] args) {
	  Student1 jimin = new Student1();
	  jimin.name = "박지민"; //
	  jimin.hakbun = "2022-005";
	  jimin.kor = 90;
	  jimin.eng = 100;
	  jimin.mat = 85;
	  
	  System.out.println("학번 : " + jimin.hakbun);
	  System.out.println("이름 : " + jimin.name);
	  System.out.println("국어 : " + jimin.kor);
	  System.out.println("영어 : " + jimin.eng);
      System.out.println("수학 : " + jimin.mat);
      
      
      int total = jimin.kor + jimin.eng + jimin.mat;
     System.out.println("총점 : " + total);
     
      double avg = total / 3. ; 
      System.out.printf("평균 : %.2f\n", avg);
			  
  }
}

class Student1{
	String name;
	String hakbun;
	int kor;
	int eng;
	int mat;
	
}
