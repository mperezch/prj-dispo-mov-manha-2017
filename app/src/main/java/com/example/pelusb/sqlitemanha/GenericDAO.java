package com.example.pelusb.sqlitemanha;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pelusb on 24/04/17.
 */

public abstract class GenericDAO extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "unileao";
    private static final int VERSAO = 1;
    private String sqlTabelaCliente = "CREATE TABLE IF NOT EXISTS cliente(" +
            "idcliente INT AUTO_INCREMENT," +
            "nome VARCHAR(45) NOT NULL," +
            "endereco VARCHAR(45) NOT NULL," +
            "PRIMARY KEY(idcliente)" +
            ");";

    public GenericDAO(Context context){
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlTabelaCliente);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
