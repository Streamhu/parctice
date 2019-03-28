package com.hh.test.practice.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/3/28 10:01
 */
public class MyNioServer {

    private Selector selector;

    private final static int PORT = 8686;

    private final static int BUF_SIZE = 10240;

    /**
     * 创建的客户端数量
     * */
    private int count = 0;

    private void initServer() throws IOException, InterruptedException {
        // 创建通道管理器对象selector
        this.selector = Selector.open();

        // 创建一个通道channel
        ServerSocketChannel channel = ServerSocketChannel.open();
        // 将通道设置为非阻塞
        channel.configureBlocking(false);
        // 将通道绑定在8686端口
        channel.socket().bind(new InetSocketAddress(PORT));

        // 将通道管理器和通道绑定，并为该通道注册OP_ACCEPT事件
        // 注册事件后，当该事件到达时，selector.select()会返回（一个key），如果该事件没到达selector.select()会一直阻塞
        SelectionKey selectionKey = channel.register(selector, SelectionKey.OP_ACCEPT);

        // 轮询
        while(true){
            // 这是一个阻塞方法，一直等待知道有数据到达，返回值是key的数量（可以有多个）
            selector.select();
            // 如果channel有数据了，将生成的key放入keys集合中
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator iterator = keys.iterator();
            // 使用迭代器遍历集合
            while(iterator.hasNext()){
                // 得到集合中的一个实例
                SelectionKey key = (SelectionKey)iterator.next();
                // 拿到当前key实例之后记得在迭代器中奖这个元素删除，非常重要，否则会出错
                iterator.remove();
                // 判断当前key所代表的channel是否在Acceptable状态，如果是就进行接收
                if(key.isAcceptable()){
                    System.out.println("****** 接收了");
                    doAccept(key);
                }else if(key.isReadable()){
                    System.out.println("****** 读了");
                    doRead(key);
                }else if(key.isWritable() && key.isValid()){
                    System.out.println("****** 写了");
                    doWrite(key);

                }else if(key.isConnectable()){
                    System.out.println("连接成功");
                }
            }
        }
    }

    public void doAccept(SelectionKey key) throws IOException {
        ServerSocketChannel channel = (ServerSocketChannel) key.channel();
        System.out.println("ServerSocketChannel正在循环监听");
        // ServerSocketChannel可以监听新进来的TCP连接，像Web服务器那样。对每一个新进来的连接都会创建一个SocketChannel
        SocketChannel clientChannel = channel.accept();
        count++;
        System.out.println("监听的第" + count + "个客户端（SocketChannel）");
        clientChannel.configureBlocking(false);
        clientChannel.register(key.selector(), SelectionKey.OP_READ);
    }

    public void doRead(SelectionKey key) throws IOException, InterruptedException {
        SocketChannel clientChannel = (SocketChannel)key.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BUF_SIZE);
        long bytesRead = clientChannel.read(byteBuffer);
        while (bytesRead > 0){
            byteBuffer.flip();
            byte[] data = byteBuffer.array();
            String info = new String(data).trim();
            System.out.println("从客户端发送过来的消息是："+ info);
            byteBuffer.clear();
            bytesRead = clientChannel.read(byteBuffer);
        }
        String toClient = "客户端你好呀，我是服务端, hahahahahaha";
        byteBuffer.put(toClient.getBytes("UTF-8"));
        // 这里如果删掉了，表明position没有在读模式下归0，还是写模式下的position，从而导致channel从buffer读取的时候是空的
        byteBuffer.flip();
        clientChannel.write(byteBuffer);
        byteBuffer.clear();
    }

    public void doWrite(SelectionKey key) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(BUF_SIZE);
        String info = "客户单你好呀，我是服务端, hahahahahaha";
        byteBuffer.put(info.getBytes("UTF-8"));
        byteBuffer.flip();
        SocketChannel clientChannel = (SocketChannel)key.channel();
        while(byteBuffer.hasRemaining()){
            clientChannel.write(byteBuffer);
        }
        byteBuffer.compact();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        MyNioServer myNioServer = new MyNioServer();
        myNioServer.initServer();
    }

}
