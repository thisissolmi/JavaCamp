/*
자바 캠프 백준 문제 1330 두 수 비교하기 
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main back = new Main();
    back.joon1330();
  }
  void joon1330(){
    Scanner scanner = new Scanner(System.in); // 객체 생성,

    int n1=0;
    int n2=0;

    
    n1 = scanner.nextInt(); 
    n2 = scanner.nextInt(); 

    if (n1 < n2 ){
        System.out.print("<");
    }
    

    if (n1 > n2 ){
        System.out.print(">");
    }

    
    if (n1 == n2 ){
        System.out.print("==");
    }



  }
}