package com.stiven.ejemplomaterialdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addText(View view){
        boolean wrapInScrollView = false;
        new MaterialDialog.Builder(this)
                .title("Add Text Custom Dialog")
                .customView(R.layout.custom_dialog, wrapInScrollView)
                .positiveText("Add")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog dialog, DialogAction which) {
                        TextView textView = (TextView) findViewById(R.id.tv_text);

                        View view = dialog.getCustomView();
                        EditText etText_dialog = (EditText) view.findViewById(R.id.etText_dialog);

                        String text = etText_dialog.getText().toString();

                        textView.setText(text);

                        Toast.makeText(getBaseContext(),"Text Added",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
        Toast.makeText(getBaseContext(),"hello",Toast.LENGTH_SHORT).show();
    }


}
