package com.example.base_app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
@Generated("jsonschema2pojo")

public class HottoResponse {
    public class Budget {
        private String average;
        private String code;
        private String name;

        public String getAverage() {
            return average;
        }
        public void setAverage(String average) {
            this.average = average;
        }
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }


    public class CouponUrls {
        private String pc;
        private String sp;

        public String getPc() {
            return pc;
        }
        public void setPc(String pc) {
            this.pc = pc;
        }
        public String getSp() {
            return sp;
        }
        public void setSp(String sp) {
            this.sp = sp;
        }
    }


    public class Example {
        private Results results;

        public Results getResults() {
            return results;
        }
        public void setResults(Results results) {
            this.results = results;
        }
    }


    public class Genre {
        private String _catch;
        private String code;
        private String name;

        public String getCatch() {
            return _catch;
        }
        public void setCatch(String _catch) {
            this._catch = _catch;
        }
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }


    public class LargeArea {
        private String code;
        private String name;

        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }


    public class LargeServiceArea {
        private String code;
        private String name;

        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }


    public class MiddleArea {
        private String code;
        private String name;

        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }


    public class Mobile {
        private String l;
        private String s;

        public String getL() {
            return l;
        }
        public void setL(String l) {
            this.l = l;
        }
        public String getS() {
            return s;
        }
        public void setS(String s) {
            this.s = s;
        }
    }


    public class Pc {
        private String l;
        private String m;
        private String s;

        public String getL() {
            return l;
        }
        public void setL(String l) {
            this.l = l;
        }
        public String getM() {
            return m;
        }
        public void setM(String m) {
            this.m = m;
        }
        public String getS() {
            return s;
        }
        public void setS(String s) {
            this.s = s;
        }
    }

    public class Photo {
        private Mobile mobile;
        private Pc pc;

        public Mobile getMobile() {
            return mobile;
        }
        public void setMobile(Mobile mobile) {
            this.mobile = mobile;
        }
        public Pc getPc() {
            return pc;
        }
        public void setPc(Pc pc) {
            this.pc = pc;
        }
    }


    public class Results {
        private String apiVersion;
        private Integer resultsAvailable;
        private String resultsReturned;
        private Integer resultsStart;
        private List<Shop> shop = null;

        public String getApiVersion() {
            return apiVersion;
        }
        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }
        public Integer getResultsAvailable() {
            return resultsAvailable;
        }
        public void setResultsAvailable(Integer resultsAvailable) {
            this.resultsAvailable = resultsAvailable;
        }
        public String getResultsReturned() {
            return resultsReturned;
        }
        public void setResultsReturned(String resultsReturned) {
            this.resultsReturned = resultsReturned;
        }
        public Integer getResultsStart() {
            return resultsStart;
        }
        public void setResultsStart(Integer resultsStart) {
            this.resultsStart = resultsStart;
        }
        public List<Shop> getShop() {
            return shop;
        }
        public void setShop(List<Shop> shop) {
            this.shop = shop;
        }
    }


    public class ServiceArea {
        private String code;
        private String name;

        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }


    public static class Shop {
        private String access;
        private String address;
        private String band;
        private String barrierFree;
        private Budget budget;
        private String budgetMemo;
        private Integer capacity;
        private String card;
        private String _catch;
        private String charter;
        private String child;
        private String close;
        private CouponUrls couponUrls;
        private String course;
        private String english;
        private String freeDrink;
        private String freeFood;
        private Genre genre;
        private String horigotatsu;
        private String id;
        private String karaoke;
        private Integer ktaiCoupon;
        private LargeArea largeArea;
        private LargeServiceArea largeServiceArea;
        private Float lat;
        private Float lng;
        private String logoImage;
        private String lunch;
        private MiddleArea middleArea;
        private String midnight;
        private String mobileAccess;
        private String name;
        private String nameKana;
        private String nonSmoking;
        private String open;
        private String otherMemo;
        private String parking;
        private Integer partyCapacity;
        private String pet;
        private Photo photo;
        private String privateRoom;
        private ServiceArea serviceArea;
        private String shopDetailMemo;
        private String show;
        private SmallArea smallArea;
        private String stationName;
        private String tatami;
        private String tv;
        private Urls urls;
        private String wedding;
        private String wifi;
        private SubGenre subGenre;

        public String getAccess() {
            return access;
        }
        public void setAccess(String access) {
            this.access = access;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getBand() {
            return band;
        }
        public void setBand(String band) {
            this.band = band;
        }
        public String getBarrierFree() {
            return barrierFree;
        }
        public void setBarrierFree(String barrierFree) {
            this.barrierFree = barrierFree;
        }
        public Budget getBudget() {
            return budget;
        }
        public void setBudget(Budget budget) {
            this.budget = budget;
        }
        public String getBudgetMemo() {
            return budgetMemo;
        }
        public void setBudgetMemo(String budgetMemo) {
            this.budgetMemo = budgetMemo;
        }
        public Integer getCapacity() {
            return capacity;
        }
        public void setCapacity(Integer capacity) {
            this.capacity = capacity;
        }
        public String getCard() {
            return card;
        }
        public void setCard(String card) {
            this.card = card;
        }
        public String getCatch() {
            return _catch;
        }
        public void setCatch(String _catch) {
            this._catch = _catch;
        }
        public String getCharter() {
            return charter;
        }
        public void setCharter(String charter) {
            this.charter = charter;
        }
        public String getChild() {
            return child;
        }
        public void setChild(String child) {
            this.child = child;
        }
        public String getClose() {
            return close;
        }
        public void setClose(String close) {
            this.close = close;
        }
        public CouponUrls getCouponUrls() {
            return couponUrls;
        }
        public void setCouponUrls(CouponUrls couponUrls) {
            this.couponUrls = couponUrls;
        }
        public String getCourse() {
            return course;
        }
        public void setCourse(String course) {
            this.course = course;
        }
        public String getEnglish() {
            return english;
        }
        public void setEnglish(String english) {
            this.english = english;
        }
        public String getFreeDrink() {
            return freeDrink;
        }
        public void setFreeDrink(String freeDrink) {
            this.freeDrink = freeDrink;
        }
        public String getFreeFood() {
            return freeFood;
        }
        public void setFreeFood(String freeFood) {
            this.freeFood = freeFood;
        }
        public Genre getGenre() {
            return genre;
        }
        public void setGenre(Genre genre) {
            this.genre = genre;
        }
        public String getHorigotatsu() {
            return horigotatsu;
        }
        public void setHorigotatsu(String horigotatsu) {
            this.horigotatsu = horigotatsu;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getKaraoke() {
            return karaoke;
        }
        public void setKaraoke(String karaoke) {
            this.karaoke = karaoke;
        }
        public Integer getKtaiCoupon() {
            return ktaiCoupon;
        }
        public void setKtaiCoupon(Integer ktaiCoupon) {
            this.ktaiCoupon = ktaiCoupon;
        }
        public LargeArea getLargeArea() {
            return largeArea;
        }
        public void setLargeArea(LargeArea largeArea) {
            this.largeArea = largeArea;
        }
        public LargeServiceArea getLargeServiceArea() {
            return largeServiceArea;
        }
        public void setLargeServiceArea(LargeServiceArea largeServiceArea) {
            this.largeServiceArea = largeServiceArea;
        }

        public Float getLat() {
            return lat;
        }

        public void setLat(Float lat) {
            this.lat = lat;
        }

        public Float getLng() {
            return lng;
        }

        public void setLng(Float lng) {
            this.lng = lng;
        }

        public String getLogoImage() {
            return logoImage;
        }

        public void setLogoImage(String logoImage) {
            this.logoImage = logoImage;
        }

        public String getLunch() {
            return lunch;
        }

        public void setLunch(String lunch) {
            this.lunch = lunch;
        }

        public MiddleArea getMiddleArea() {
            return middleArea;
        }

        public void setMiddleArea(MiddleArea middleArea) {
            this.middleArea = middleArea;
        }

        public String getMidnight() {
            return midnight;
        }

        public void setMidnight(String midnight) {
            this.midnight = midnight;
        }

        public String getMobileAccess() {
            return mobileAccess;
        }

        public void setMobileAccess(String mobileAccess) {
            this.mobileAccess = mobileAccess;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameKana() {
            return nameKana;
        }

        public void setNameKana(String nameKana) {
            this.nameKana = nameKana;
        }

        public String getNonSmoking() {
            return nonSmoking;
        }

        public void setNonSmoking(String nonSmoking) {
            this.nonSmoking = nonSmoking;
        }

        public String getOpen() {
            return open;
        }

        public void setOpen(String open) {
            this.open = open;
        }

        public String getOtherMemo() {
            return otherMemo;
        }

        public void setOtherMemo(String otherMemo) {
            this.otherMemo = otherMemo;
        }

        public String getParking() {
            return parking;
        }

        public void setParking(String parking) {
            this.parking = parking;
        }

        public Integer getPartyCapacity() {
            return partyCapacity;
        }

        public void setPartyCapacity(Integer partyCapacity) {
            this.partyCapacity = partyCapacity;
        }

        public String getPet() {
            return pet;
        }

        public void setPet(String pet) {
            this.pet = pet;
        }

        public Photo getPhoto() {
            return photo;
        }

        public void setPhoto(Photo photo) {
            this.photo = photo;
        }

        public String getPrivateRoom() {
            return privateRoom;
        }

        public void setPrivateRoom(String privateRoom) {
            this.privateRoom = privateRoom;
        }

        public ServiceArea getServiceArea() {
            return serviceArea;
        }

        public void setServiceArea(ServiceArea serviceArea) {
            this.serviceArea = serviceArea;
        }

        public String getShopDetailMemo() {
            return shopDetailMemo;
        }

        public void setShopDetailMemo(String shopDetailMemo) {
            this.shopDetailMemo = shopDetailMemo;
        }

        public String getShow() {
            return show;
        }

        public void setShow(String show) {
            this.show = show;
        }

        public SmallArea getSmallArea() {
            return smallArea;
        }

        public void setSmallArea(SmallArea smallArea) {
            this.smallArea = smallArea;
        }

        public String getStationName() {
            return stationName;
        }

        public void setStationName(String stationName) {
            this.stationName = stationName;
        }

        public String getTatami() {
            return tatami;
        }

        public void setTatami(String tatami) {
            this.tatami = tatami;
        }

        public String getTv() {
            return tv;
        }

        public void setTv(String tv) {
            this.tv = tv;
        }

        public Urls getUrls() {
            return urls;
        }

        public void setUrls(Urls urls) {
            this.urls = urls;
        }

        public String getWedding() {
            return wedding;
        }

        public void setWedding(String wedding) {
            this.wedding = wedding;
        }

        public String getWifi() {
            return wifi;
        }

        public void setWifi(String wifi) {
            this.wifi = wifi;
        }

        public SubGenre getSubGenre() {
            return subGenre;
        }

        public void setSubGenre(SubGenre subGenre) {
            this.subGenre = subGenre;
        }
    }

    public class SmallArea {
        private String code;
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class SubGenre {
        private String code;
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Urls {
        private String pc;

        public String getPc() {
            return pc;
        }

        public void setPc(String pc) {
            this.pc = pc;
        }
    }



}
