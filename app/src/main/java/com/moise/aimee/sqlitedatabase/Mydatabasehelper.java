package com.moise.aimee.sqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLDataException;

public class Mydatabasehelper extends SQLiteOpenHelper {
    private final static int DATABASE_VERSION=1;
    private final static String DATABASE_NAME="tasks.db";
    public static final String TABLE_TASKS="tasks";
    public static final String COLUMN_ID=(_id);
    public static final String COLUMN_USERNAME="username";
    public static final String COLUMN_PASSWORD="password";
    public Mydatabasehelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DATABASE_NAME, factory,DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query= " CREATE TABLE " + TABLE_TASKS + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_USERNAME +

               " TEXT " + COLUMN_PASSWORD + "INT" + ");";
        db.execSQL(query);
    }

    public void addTasks(Tasks tasks){

        ContentValues values=new ContentValues();
        values.put(COLUMN_USERNAME,tasks.get_username());
        values.put(COLUMN_PASSWORD,tasks.get_password());
        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_TASKS,null,values);
        db.close();
    }
    public String databasetostring(){
        String dbstring="";
        SQLiteDatabase db= getWritableDatabase();
        String query= " SELECT * FROM " + TABLE_TASKS + " WHERE 1 ";
       Cursor c=db.rawQuery(query,null);
       c.moveToFirst();
        while (!c.isLast()) {
            if (c.getString(c.getColumnIndex("username"))!=null){
                dbstring +=c.getString(c.getColumnIndex("username"));
                dbstring +="\n";
            }
            else if (c.getString(c.getColumnIndex("password"))!=null){
                dbstring +=c.getString(c.getColumnIndex("password"));
                dbstring +="\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbstring;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS "+TABLE_TASKS);
        onCreate(db);
    }
}
