package stream_file_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 读入字符或者字符串
 */
public class ReadStringTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//创建一个字符流
        //BufferedReader 对象创建后，我们便可以使用 read() 方法从控制台读取一个字符，或者用 readLine() 方法读取一个字符串。
        char[] chars=new char[1000000];
        int i=0;
        char c=(char)bufferedReader.read();
        //字符的读入：每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回 -1
        do{
            c = (char) bufferedReader   .read();
            System.out.println(c);
        }while(c!='~');
        for (char cs :
              chars  ) {
            System.out.println(c);
        }
    }
}
