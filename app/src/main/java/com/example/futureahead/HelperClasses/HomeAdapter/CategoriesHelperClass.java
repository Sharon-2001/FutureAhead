package com.example.futureahead.HelperClasses.HomeAdapter;

import android.graphics.drawable.GradientDrawable;
import android.widget.RelativeLayout;

public class CategoriesHelperClass {
    int image;
    String title;
    GradientDrawable gradient;

    public CategoriesHelperClass(int image, String title, GradientDrawable gradient) {
        this.image = image;
        this.title = title;
        this.gradient = gradient;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public GradientDrawable getGradient() {
        return gradient;
    }
}
