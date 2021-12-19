package com.geektech.dz33;

public class ModelLanguages {

    private int image, line;
    private String languages;

    public ModelLanguages(int image, int line, String languages) {
        this.image = image;
        this.line = line;
        this.languages = languages;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
