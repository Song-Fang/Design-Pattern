package com.Proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }
    public Object getNewInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new MyInvocationHandler(target));
    }
}


class MyInvocationHandler implements InvocationHandler{
    Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Prepare for teaching...");
        method.invoke(target,args);
        System.out.println("End the teach...");
        return null;
    }
}