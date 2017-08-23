package com.example.hoaht.demoanko

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.ManagedSQLiteOpenHelper

/**
 * MyDatabaseHelper.
 *
 * @author HoaHT
 */
class MyDatabaseHelper(context: Context) : ManagedSQLiteOpenHelper(context, "MyDataBase", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}