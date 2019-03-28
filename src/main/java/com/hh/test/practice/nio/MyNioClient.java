package com.hh.test.practice.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/3/28 10:40
 */
public class MyNioClient {

    // 创建一个选择器
    private Selector selector;
    private final static int PORT = 8686;
    private final static int BUF_SIZE = 10240;
    private static ByteBuffer byteBuffer = ByteBuffer.allocate(BUF_SIZE);

    private void initClient() throws IOException, InterruptedException {
        this.selector = Selector.open();
        SocketChannel clientChannel = SocketChannel.open();
        clientChannel.configureBlocking(false);
        clientChannel.connect(new InetSocketAddress(PORT));
        clientChannel.register(selector, SelectionKey.OP_CONNECT);

        while(true){
            selector.select();
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while(iterator.hasNext()){
                SelectionKey key = iterator.next();
                iterator.remove();
                if(key.isConnectable()){
                    System.out.println("客户端连接了");
                    doConnect(key);
                }else if(key.isReadable()){
                    System.out.println("客户端开始读了");
                    doRead(key);
                }
            }
        }
    }

    public void doConnect(SelectionKey key) throws IOException, InterruptedException {
        SocketChannel clientChannel = (SocketChannel) key.channel();
        if(clientChannel.isConnectionPending()){
            clientChannel.finishConnect();
        }
        clientChannel.configureBlocking(false);
        String info = "服务端你好，我是客户端，啦啦啦";
        byteBuffer.put(info.getBytes("UTF-8"));
        byteBuffer.flip();
        clientChannel.write(byteBuffer);
        byteBuffer.clear();
        clientChannel.register(selector, SelectionKey.OP_READ);
    }

    public void doRead(SelectionKey key) throws IOException, InterruptedException {
        SocketChannel clientChannel = (SocketChannel) key.channel();
        clientChannel.read(byteBuffer);
        byte[] data = byteBuffer.array();
        String msg = new String(data).trim();
        System.out.println("服务端发送消息" + msg);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        MyNioClient myNioClient = new MyNioClient();
        myNioClient.initClient();
    }

}
