package com.androiduptodate.telanganatourism;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



    public class DatabaseHelper extends SQLiteOpenHelper {

        public static final String DATABASE_NAME = "people.db";
        public static final String TABLE_NAME = "people_table";
        public static final String COL1 = "ID";
        public static final String COL2 = "NAME";
        public static final String COL3 = "EMAIL";
        public static final String COL4 = "PASSWORD";
        public static final String col5 = "CONFIRM_PASSWORD";


        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    " NAME TEXT, EMAIL TEXT, PASSWORD TEXT, CONFIRM_PASSWORD TEXT)";
            db.execSQL(createTable);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }


        public boolean addData(String name, String email, String password, String confirmpassword) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL2, name);
            contentValues.put(COL3, email);
            contentValues.put(COL3, password);
            contentValues.put(col5, confirmpassword);

            long result = db.insert(TABLE_NAME, null, contentValues);

            if (result == -1) {
                return false;
            } else {
                return true;
            }
        }


        public boolean updateData(String id, String name, String email, String password, String confirmpassword) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL1, id);
            contentValues.put(COL2, name);
            contentValues.put(COL3, email);
            contentValues.put(COL4, password);
            contentValues.put(col5, confirmpassword);
            db.update(TABLE_NAME, contentValues, "ID = ?", new String[]{id});
            return true;
        }
    }