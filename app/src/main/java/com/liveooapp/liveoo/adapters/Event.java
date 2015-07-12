package com.liveooapp.liveoo.adapters;

public class Event {

    private String mTitle;
    private String mCategory;
    private String mDateTime;
    private String mLocation;
    private String mPrice;

    public Event() {
        // TODO: Remove empty constructor when using Retrofit
    }

    public String getTitle() {
        return "Steak, Chips and Cocktail";
    }

    public String getCategory() {
        return "Food and Drink";
    }

    public String getDateTime() {
        return "May 19th @ 7:30 pm";
    }

    public String getLocation() {
        return "Vine Bar, Surufere";
    }

    public String getPrice() {
        return "₦5000";
    }
}
