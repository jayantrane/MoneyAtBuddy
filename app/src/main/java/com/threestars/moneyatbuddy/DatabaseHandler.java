package com.threestars.moneyatbuddy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jayant on 05-09-2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final String TAG ="Database Handler";

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "moneydb";
  //  private static final String TABLE_NAME = "t_locationBox";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PAIDMONEY = "paidmoney";
    public SQLiteDatabase sqLiteDatabase;


    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
      //  sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void createTable(String tableName){
        SQLiteDatabase db=this.getWritableDatabase();

        String CREATE_TABLE = "CREATE TABLE " + tableName + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_NAME + " TEXT," +KEY_PAIDMONEY + " INT " +")";
        db.execSQL(CREATE_TABLE);

        Log.e("TAG","Create table successful");
    }





    }





}
