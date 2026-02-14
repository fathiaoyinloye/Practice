package Path.stream.Assignment;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class SendFile {
    public static void main(String... args){
        String receiverIpAddress = "172.16.0.228";
        int port = 8080;
        File file = new File("/home/fathia-oyinloye/Pictures/fathia.jpg");
        try(Socket socket = new Socket(receiverIpAddress,port);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            FileInputStream fileInputStream = new FileInputStream(file)){
            dataOutputStream.writeUTF(file.getName());
            dataOutputStream.writeLong(file.length());

            byte[] buffer = new byte[4096];

            for(int bytesRead = fileInputStream.read(buffer); bytesRead != - 1;bytesRead = fileInputStream.read(buffer) ){
                dataOutputStream.write(buffer, 0, bytesRead);
            }dataOutputStream.flush();
            System.out.println("Finished sending: " + file.getName());

        } catch (IOException exception) {
            System.out.println("Error is" + exception.getMessage());
            exception.printStackTrace();
        }

            }

    }




