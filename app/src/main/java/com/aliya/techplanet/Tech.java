package com.aliya.techplanet;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity
public class Tech implements Serializable {

    String soldat;
    int  img;
    @PrimaryKey(autoGenerate = true)
    int id;
    boolean is_sold=false;
    String status="In Stock";
    //for radio buttons
    String type;
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
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
            this.status = status;
        }

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
public String getSoldat() {
    return soldat;
}

    public void setSoldat(String soldat) {
        this.soldat = soldat;
    }

    public boolean isIs_sold() {
        return is_sold;
    }

    public void setIs_sold(boolean is_sold) {
        this.is_sold = is_sold;
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
