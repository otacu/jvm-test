package com.egoist.jvmtest.deadlock;

class ResourceA{
    private String resourceA = "";
    public String getResourceA() {
        return resourceA;
    }
    public void consumerA(String name){
        this.resourceA = name;
    }
}
