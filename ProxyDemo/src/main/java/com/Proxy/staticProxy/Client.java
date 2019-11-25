package com.Proxy.staticProxy;

public class Client {

    public static void main(String[] args) {
        TeachClass teachDao = new TeachDao();
        TeachClass teachProxy = new TeachProxy(teachDao);
        teachProxy.teach();
    }

}
