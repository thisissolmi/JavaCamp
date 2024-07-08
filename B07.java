
/*

발생하는 문제 2가지 
1/
Scanner.nextLine() 메서드를 사용하여 문자열 입력을 받을 때, 이전에 Scanner.nextInt()를 사용한 후에 줄바꿈 문자(\n)가 남아서 nextLine()이 이를 읽어들이기 때문입니다. 이를 방지하려면 nextLine()을 한 번 더 사용하여 줄바꿈 문자를 소모해야 합니다.
2/
문자열 비교를 할 때는 == 연산자가 아닌 equals() 메서드를 사용해야 합니다. == 연산자는 객체의 참조를 비교하고, equals() 메서드는 문자열의 내용을 비교합니다.
*/

/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b07();
  }

  void b07() {
    Scanner scanner = new Scanner(System.in);
    int megabytes = 0; // 용량(메가바이트 단위)
    long bytes = 0; // 용량(바이트 단위)
    String usb2 = " "; // USB 2.0 사용여부 (Y: 예, N: 아니요)
    int time = 0; // 전송시간(초 단위)

    
    System.out.print("Enter file size as megabytes > ");
    megabytes = scanner.nextInt();

    bytes = megabytes * 1024 * 1024;

    System.out.print("Enter 'Y' if USB type is 2.0 or 'N' > ");
    usb2 = scanner.nextLine();

    if (usb2 == "N") { // 2.0이 아닐때, 즉 1.1일 때
      bytes = megabytes * 1024 * 1024 * 8;
      time = (int) (bytes / 1500000);
      System.out.print("File transfer time is " + time);
    }

    if (usb2 == "Y") { // 2.0일때
      bytes = megabytes * 1024 * 1024 * 8;
      time = (int) (bytes / 60000000);
      System.out.print("File transfer time is " + time);
    }

  }

}

*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b07();
  }

  void b07() {
    Scanner scanner = new Scanner(System.in);
    int megabytes = 0; // 용량(메가바이트 단위)
    long bytes = 0; // 용량(바이트 단위)
    String usb2 = " "; // USB 2.0 사용여부 (Y: 예, N: 아니요)
    int time = 0; // 전송시간(초 단위)

    System.out.print("Enter file size as megabytes > ");
    megabytes = scanner.nextInt();
    scanner.nextLine(); // nextInt() 후에 남은 줄바꿈 문자를 소모하기 위해 추가

    bytes = (long)megabytes * 1024 * 1024;

    System.out.print("Enter 'Y' if USB type is 2.0 or 'N' > ");
    usb2 = scanner.nextLine();

    if (usb2.equals("N")) { // 2.0이 아닐때, 즉 1.1일 때
      bytes = megabytes * 1024 * 1024;
      time = (int) (bytes / 1500000);
      System.out.print("File transfer time is " + time + " seconds");
    }

    if (usb2.equals("Y")) { // 2.0일때
      bytes = megabytes * 1024 * 1024;
      time = (int) (bytes / 60000000);
      System.out.print("File transfer time is " + time + " seconds");
    }
  }
}
