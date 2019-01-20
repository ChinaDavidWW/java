package A01EncodeDecode;

import org.junit.Test;

import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Md5Test {
    public static void main(String[] args) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String pdw = "kxtx678";
        byte[] bytes = pdw.getBytes();
        byte[] digest = md5.digest(bytes);
        System.out.println(digest);
        for (byte c : digest) {
            System.out.print((char) c);
        }
        System.out.println();

    }

    @Test
    public void method() {
        String a = "";
        System.out.println(a.toString());
        int b = 0;
        System.out.println(Integer.toString(b));

    }

    @Test
    public void dateConvertYear() {

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(1537259954000L);
        int YEAREnd = calendar2.get(Calendar.YEAR);
        System.out.println(calendar2.get(Calendar.DATE));
        System.out.println(calendar2.get(Calendar.MONTH));
        System.out.println(YEAREnd);

    }

    @Test

    public void numToDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(1537259954000L);
        String format1 = format.format(date);
        System.out.println(format1);
        Date date2 = null;
        try {
            date2 = format.parse(format1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date2);
    }

    @Test
    public void method3() {
        //System.out.println(UUID.randomUUID());
        ArrayList<Integer> integers = new ArrayList<>();
        List<Object> objects = new ArrayList<>(12);
        Map<Object, Object> hashMap = new HashMap<>();
        String s = new String("666");
        String s2 = "665";

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        HashSet<Object> hashSet = new HashSet<>();
        LinkedHashMap<Object, Object> objectObjectLinkedHashMap = new LinkedHashMap<>();
        Vector<Object> objects1 = new Vector<>();

    }

    @Test
    public void timeNum() {

        long time = Calendar.getInstance().getTime().getTime();
        System.out.println(time);


    }


}
