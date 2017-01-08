package com.example.jaskirat.keyiano;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity
{

    public static final int code=123;
    public static final String sendcode="sendcode";

    Intent i;
    static String recording;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recording="<EMPTY>";

        //dialog box for confirming exit

        final AlertDialog.Builder ext = new AlertDialog.Builder(this);
        ext.setMessage("Do you really want to close the app?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        finish();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;

        final ImageButton leave=(ImageButton) findViewById(R.id.exit);

        leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //calling dialog box
                AlertDialog confirm=ext.create();
                //confirm.setTitle("Alert !!!");
                confirm.show();
            }
        });

    }


    public void sendMessage(View view)
    {
        Intent next=new Intent(getApplicationContext(),second.class);
        startActivity(next);
    }

    public void rec(View view)
    {
        i=new Intent(getApplicationContext(),third.class);
        startActivityForResult(i,code);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == code)
        {
            if(resultCode == RESULT_OK)
            {
                final String result= i.getStringExtra(third.EXTRA_DATA);
                recording=result;
            }
        }
    }


    public void show(View view)
    {
        Intent j=new Intent(getApplicationContext(),showcase.class);

        recording=" ";

        try
        {
            FileInputStream fileInputStream=openFileInput("storage_file");
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

            recording=bufferedReader.readLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if((recording==null)||(recording.equals(" ")))
            recording="<EMPTY>";


        j.putExtra(sendcode,recording);
        startActivity(j);
    }

    @Override
    public void onBackPressed()
    {
        final ImageButton back=(ImageButton) findViewById(R.id.exit);
        back.performClick();
    }

}
