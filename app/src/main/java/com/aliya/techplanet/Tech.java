package com.aliya.techplanet;

import java.io.Serializable;

public class Tech implements Serializable {
    int  img;
    int id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status="In Stock";
    //for radio buttons
    String type;
//    String laptop;
//    String tablet;
//    String mobile;
    String name;
    String specs;
    int price;
    public Tech(){ }
//    public Tech(int id,int img, String laptop, String tablet, String mobile, String name, String specs, int price) {
//        this.id = id;
//        this.laptop = laptop;
//        this.tablet = tablet;
//        this.mobile = mobile;
//        this.name = name;
//        this.specs = specs;
//        this.price = price;
//        this.img=img;
//    }
    public Tech(int id,int img, String type, String name, String specs, int price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.specs = specs;
        this.price = price;
        this.img=img;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setImg(int img) {
        this.img=img;
    }
    public int getImg() {
        return img;
    }
//    public String getLaptop() {
//        return laptop;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public void setLaptop(String laptop) {
//        this.laptop = laptop;
//    }
//
//    public String getTablet() {
//        return tablet;
//    }
//
//    public void setTablet(String tablet) {
//        this.tablet = tablet;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
