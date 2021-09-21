import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:\\rpgsave.dat", true); 
        												// STEP1
        fw.write('A');                                  // STEP2
        fw.flush();
        fw.close();                                     // STEP3
    }
}