/*
A02 - 온도변환
섭씨 온도를 입력받아 이 값을 화씨온도로 변환하여 출력하라.

단, 화씨 온도 = 섭씨 온도 * 1.8 + 32 로 계산한다. 변수는 다음과 같이 사용하라.

double c_degree; //섭씨 온도

double f_degree; //화씨 온도

소스에서 a02() 함수 내에 코드를 완성하라.

Enter Celsius temperature > 20.5
Fahrenheit temperature is 68.9

240704


concept : 
// 소수점 둘째 자리까지 반올림하여 출력
        String formatted = String.format("%.2f", c_degree);
        System.out.println("Formatted to two decimal places: " + formatted);
        
        // 또는 바로 출력할 때 포맷팅 할 수도 있습니다.
        System.out.printf("Formatted to two decimal places: %.2f", c_degree);

 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main pStudio = new Main();
    pStudio.J001();
    
  }

  void J001() {
    Scanner scanner = new Scanner(System.in); // 객체 생성,

    // 단, 화씨 온도 = 섭씨 온도 * 1.8 + 32 로 계산한다. 변수는 다음과 같이 사용하라.
 
    double c_degree=0; // 섭씨 온도
    double f_degree=0; // 화씨 온도
    
    System.out.print("Enter Celsius temperature > ");
    c_degree = scanner.nextFloat();
    
    f_degree = (c_degree * 1.8) + 32;
    System.out.printf("Fahrenheit temperature is %.2f", f_degree);
    

  }
}