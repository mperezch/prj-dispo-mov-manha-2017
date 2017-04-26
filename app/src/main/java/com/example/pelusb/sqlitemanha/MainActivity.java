package com.example.pelusb.sqlitemanha;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtNome = (EditText) findViewById(R.id.edtNome);
        final EditText edtEndereco = (EditText) findViewById(R.id.edtEnd);
        Button btSalvar = (Button) findViewById(R.id.btSalvar);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNome.getText().toString().isEmpty() ||
                        edtEndereco.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Preencha todos os campos!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    ClienteDAO clienteDAO = new ClienteDAO(MainActivity.this);
                    Cliente cliente = new Cliente();
                    cliente.setNome(edtNome.getText().toString());
                    cliente.setEndereco(edtEndereco.getText().toString());
                    clienteDAO.salvar(cliente);

                    Toast.makeText(MainActivity.this, "Cliente Salvo!",
                            Toast.LENGTH_SHORT).show();
                    edtNome.setText("");
                    edtEndereco.setText("");
                }
            }
        });
    }
}


















