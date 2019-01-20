package com.APractice.crawler;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


import sun.net.www.protocol.http.HttpURLConnection;

public class DownLoad {
    public static void main(String[] args) throws IOException {
        downLoadFromUrl("http://f.us.sinaimg.cn/002TRjDVlx07lx3gvjZ601040200n1qg0k010.mp4?label=mp4_hd&template=852x480.28&Expires=1546916760&ssig=975DNJJolt&KID=unistore,video", "ddbai", "D://");
    }

    public static void downLoadFromUrl(String urlStr, String fileName, String savePath) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3 * 1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //得到输入流
        InputStream inputStream = conn.getInputStream();
        //获取自己数组
        byte[] getData = readInputStream(inputStream);

        //文件保存位置
        File saveDir = new File(savePath);
        if (!saveDir.exists()) {
            saveDir.mkdir();
        }
        File file = new File(saveDir + File.separator + fileName);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(getData);
        if (fos != null) {
            fos.close();
        }
        if (inputStream != null) {
            inputStream.close();
        }
        System.out.println("info:" + url + " download success");
    }

    private static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }


    public static void downLoadFile(String filePath,
                                    HttpServletResponse response) {
        File file = null;
        DataInputStream dis = null;
        ServletOutputStream out = null;
        try {
            file = new File(filePath);
            if (!file.exists()) {
                System.out.println("没有找到资源");
                return;
            }
            out = response.getOutputStream();
            FileInputStream fis = new FileInputStream(file);
            dis = new DataInputStream(fis);
            int len = (int) file.length();
            byte[] buffer = new byte[len];
            try {
                dis.readFully(buffer);
            } catch (IOException e) {
            } finally {
                if (dis != null) {
                    try {
                        dis.close();
                    } catch (IOException e) {
                    }
                }
            }
            try {
                out.write(buffer);
                out.flush();
            } catch (IOException e) {
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                    }
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    public boolean deleteFile(String sPath) {
        Boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }
}
