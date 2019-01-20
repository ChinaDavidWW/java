package com.APractice.bigData.hadoop.hdfs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;

public class HdsfFileUtil {
    private static final String confPath = "D:/01DevSoft/35Hadoop3.1.1/hadoop-3.1.1/etc/hadoop/core-site.xml";
    private static final String local = "D:\\11ForTest\\hdfs\\hello.txt";
    private static final Configuration conf = new Configuration();

    static {
        //加载配置文件
        conf.addResource(confPath);
    }

    public static void main(String[] args) throws Exception {
        // deleteHdfsFile("D:/11ForTest/hdfs/helloHdfs.txt");

        //uploadToHdfs(local, uploadPath.getFileSystem(conf).toString());
        getDirectoryFromHdfs("hdfs://127.0.0.1:8020");

    }


    /**
     * 删除HDFS文件
     *
     * @param path
     * @throws Exception
     */
    public static void deleteHdfsFile(String path) throws Exception {

        //获取要删除的文件
        Path deletePath = new Path(path);
        FileSystem hdfs = deletePath.getFileSystem(conf);
        boolean isDeleted = false;
        //检查文件是否存在，若存在 递归删除
        if (hdfs.exists(deletePath)) {
            isDeleted = hdfs.delete(deletePath, true);
            //递归删除
        } else {
            isDeleted = false;
            System.out.println("文件不存在：删除失败");
        }
        System.out.println("Delete?*" + isDeleted);
    }

    /**
     * 将本地文件上传至HDFS
     *
     * @param local 本地文件路劲
     * @param hdfs
     * @throws Exception
     */
    public static void uploadToHdfs(String local, String hdfs) throws IOException {
        Configuration config = new Configuration();
        config.addResource(confPath);

        FileSystem fs = FileSystem.get(URI.create(hdfs), config);

        //读取本地文件
        FileInputStream fis = new FileInputStream(new File(local));
        FSDataOutputStream os = fs.create(new Path(hdfs));
        //复制
        IOUtils.copyBytes(fis, os, 4096, true);

        os.close();
        fis.close();
        System.out.println("拷贝完成");


    }

    /**
     * @param fileName 源文件名
     * @param dest     写入路劲
     * @throws IOException
     */
    public static void readFromHdfs(String fileName, String dest) throws IOException {
        //加载配置文件
        FileSystem fs = FileSystem.get(URI.create(fileName), conf);
        //打开文件流
        FSDataInputStream hdfsInStream = fs.open(new Path(fileName));

        //写入本地文件系统
        FileOutputStream out = new FileOutputStream(dest);
        byte[] ioBuffer = new byte[1024];
        //按行读取
        int readLen = hdfsInStream.read(ioBuffer);
        while (-1 != readLen) {
            out.write(ioBuffer, 0, readLen);
            System.out.println(new String(ioBuffer));
            readLen = hdfsInStream.read(ioBuffer);

        }
        out.close();
        hdfsInStream.close();
        fs.close();
    }

    /**
     * 列出HDFS目录
     *
     * @param path 路径
     * @throws IOException
     */
    public static void getDirectoryFromHdfs(String path) throws IOException {

        // 加载配置文件

        // 获取HDFS文件系统
        FileSystem fs = FileSystem.get(URI.create(path), conf);

        // 获取指定路径下的文件
        FileStatus fileList[] = fs.listStatus(new Path(path));

        int size = fileList.length;

        // 循环输出文件
        for (int i = 0; i < size; i++) {

            System.out.println("name:" + fileList[i].getPath().getName()
                    + "\t\tsize:" + fileList[i].getLen());

        }

        fs.close();

    }


}
