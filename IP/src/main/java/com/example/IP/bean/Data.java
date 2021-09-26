package com.example.IP.bean;

public class Data {
    private String country;//国家
    private String region;//省
    private String city;//市
    private String district;//区
    private String telecom;//运营商
    private String zip;//邮编
    private String zone;//地区区号

    @Override
    public String toString() {
        return
                 country + " " +
                 region + " " +
                 city + " " +
                 district + " " +
                 telecom + " " +
                 "邮编" + zip + " " +
                 "区号" + zone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTelecom() {
        return telecom;
    }

    public void setTelecom(String telecom) {
        this.telecom = telecom;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}

