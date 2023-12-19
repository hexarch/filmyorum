package com.example.filmyorum;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class YorumDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "yorumlar.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_YORUMLAR = "yorumlar";
    public static final String COLUMN_YORUM = "yorum";

    public YorumDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_YORUMLAR = "CREATE TABLE " + TABLE_YORUMLAR +
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_YORUM + " TEXT);";
        db.execSQL(CREATE_TABLE_YORUMLAR);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_YORUMLAR);
        onCreate(db);
    }

    public void addYorum(String yorum) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_YORUM, yorum);
        db.insert(TABLE_YORUMLAR, null, values);
        db.close();
    }

    public Cursor getAllYorumlar() {
        String query = "SELECT * FROM " + TABLE_YORUMLAR;
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery(query, null);
    }
    // YorumDatabaseHelper sınıfına ekleyeceğiniz metod
    public void deleteAllYorumlar() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_YORUMLAR, null, null);
        db.close();
    }

}
