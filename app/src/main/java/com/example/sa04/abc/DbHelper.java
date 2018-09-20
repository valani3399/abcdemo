package com.example.sa04.abc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {
    static Context context;

    public static String DATABASE_NAME = "EmployeeRecords";

    public static final String TABLE1_NAME = "employee";
    public static final String ROOLNO= "rollno";
    public static final String NAME = "name";
    public static final String BLOODGROUP = "bloodgroup";


    public String CREATE_TABLE1 = "CREATE TABLE " + TABLE1_NAME + "(" +
            ROOLNO + " TEXT , " +
            NAME + " TEXT , " +
            BLOODGROUP + " TEXT)";

    private String DROP_USER_TABLE = "DROP TABLE IF EXISTS " + TABLE1_NAME;

    public DbHelper(Context context) {
        super(context, context.getExternalFilesDir(null).getAbsolutePath()
                + "/" + DATABASE_NAME, null, 1);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE1);
        Log.e("Table is created","....................!");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_USER_TABLE);
        onCreate(db);
    }

    public boolean inserRecord(String rollno, String name, String bloodgroup) {
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cValues = new ContentValues();
            cValues.put(ROOLNO, rollno);
            cValues.put(NAME, name);
            cValues.put(BLOODGROUP, bloodgroup);
            db.insert(TABLE1_NAME, null, cValues);
            db.close();
            Log.e(TABLE1_NAME, "created---------");
            return true;
        } catch (Exception e) {
            Log.e("inserRecord", e + "");
        }
        return false;
    }

    public Cursor getUsersList() {

        // array of columns to fetch
        String[] columns = {
                DbHelper.ROOLNO,
                DbHelper.NAME,
                DbHelper.BLOODGROUP,
        };
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE1_NAME, //Table to query
                columns,                    //columns to return
                null,                  //columns for the WHERE clause
                null,              //The values for the WHERE clause
                null,                       //group the rows
                null,                      //filter by row groups
                null);                      //The sort order
        return cursor;
    }
}
