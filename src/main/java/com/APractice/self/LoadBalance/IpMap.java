package com.APractice.self.LoadBalance;

import java.util.*;

//https://www.cnblogs.com/szlbm/p/5588555.html
public class IpMap {

    public static HashMap<String, Integer> serverWeightMap = new HashMap<>();

    static {
        serverWeightMap.put("192.168.1.100", 1);
        serverWeightMap.put("192.168.1.101", 1);
        // Ȩ��Ϊ4
        serverWeightMap.put("192.168.1.102", 4);
        serverWeightMap.put("192.168.1.103", 1);
        serverWeightMap.put("192.168.1.104", 1);
        // Ȩ��Ϊ3
        serverWeightMap.put("192.168.1.105", 3);
        serverWeightMap.put("192.168.1.106", 1);
        // Ȩ��Ϊ2
        serverWeightMap.put("192.168.1.107", 2);
        serverWeightMap.put("192.168.1.108", 1);
        serverWeightMap.put("192.168.1.109", 1);
        serverWeightMap.put("192.168.1.110", 1);
    }

    //��ѯ��
    private static class RoundRonbin {
        private static Integer pos = 0;

        public static String getServer() {
            //�ؽ�һ��map������������������ߵ��µĲ�������
            HashMap<String, Integer> severMap = new HashMap<>();
            severMap.putAll(serverWeightMap);
            //���IP��ַlist
            Set<String> keySet = severMap.keySet();
            ArrayList<String> keyList = new ArrayList<>();
            keyList.addAll(keySet);
            String server = null;
            synchronized (pos) {
                if (pos > keySet.size())
                    pos = 0;
                server = keyList.get(pos);
                pos++;
            }
            return server;
        }
    }

    //�����
    private static class Random {
        public static String getServer() {
            //�ؽ�һ��map����������������ߵ��µĲ�������
            Map<String, Integer> serverMap = new HashMap<>();
            serverMap.putAll(serverWeightMap);
            //���IP��ַList
            Set<String> keySet = serverMap.keySet();
            ArrayList<String> keyList = new ArrayList<>();
            keyList.addAll(keySet);
            java.util.Random random = new java.util.Random();
            int randomPos = random.nextInt(keyList.size());
            return keyList.get(randomPos);
            //���ڸ���ͳ�Ƶ����ۣ�������Խ������㷨��Ч��Խ�ӽ�����ѯ�㷨��Ч����
        }
    }

    //ԭ��ַ��ϣ��
    private static class Hash {
        public static String getServer() {
            //�ؽ�һ��map,����������������ߵ��µĲ�������
            Map<String, Integer> serverMap = new HashMap<>();
            serverMap.putAll(serverWeightMap);
            //���IP��ַList
            Set<String> keySet = serverMap.keySet();
            ArrayList<String> keyList = new ArrayList<>();
            keyList.addAll(keySet);
            //��web�п���ͨ��DownHttpServlet��getT=RemoteIp������ȡ
            String remomteIp = "127.0.0.1";
            int hashCode = remomteIp.hashCode();
            int serverListSize = keyList.size();
            int serverPos = hashCode % serverListSize;
            return keyList.get(serverPos);
        }
    }

    //��Ȩ��ѵ��
    private static class WeightRoundRobin {
        private static Integer pos = 0;

        private static String getServer() {
            //�ؽ�һ��Map,����������������ߵ��µĲ�������
            Map<String, Integer> serverMap = new HashMap<>();
            serverMap.putAll(serverWeightMap);
            //ȡ��Ip��ַList
            Set<String> keySet = serverMap.keySet();
            Iterator<String> iterator = keySet.iterator();
            ArrayList<String> serverList = new ArrayList<>();
            while (iterator.hasNext()) {
                String server = iterator.next();
                Integer weight = serverMap.get(server);
                for (int i = 0; i < weight; i++) {
                    serverList.add(server);
                }

            }
            String server = null;
            synchronized (pos) {
                if (pos > keySet.size()) {
                    pos = 0;
                    server = serverList.get(pos);
                    pos++;
                }
            }
            return server;
        }
    }




}
