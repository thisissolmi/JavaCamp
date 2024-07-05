import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a05();
  }


  void a05(){
    Scanner scanner = new Scanner(System.in);
    //Scanner scanner = new Scanner 


    int days=0; // 날 수
    int seconds=0; // 초 단위 시간
    
    System.out.print("Enter number of days > ");
    days  = scanner.nextInt();

    seconds = days * 24 * 60 * 60;


    System.out.print("Total seconds is "+ seconds); 
  }
}

/*
날 수를 입력받아 이 날 수에 해당되는 기간은 모두 몇 초인지 계산하여 출력하라. 단, 초 = 날 수 x 24 x 60 x 60 으로 계산한다. 변수는 다음과 같이 사용하라.

소스에서 a05() 함수 내에 코드를 완성하라.

Enter number of days > 25
Total seconds is 2160000
*/
