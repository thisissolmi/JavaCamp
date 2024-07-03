/*
A01 - 나이계산
태어난 년도를 입력받은 후, 이 값을 이용하여 나이를 계산하고 출력하라.

단, 나이 = <올해년도> – 태어난 년도 + 1 로 계산한다.

변수는 다음과 같이 사용하라.

int birth_year ; // 태어난 년도 int age ; // 나이

소스에서 a01() 함수 내에 코드를 완성하라.

Enter a birth year > 1999
You are 25 years old.
Enter a birth year > 2009
You are 15 years old.
*/

/*
date : 240703 Wen

concept : Scanner scanner = new Scanner(System.in); 객체 생성, 
사용자로부터 입력받은 값을 변수에 저장 -> Scanner 객체의 메서드 사용, 사용자가 정수를 입력하도록 하려면 nextInt() 메서드사용
 */
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    A02 stepA = new A02();
    stepA.a01();
  }

  //나이 = <올해년도> – 태어난 년도 + 1 
  
  void a01(){
    Scanner scanner = new Scanner(System.in);
    int birth_year=0; // 태어난 년도 
    int age=0; // 나이
    
    System.out.print("Enter a birth year > ");
    birth_year = scanner.nextInt(); 
    
    age = 2024 - birth_year + 1;
    System.out.println("You are " + age +" years old.");
  }
}