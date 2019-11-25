package com.Proxy.staticProxy;

public class TeachProxy implements TeachClass{
    TeachClass teachDao;

    public TeachProxy(TeachClass teachDao){
        this.teachDao = teachDao;
    }

    public void teach() {
        System.out.println("Prepare for teach...");
        teachDao.teach();
        System.out.println("End the teach...");
    }
}
