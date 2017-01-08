package com.example.jaskirat.keyiano;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class showcase extends AppCompatActivity
{

    static String time;
    public static final String CODE="abc";
    public static final String SPEED="def";

    private int value=0;
    final CharSequence myList[] = { "Fast", "Medium", "Slow" };
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcase);


        Intent i=getIntent();
        final String message=i.getStringExtra(MainActivity.sendcode);

        TextView disp=(TextView) findViewById(R.id.recording);
        disp.setText(message);

        time=" ";

        try
        {
            FileInputStream fileInputStream=openFileInput("timing");
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

            time=bufferedReader.readLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if((time==null)||(time.equals(" ")==true))
            time="<TIME,DATE>";

        TextView line2=(TextView) findViewById(R.id.date_time);
        line2.setText(time);

        final RadioButton one=(RadioButton) findViewById(R.id.low);
        final RadioButton two=(RadioButton) findViewById(R.id.med);
        final RadioButton three=(RadioButton) findViewById(R.id.high);
        final ImageView pic=(ImageView) findViewById(R.id.abc);

        one.setChecked(true);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(two.isChecked()==true)
                {
                    two.setChecked(false);
                    one.setChecked(true);
                }
                else
                {
                    three.setChecked(false);
                    one.setChecked(true);
                }

                pic.setImageResource(R.drawable.c1_canvas_pic);

            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(one.isChecked()==true)
                {
                    one.setChecked(false);
                    two.setChecked(true);
                }
                else
                {
                    three.setChecked(false);
                    two.setChecked(true);
                }

                pic.setImageResource(R.drawable.c2_canvas_pic);

            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(two.isChecked()==true)
                {
                    two.setChecked(false);
                    three.setChecked(true);
                }
                else
                {
                    one.setChecked(false);
                    three.setChecked(true);
                }

                pic.setImageResource(R.drawable.c3_canvas_pic);

            }
        });


        //dialog box for speed

        final AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setTitle("Set the playing speed for recording :");
        ad.setSingleChoiceItems(myList, 0,  new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1)
            {
                switch(arg1)
                {
                    case 0:value=0;
                        break;

                    case 1:value=1;
                        break;

                    case 2:value=2;
                        break;

                    default:value=0;
                }
            }
        });


        ad.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                s1=Integer.toString(value);

                Intent next = new Intent(getApplicationContext(), final_play.class);
                next.putExtra(CODE, message);
                next.putExtra(SPEED,s1);
                startActivity(next);
            }
        });

        ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                //dialog box closed
            }
        });


        //dialog box for confirming deletion

        final AlertDialog.Builder del = new AlertDialog.Builder(this);
        del.setMessage("Do you want to permanently remove the recording from your device?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        String temp="";

                        try
                        {
                            FileOutputStream fileOutputStream=openFileOutput("timing",MODE_PRIVATE);
                            fileOutputStream.write(temp.getBytes());
                            fileOutputStream.close();

                            FileOutputStream f=openFileOutput("storage_file",MODE_PRIVATE);
                            f.write(temp.getBytes());
                            f.close();

                            Toast.makeText(getApplicationContext(), "Recording Removed", Toast.LENGTH_SHORT).show();

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        finish();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;

        ImageButton remove=(ImageButton) findViewById(R.id.delete);

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                //call dialog box for confirming deletion
                AlertDialog confirm=del.create();
                //confirm.setTitle("Alert !!!");
                confirm.show();
            }
        });

        ImageButton playing=(ImageButton) findViewById(R.id.view_play);

        playing.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ad.show();
            }
        });

        if(time.charAt(0)=='<')
        {
            playing.setVisibility(View.GONE);
            remove.setVisibility(View.GONE);
        }

    }

    public void exit(View view)
    {
        finish();
    }

}

