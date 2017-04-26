package com.example.pelusb.sqlitemanha;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by pelusb on 24/04/17.
 */

public class ClienteDAO extends GenericDAO implements DAO<Cliente>{

    private SQLiteDatabase dataBase;

    public ClienteDAO(Context context){
        super(context);
        dataBase = getWritableDatabase();
    }

    @Override
    public boolean salvar(Cliente cliente) {
        dataBase.execSQL("INSERT INTO cliente(nome, endereco)" +
                " VALUES('"+cliente.getNome()+"','"+cliente.getEndereco()+"')");
        return false;
    }
}
