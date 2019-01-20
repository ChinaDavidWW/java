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

/**
 * 根据选择器语法查找DOM元素
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://www.cnblogs.com/");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity, "utf-8");
        response.close();
        Document doc = Jsoup.parse(content);
        // 查找所有帖子DOM
        System.out.println("------------------------查找所有帖子DOM---------------------------");
        Elements linkElements = doc.select(".post_item .post_item_body h3 a"); // 查找所有帖子DOM
        for (Element e : linkElements) {
            System.out.println("博客标题：" + e.text());
            System.out.println("-------------");
        }
        System.out.println("====================带有href属性的a元素==================");
        Elements hrefElements = doc.select("a[href]"); // 带有href属性的a元素
        for (Element e : hrefElements) {
            System.out.println(e.toString());
            System.out.println("-------------");
        }

        System.out.println("00000000000000000000000查找扩展名为.png的图片DOM节点");
        Elements imgElements = doc.select("img[src$=.png]"); // 查找扩展名为.png的图片DOM节点
        for (Element e : imgElements) {
            System.out.println(e.toString());
            System.out.println("-------------");
        }
        System.out.println("111111111111111111111获取tag是title的所有DOM元素");
        Element element = doc.getElementsByTag("title").first(); // 获取tag是title的所有DOM元素
        String title = element.text(); // 返回元素的文本
        System.out.println("网页标题是：" + title);


    }
}
