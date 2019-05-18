package com.dataproviders.model;


public class DataProvider {

    public String name;
    public int lowest_price;
    public int rating;
    public int max_speed;
    public String description;
    public Long contact_no;
    public String email;
    public String image_url;

    public DataProvider(String name, int lowest_price, int rating, int max_speed, String description, Long contact_no, String email, String image_url) {
        this.name = name;
        this.lowest_price = lowest_price;
        this.rating = rating;
        this.max_speed = max_speed;
        this.description = description;
        this.contact_no = contact_no;
        this.email = email;
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowest_price() {
        return lowest_price;
    }

    public void setLowest_price(int lowest_price) {
        this.lowest_price = lowest_price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getContact_no() {
        return contact_no;
    }

    public void setContact_no(Long contact_no) {
        this.contact_no = contact_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
