package com.hh.test.practice.java8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/1/31 16:16
 */
public class Base64Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // 使用基本编码
        String base64encodedString = Base64.getEncoder().encodeToString("hello world1".getBytes("utf-8"));
        System.out.println("Base64 编码字符串 (基本) :" + base64encodedString);
        // 解码
        byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
        System.out.println("原始字符串: " + new String(base64decodedBytes, "utf-8"));

        // Base64 编码字符串 (URL)
        base64encodedString = Base64.getUrlEncoder().encodeToString("hello world2".getBytes("utf-8"));
        System.out.println("Base64 编码字符串 (URL) :" + base64encodedString);

        // Base64 编码字符串 (MIME)
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; ++i) {
            stringBuilder.append(UUID.randomUUID().toString());
        }
        byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
        String mimeEncodedString = Base64.getUrlEncoder().encodeToString(mimeBytes);
        System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);
    }
}
