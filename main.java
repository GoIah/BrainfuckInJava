import java.util.Scanner;

public class Main {
    // made by an idiot
    static int[] MemoryArray = new int[] {0,0,0,0, 0,0,0,0};
    static int PI = 0; // Pointers Index
    
    static int ASKII_MEM = 0;
    
    public static void SRToutput() {
      System.out.print("  ");
      for (int i=0; i<MemoryArray.length; i++) {
        System.out.print("["+MemoryArray[i]+"]");
      }
      System.out.print(":>: "+ASKII_MEM);
      System.out.print("\n"+("   ").repeat(PI+1)+"^");
    }

    public static String input() {
    	Scanner input = new Scanner(System.in);
      System.out.print("\n: ");
      
      return input.next();
    }

    public static void run() {
      String a = input();

      for (int i=0; i<a.length(); i++) {
        char Command = a.charAt(i);
        
        if (Command == '>') {
          PI = Math.min(PI+1, MemoryArray.length-1);
        } else if (Command == '<') {
          PI = Math.max(PI-1, 0);
        } else if (Command == '-') {
          MemoryArray[PI] = Math.max(MemoryArray[PI]-1, 0);
        } else if (Command == '+') {
          MemoryArray[PI] = Math.min(MemoryArray[PI]+1, 9);
        } else if (Command == ',') {
          ASKII_MEM = (48+MemoryArray[PI]);
        }
      }
    }
      
    public static void main(String[] args) {
      while (true) {
        SRToutput();
        run();
    }
  }
}