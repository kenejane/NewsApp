package com.example.user.newsapp;

/**
 * Created by USER on 11/25/2017.
 */

public class News {
    private String mTitle;
    private String mAuthor;
    private String mSection;
    private String mDate;
    private String mUrl;

    public News(String title, String author, String section, String date, String url) {
        mTitle = title;
        mAuthor = author;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
