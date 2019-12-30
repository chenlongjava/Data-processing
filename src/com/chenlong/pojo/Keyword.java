package com.chenlong.pojo;

import java.util.Arrays;

public class Keyword {
    //"entity": "Open_hardware_electronic_devices",
    // "desc": "",
    // "parentNode": "Electronics",
    // "sonNode": [],
    // "currentUrl": "https://en.wikipedia.org/wiki/
    // Category:Open_hardware_electronic_devices"},
    private String entity;
    private String desc;
    private String parentNode;
    private String[] sonNode;
    private String currentUrl;

    @Override
    public String toString() {
        return "Keyword{" +
                "entity='" + entity + '\'' +
                ", desc='" + desc + '\'' +
                ", parentNode='" + parentNode + '\'' +
                ", sonNode=" + Arrays.toString(sonNode) +
                ", currentUrl='" + currentUrl + '\'' +
                '}';
    }

    public Keyword() {
    }



    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getParentNode() {
        return parentNode;
    }

    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    public String[] getSonNode() {
        return sonNode;
    }

    public void setSonNode(String[] sonNode) {
        this.sonNode = sonNode;
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void setCurrentUrl(String currentUrl) {
        this.currentUrl = currentUrl;
    }
}
