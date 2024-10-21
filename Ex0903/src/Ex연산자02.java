import java.util.Scanner;

public class Ex연산자02 {

   public static void main(String[] args) {
      
      //대입연산자  =  , += , -= 
      int num = 10;
      //num +1 증가 시키고 싶습니다!
      num = num+1;
      num +=1;
      num++;
      num--;//-> num -=1//  num = num-1;
      
      //비교(크기)연산자 --> true or false
      //   >  <  >=  <=
      int data1 = 10;
      int data2 = 3;
      System.out.println(data1>data2);
      System.out.println(data1 != data2);
      
      //논리연산자  --> true or false
      //and(&&)  , or(||) , not
      boolean data3 = true;
      boolean data4 = false;
      System.out.println(data3 && data4);//전부다 true -> true
      System.out.println(data3 || data4);//하나라도 true -> true
      
      //삼항 연산자
      // 조건식 ? true 일때 실행부분 : false 일때 실행 부분
      int num2 = 5;
      int num3 = 10;
      //num3를 num2로 나누었을때 나누어 떨어진다면 
      //'약수' 출력
      // 나누어 떨어지지 않는다면
      // '약수아님!' 출력
      System.out.println(num3%num2==0 ?"약수":"약수아님!");
      
      //두개의 정수를 입력받아서
      //큰 수에서 작은 수를 뺀 결과를 출력
      Scanner sc = new Scanner(System.in);
      
      System.out.println("첫번째 정수 입력>>");
      int number1 = sc.nextInt();
      System.out.println("두번째 정수 입력>>");
      int number2 = sc.nextInt();
      System.out.println(number1>number2? number1-number2 : number2-number1);
      
      
      
      
      
      

   }

}
