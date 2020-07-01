package springdemo02.javase.File.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FosDemo {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
//    File file = new File("a.txt");
//    FileOutputStream fos =
//           new FileOutputStream(file);

        FileOutputStream fos = new FileOutputStream("fos.txt");
        //写数据
//    fos.write(97);
        fos.write("hello,文件输出流对象".getBytes());
        //释放资源
        fos.close();
    }
}
