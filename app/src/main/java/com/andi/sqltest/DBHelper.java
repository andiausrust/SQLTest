package com.andi.sqltest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static java.sql.Types.NULL;

public class DBHelper extends SQLiteOpenHelper {

    private final static String DBNAME = "testDB";
    private final static int DBVERSION = 1;

    private static final String TABLE = "CREATE TABLE `testtext` (\n" +
            "\t`_id`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "\t`text`\tTEXT NOT NULL\n" +
            ");";

    public DBHelper(Context context) {
        super(context, DBNAME, null, DBVERSION);
        Log.i("DBLog", " " + getDatabaseName());
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
