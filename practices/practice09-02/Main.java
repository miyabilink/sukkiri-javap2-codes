import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) {
        String inFile = args[0]; 
        String outFile = args[1];
        FileInputStream fis = null;
        GZIPOutputStream gzos = null;
        try {
            fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            gzos = new GZIPOutputStream(bos);
            int i = fis.read();
            while(i != -1) { 
            	gzos.write(i); 
            	i = fis.read(); 
            }
            gzos.finish(); 
            gzos.close(); 
            fis.close();
        } catch(IOException e) {
            System.out.println("ファイル操作に失敗しました");
            try {
                if(fis != null) {
                	fis.close();
                }
                if(gzos != null) {
                	gzos.close();
                }
            } catch(IOException ee) { } // 何もしない
        }
    }
}