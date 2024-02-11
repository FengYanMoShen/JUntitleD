package ctrl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author QianZhenHua
 */
public class Control {
    public void read() throws IOException {

        //创建BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一些文本：");

        // 读取用户输入的一行文本
        String input = reader.readLine();
        System.out.println("你输入的文本是：" + input);

        // 关闭BufferedReader
        reader.close();
    }
    public Control(){

    }

}
