package com.APractice.webmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;


public class PageProcess implements PageProcessor {

    //设置网站相关url变量
    private Site site = Site.me().setRetryTimes(5)
            .setSleepTime(0).setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36");

    @Override
    public void process(Page page) {
        //视频标题
        System.out.println("========视频标题？？==============");
        String result = page.getHtml().xpath("//*[@id=\"viewbox_report\"]/h1/span").get();
        //String res2 = StringUtil.stripHTML(result);
        System.out.println(result);
        //System.out.println(res2);
        System.out.println("=====大V名称？？======");
        String s2 = page.getHtml().xpath("//*[@id=\"v_upinfo\"]/div[2]/div[1]/a[1]").get();
        System.out.println(StringUtil.stripHTML(s2));
        System.out.println("======播放时长？？===========");
        String schang = page.getHtml().xpath("//*[@id=\"bilibiliPlayer\"]/div[1]/div[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div/span[3]").get();
        System.out.println(schang);

        String s4 = page.getHtml().xpath("//*[@id=\"bilibiliPlayer\"]/div[1]/div[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div/span[3]").get();
        System.out.println(StringUtil.stripHTML(s4));
        /**
         *
         *
         */


    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new PageProcess()).addUrl("https://www.bilibili.com/video/av34247329?from=search&seid=1069497387370357898")
                .thread(1).run();
    }
}
