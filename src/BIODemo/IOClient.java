package BIODemo;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * Created by LaoP on 2019/7/18.
 */
public class IOClient {

    public static void main(String[] args) {
        // TODO ��������̣߳�ģ�����ͻ������ӷ����
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 3333);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();

    }
}
