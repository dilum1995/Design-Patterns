package com.company;

public class TestFactory {
    public static void main(String[] args) {
        Server CMS_instance = ServerFactory.createServer("CMS", "2.0GHz", "8GB", "500HDD");
        Server OSS_instance = ServerFactory.createServer("OSS", "2.0GHz", "8GB", "500HDD");

        System.out.println("CMS instance: "+ CMS_instance);
    }
}
