package com.egoist.jvmtest.deadlock;

class ResourceB{
    private String resourceB = "";
    public String getResourceB() {
        return resourceB;
    }
    public void consumerB(String name){
        this.resourceB = name;
    }
}