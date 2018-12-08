package com.andi.sqltest;

public class ModelText {

    int _id;
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ModelText() {
    }

    public ModelText(int _id, String text) {

        this._id = _id;
        this.text = text;
    }

    public ModelText(String text) {
        this.text = text;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
