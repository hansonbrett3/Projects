package com.bretthanson.addressbook;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;



// A Class is the blueprint for all of the objects
// All objects have state and behaviors
// Non static fields are instasnce variables meaning that the value is unique to each instance or
// or that particular object
// anything with the static variable -- there is only one copy of this variable
//regardless of how many the class has been instantiated
// the final keyword denotes that the particular field will never change and applies in all instances
// local variables are just fields in a method
// Paramaters are always classified as variables, not fields
// All variables must be declared before they can be used - including stating the variable type
// Arrays are a container object that holds a fixed number od values of a single type

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "addressBook.db";
    public static final String ADDRESS_TABLE_NAME = "addresses";
    public static final String ADDRESS_COLUMN_ID = "id";
    public static final String ADDRESS_COLUMN_FIRST = "first";
    public static final String ADDRESS_COLUMN_LAST = "last";
    public static final String ADDRESS_COLUMN_STREET = "street";
    public static final String ADDRESS_COLUMN_CITY = "city";
    public static final String ADDRESS_COLUMN_STATE = "state";
    public static final String ADDRESS_COLUMN_ZIP = "zip";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE addresses " +
                        "(id integer primary key, first text, last text, street text, city text, state text, zip text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS addresses");
        onCreate(db);
    }

    public boolean addAddress(String first, String last, String street, String city, String state, String zip) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("first", first);
        contentValues.put("last", last);
        contentValues.put("street", street);
        contentValues.put("city", city);
        contentValues.put("state", state);
        contentValues.put("zip", zip);
        db.insert("addresses", null, contentValues);
        return true;
    }

    public Integer deleteAddress(Integer id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("address",
                "id = ?",
                new String[]{
                        Integer.toString(id)
                });
    }

    public boolean updateAddress(Integer id, String first, String last, String street, String city, String state, String zip)
        {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("first", first);
            contentValues.put("last", last);
            contentValues.put("street", street);
            contentValues.put("city", city);
            contentValues.put("state", state);
            contentValues.put("zip", zip);
            db.update("addresses", contentValues, "id = ?", new String[] {Integer.toString(id)});
            return true;
        }

    public ArrayList<String> getAllAddresses()
    {
        ArrayList<String> stringArrayList = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from addresses", null);
        res.moveToFirst();

        while(res.isAfterLast() == false){
            stringArrayList.add(res.getString(res.getColumnIndex(ADDRESS_COLUMN_FIRST)));
            res.moveToNext();
        }
        return stringArrayList;
    }

    public Cursor getData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from addresses where id="+id+"",null);
        return res;
    }
}
