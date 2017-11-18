package com.example.user.dbmsvslistview;

        import android.content.ContentValues;
        import android.content.Context;
        import android.content.SearchRecentSuggestionsProvider;
        import android.database.Cursor;
        import android.database.DatabaseUtils;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.util.Log;
        import android.widget.Toast;

        import java.util.ArrayList;

/**
 * Created by USER on 22-Mar-17.
 */

public class MyDataBase extends SQLiteOpenHelper{

    public static final int dbv = 1;
    public static String dbname = "my_db";

    Context ct;

    MyDataBase(Context c)
    {
        super(c,dbname,null,dbv);
        ct=c;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        Toast.makeText(ct,"In onCreate", Toast.LENGTH_SHORT).show();

        String s = "create table info (id integer , name text, password text )";
        db.execSQL(s);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

    public void insertValue(Person p)
    {

        SQLiteDatabase sl = getWritableDatabase();

        ContentValues cv = new ContentValues();

        cv.put("id",p.getImage());
        cv.put("name", p.getName());
        cv.put("password", p.getDescription());


        sl.insert("info",null, cv);


        Toast.makeText(ct,"Insertion Completed", Toast.LENGTH_SHORT).show();

    }

    public ArrayList<Person> showValues()
    {
        Toast.makeText(ct,"In Show Values",Toast.LENGTH_SHORT).show();
        SQLiteDatabase sr = getReadableDatabase();

        ArrayList<Person> al = new ArrayList<>();

        String s1 = "select * from info " ;

        Cursor cr = sr.rawQuery(s1,null);


        while (cr.moveToNext())
        {
            int a = cr.getInt(0);
            String s = cr.getString(1);
            String s2 = cr.getString(2);
            Person p1 = new Person();

            p1.setImage(a);
            p1.setName(s);
            p1.setDescription(s2);

            al.add(p1);

        }
        Log.d("DataBase", "Show Completed");

        return al;

    }

}
