package com.Proxy.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        TeachClass teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeachClass teachProxy = (TeachClass) proxyFactory.getNewInstance();
        teachProxy.teach();
    }
}
