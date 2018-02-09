package com.company.Question_1;

public class Girl extends Main{
    private String Height;
    private String Color;

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = "5'9ft";
    }

    public String getColor() {
        return "blue";

    }

    public void setColor(String color) {
        Color = color;
    }

    public Girl(String height, String color) {
        super(height, color);
        Height = height;
        Color = color;
    }
}
