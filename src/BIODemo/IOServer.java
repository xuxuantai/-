package BIODemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by LaoP on 2019/7/18.
 */
public class IOServer {
    public static void main(String[] args) throws IOException {
        // TODO ����˴���ͻ�����������
        ServerSocket serverSocket = new ServerSocket(3333);

        // ���յ��ͻ�����������֮��Ϊÿ���ͻ��˴���һ���µ��߳̽�����·����
        new Thread(() -> {
            while (true) {
                try {
                    // ����������ȡ�µ�����
                    Socket socket = serverSocket.accept();

                    // ÿһ���µ����Ӷ�����һ���̣߳������ȡ����
                    new Thread(() -> {
                        try {
                            int len;
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            // ���ֽ�����ʽ��ȡ����
                            while ((len = inputStream.read(data)) != -1) {
                                System.out.println(new String(data, 0, len));
                            }
                        } catch (IOException e) {
                        }
                    }).start();

                } catch (IOException e) {
                }

            }
        }).start();

    }
}
