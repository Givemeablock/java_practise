import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;
import java.util.stream.Stream;

/**
 * 流
 * */
public class my_stream {
    /*字节流010101 一个字节一个字节
      字符流 unicode 2个字节
     */

    public static void handle_file(InputStream in) {
        try {
            int b = in.read();
            while (b != -1){
                System.out.print((char) b);
                b = in.read();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void handle_file(Reader in){
        try {
            int b = in.read();
            while (b != -1){
                System.out.print((char) b);
                b = in.read();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     *字节---节点流
     * @param filepath
     */
    public static void file_Stream(String filepath) {
        FileInputStream in = null;
        try {
            in = new FileInputStream(filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        handle_file(in);
    }

    /**
     * 字符---节点流
     * @param filepath
     */
    public static void fileReader_Stream(String filepath) {
        FileReader in = null;
        try {
            in = new FileReader(filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        handle_file(in);

    }

    //处理流
    //  -----缓冲流
    public static void buffer_input_stream(String filepath) {
        BufferedInputStream bin = null;
        try {
            bin = new BufferedInputStream(new FileInputStream(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        handle_file(bin);
    }

    /**
     * 一个读写文件的案例
     * @param filepath
     */
    public static void buffer_reader(String filepath) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        handle_file(br);
        BufferedReader my_br = null;
        BufferedWriter my_wr = null;
        try {
            my_br = new BufferedReader(new FileReader("D:\\JAVA_PRO\\Test\\try_stream.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            my_wr = new BufferedWriter(new FileWriter("D:\\JAVA_PRO\\Test\\try_stream.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String temp = null;
        for (int i =0; i < 100 ; i++) {
            temp = String.valueOf(Math.random());
            try {
                my_wr.write(temp);
                my_wr.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            my_wr.flush();
            temp = my_br.readLine();
            while (temp != null) {
                System.out.println(temp);
                temp = my_br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // ---数据流
    //    包含DataInputStream 和DateOutputStream
    //    套到内存上的流
    public static void data_stream() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(false);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            System.out.println(bis.available());
            DataInputStream dis = new DataInputStream(bis);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // ---打印流 print流
    //  PrintWriter PrintStream,常用于打印
    //  不会往外抛异常，会自动flush
    public static void print_stream(){
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("D:\\JAVA_PRO\\Test\\print_stream.txt"));
            System.setOut(ps);
            for (int i = 0; i < 100 ; i++) {
                System.out.print(Math.random());
                if ((i + 1)%10 == 0) {
                    System.out.println("---------");
                }
            }
            ps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void try_print(String name, PrintStream fs) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(name));
            String s = br.readLine();
            fs.println("----------");
            while ( s != null ) {
                fs.println(s);
                s = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        String x = "D:\\JAVA_PRO\\Test\\README.md";
        file_Stream(x);
        fileReader_Stream(x);
        buffer_input_stream(x);
        //buffer_reader(x);

        data_stream();
        print_stream();
        try_print("D:\\JAVA_PRO\\Test\\README.md", System.out);
    }

}
