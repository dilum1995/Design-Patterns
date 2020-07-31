package com.company;

public class ServerFactory {
    public static Server createServer(String type, String CPU, String RAM, String HDD){
         if ("CMS".equalsIgnoreCase(type)) return new CloudManagerServer(HDD, RAM, CPU);
         else if ("OSS".equalsIgnoreCase(type)) return new OpenSecurityServer(HDD, RAM, CPU);
        return null;
    }
}
