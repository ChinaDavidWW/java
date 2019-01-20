package com.APractice.crawler.jsoup;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://www.cnblogs.com/");

        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String webContent = EntityUtils.toString(entity, "utf-8");
        // System.out.println(webContent);
        response.close();//关闭流和释放系统资源

        Document doc = Jsoup.parse(webContent);
        Elements elements = doc.getElementsByTag("title");
        Element element = elements.get(0);
        String title = element.text();//返回元素的文本
        System.out.println("网页的标题是：" + title);

        Element element2 = doc.getElementById("site_nav_top");
        String navTop = element2.text();//返回元素的文本
        System.out.println("口号: " + navTop);

        //获取菜单
        Element nav_menu = doc.getElementById("nav_menu");
        String menu = nav_menu.text();
        System.out.println("菜单是：" + menu);

        //根据样式名来查询DOM
        System.out.println("======================根据样式名来查询DOM===========================");
        Elements post_item_ = doc.getElementsByClass("post_item");
        for (Element e : post_item_) {
            System.out.println(e.text());
            System.out.println("=====================下面是hyml==================");
            System.out.println(e.html());
            System.out.println("=====================");
        }
        //根据属性名来查询DOM
        System.out.println("================// 根据属性名来查询DOM=========");
        Elements width = doc.getElementsByAttribute("width");
        for (Element e : width) {
            System.out.println(e.toString());
            System.out.println("==============++++++++++");
        }

        //// 根据属性名和属性值来查询DOM

        System.out.println("=====// 根据属性名和属性值来查询DOM------------------");
        Elements value = doc.getElementsByAttributeValue("target", "_blank");
        for (Element e : value) {
            System.out.println(e.toString());
            System.out.println("000000000000000000000000000000");
        }


    }
}
