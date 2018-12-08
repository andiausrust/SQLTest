package com.andi.sqltest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DataSource {

    private DBHelper dbHelper;
    SQLiteDatabase sqLiteDatabase;

    public DataSource(Context context) {
        this.dbHelper = new DBHelper(context);
    }

    public void open(){
        sqLiteDatabase = dbHelper.getWritableDatabase();

    }

    public void close(){
        dbHelper.close();
    }

    public void writeDataModelText(ModelText modelText){
        ContentValues contentValues = new ContentValues();
        contentValues.put("text", modelText.getText().toString());
        
    }
}
