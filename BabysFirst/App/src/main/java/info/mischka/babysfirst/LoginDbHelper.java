package info.mischka.babysfirst;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mischka on 12/5/13.
 */
public class LoginDbHelper extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "BabysFirstLogin.db";

    public LoginDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE login (username TEXT PRIMARY KEY, password TEXT);");

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS login");
        onCreate(db);

    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
