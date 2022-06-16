package com.atbinwu.spring5.bean;

public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步");
    }

    public void initMethod(){
        System.out.println("第三步");
    }

    public void destroyMethod(){
        System.out.println("第五步");
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                '}';
    }
}
