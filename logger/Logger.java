package logger;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    Logger logger = new Logger();
    public void log(String s){

    }
    public void writer(){
        try {
            // 创建FileWriter对象，用于写入数据到文件中
            // 第一个参数是文件路径和名称，第二个参数为true表示以追加模式写入文件
            FileWriter writer = new FileWriter("example.txt", true);

            // 写入文本到文件
            writer.write("Hello, this is a text file.\n");
            writer.write("Here is another line.\n");

            // 关闭文件写入流
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
