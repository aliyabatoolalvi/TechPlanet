package com.aliya.techplanet;

public class Tech {
    int  img;
    int id;
    //for radio buttons
    String laptop;
    String tablet;
    String mobile;
    String name;
    String specs;
    int price;

    public Tech(int id,int img, String laptop, String tablet, String mobile, String name, String specs, int price) {
        this.id = id;
        this.laptop = laptop;
        this.tablet = tablet;
        this.mobile = mobile;
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
    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    public String getTablet() {
        return tablet;
    }

    public void setTablet(String tablet) {
        this.tablet = tablet;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

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
