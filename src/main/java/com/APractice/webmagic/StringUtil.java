package com.APractice.webmagic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static String stripHTML(String html) {
        String noHTMLString = "";
        html = html.replaceAll("&amp;", "&");
        Matcher m = Pattern
                .compile("&#(\\d+);", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL | Pattern.CANON_EQ)
                .matcher(html);
        boolean b = false;
        int i = 0;
        while (m.find()) {
            if (i > 500) {
                System.out.println(i);
            }
            i++;
            html = html.replace("&#" + m.group(1) + ";", (char) Integer.parseInt(m.group(1)) + "");
            b = true;
        }
        if (!b) {
            m = Pattern
                    .compile("&#x([\\da-f]+);",
                            Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL | Pattern.CANON_EQ)
                    .matcher(html);
            int j = 0;
            while (m.find()) {
                if (j > 500) {
                    System.out.println(j);
                }
                j++;
                html = html.replaceAll("&#[x|X]" + m.group(1) + ";", (char) Integer.parseInt(m.group(1), 16) + "");
            }
        }
        noHTMLString = html.replaceAll("<\\s*(?:br|Br|BR|bR|div|DIV|Div|p|P|td|TD|Td)\\s*(?:[^>])*\\s*>", "\n")
                .replaceAll("　", " ").replaceAll("", " ").replaceAll("&nbsp;", " ").replaceAll("\\<.*?\\>", "")
                .replaceAll("&(?:g|l)t", "");
        return noHTMLString.trim();
    }
}
