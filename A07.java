import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a06();
  }
  void a06(){
    Scanner scanner = new Scanner(System.in);
    
    int gigabytes=0; //용량(기가바이트 단위) 
    int megabytes=0; // 용량(메가바이트 단위) 
    int kilobytes=0; // 용량(킬로바이트 단위) 
    long bytes=0; // 용량(바이트 단위)

    

    System.out.print("Enter file size as gigabytes > ");
    gigabytes = scanner.nextInt();

    megabytes = gigabytes * 1024;
    kilobytes = megabytes* 1024;
    bytes = (long)kilobytes * 1024;
    
    
    System.out.print("Your file size is \n"  + megabytes + " MB\n" + kilobytes + " KB\n" + bytes + " B");
    
    

  }
}