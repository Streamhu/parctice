package com.hh.test.practice.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/3/26 16:15
 */
public class FirstTest {

    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        FileChannel channel = outputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String str = "java nio";
        buffer.put(str.getBytes());
        buffer.flip();
        channel.write(buffer);
        channel.close();
        outputStream.close();
    }
}
