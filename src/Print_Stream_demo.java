import java.io.*;

public class Print_Stream_demo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("D:\\JAVA_PRO\\Test\\learn-stream.txt"), true);
            String s = null;
            while ((s = br.readLine()) != null) {
                if (!s.equals("exit")) {
                    System.out.println(s);
                    pw.println("---");
                    pw.print(s);

                }
                else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
