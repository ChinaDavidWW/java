package com.APractice.crawler;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

public class DownHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取要下载的文件的名称(就跟get提交方式一样)
        String filename = request.getParameter("http://f.us.sinaimg.cn/002TRjDVlx07lx3gvjZ601040200n1qg0k010.mp4?label=mp4_hd&template=852x480.28&Expires=1546916760&ssig=975DNJJolt&KID=unistore,video");
        //要下载的这个文件的类型----客户端通过文件的MIME类型去区分类型
        response.setContentType(this.getServletContext().getMimeType(filename));
        //告诉客户端该文件不是直接解析 而是以附件的形式打开（下载）
        response.setHeader("Content-Disposition", "attachment;filename=" + filename);
        //获取文件的绝对路径
        String path = this.getServletContext().getRealPath("download/" + filename);
        //获得该文件的输入流
        FileInputStream in = new FileInputStream(path);
        //获的该文件的输出流
        ServletOutputStream out = response.getOutputStream();
        int len = -1;
        byte[] buf = new byte[1024];
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
            out.flush();
        }
        in.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }



}
