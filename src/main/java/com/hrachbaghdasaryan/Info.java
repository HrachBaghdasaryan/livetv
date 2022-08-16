package com.hrachbaghdasaryan;

public class Info {
    private final String url;
    private final String name;
    private final String date;
    private final String type;

    public Info(String url, String name, String date, String type) {
        this.url = url;
        this.name = name;
        this.date = date;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }
}
