package com.example.sa04.abc.Model;

public class AppModel {
    String rollNo,name,bloodGroup,tv;
    String number,count;
    Integer image;



    public void setCount(String count) {
        this.count = String.valueOf(count);
    }

    public String getCount() {
        return count;
    }

    public void setNumber(int number) {
        this.number = String.valueOf(number);
    }

    public String getNumber() {
        return number;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
    public String getTv() {
        return tv;
    }


    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
