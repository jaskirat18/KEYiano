package com.example.jaskirat.keyiano;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class third extends AppCompatActivity
{

    MediaPlayer player;
    int ctr;
    static String disp;
    Intent next;

    public static final String EXTRA_DATA = "EXTRA_DATA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ctr=0;
        disp="";

        //starting activity
        next=getIntent();


        //dialog box for confirming save

        final AlertDialog.Builder sv = new AlertDialog.Builder(this);
        sv.setMessage("Do you want to save the recording on your device?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        String file_name="storage_file";

                        try
                        {
                            FileOutputStream fileOutputStream=openFileOutput(file_name,MODE_PRIVATE);
                            fileOutputStream.write(disp.getBytes());
                            fileOutputStream.close();
                            //Toast.makeText(getApplicationContext(), "Recording Saved", Toast.LENGTH_LONG).show();

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());

                        try
                        {
                            FileOutputStream fileOutputStream=openFileOutput("timing",MODE_PRIVATE);
                            fileOutputStream.write(currentDateTimeString.getBytes());
                            fileOutputStream.close();
                            Toast.makeText(getApplicationContext(), "Recording Saved", Toast.LENGTH_SHORT).show();

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


        final RadioButton one=(RadioButton) findViewById(R.id.low);
        final RadioButton two=(RadioButton) findViewById(R.id.med);
        final RadioButton three=(RadioButton) findViewById(R.id.high);

        one.setChecked(true);

        final TextView A=(TextView) findViewById(R.id.A);
        final TextView B=(TextView) findViewById(R.id.B);
        final TextView C=(TextView) findViewById(R.id.C);
        final TextView D=(TextView) findViewById(R.id.D);
        final TextView E=(TextView) findViewById(R.id.E);
        final TextView F=(TextView) findViewById(R.id.F);
        final TextView G=(TextView) findViewById(R.id.G);
        final TextView H=(TextView) findViewById(R.id.H);
        final TextView I=(TextView) findViewById(R.id.I);
        final TextView J=(TextView) findViewById(R.id.J);

        final Button a=(Button) findViewById(R.id.bone);
        final Button b=(Button) findViewById(R.id.btwo);
        final Button c=(Button) findViewById(R.id.bthree);
        final Button d=(Button) findViewById(R.id.bfour);
        final Button e=(Button) findViewById(R.id.bfive);
        final Button f=(Button) findViewById(R.id.bsix);
        final Button g=(Button) findViewById(R.id.bseven);

        A.setText("C1");
        B.setText("D1");
        C.setText("E1");
        D.setText("F1");
        E.setText("G1");
        F.setText("A1");
        G.setText("B1");
        H.setText("C2");
        I.setText("D2");
        J.setText("E2");

        a.setText("c1");
        b.setText("d1");
        c.setText("f1");
        d.setText("g1");
        e.setText("a1");
        f.setText("c2");
        g.setText("d2");

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

                A.setText("C1");
                B.setText("D1");
                C.setText("E1");
                D.setText("F1");
                E.setText("G1");
                F.setText("A1");
                G.setText("B1");
                H.setText("C2");
                I.setText("D2");
                J.setText("E2");

                a.setText("c1");
                b.setText("d1");
                c.setText("f1");
                d.setText("g1");
                e.setText("a1");
                f.setText("c2");
                g.setText("d2");

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

                A.setText("C2");
                B.setText("D2");
                C.setText("E2");
                D.setText("F2");
                E.setText("G2");
                F.setText("A2");
                G.setText("B2");
                H.setText("C3");
                I.setText("D3");
                J.setText("E3");

                a.setText("c2");
                b.setText("d2");
                c.setText("f2");
                d.setText("g2");
                e.setText("a2");
                f.setText("c3");
                g.setText("d3");
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

                A.setText("C3");
                B.setText("D3");
                C.setText("E3");
                D.setText("F3");
                E.setText("G3");
                F.setText("A3");
                G.setText("B3");
                H.setText("C4");
                I.setText("D4");
                J.setText("E4");

                a.setText("c3");
                b.setText("d3");
                c.setText("f3");
                d.setText("g3");
                e.setText("a3");
                f.setText("c4");
                g.setText("d4");
            }
        });



        final Button w_one= (Button) findViewById(R.id.one);
        Button w_two= (Button) findViewById(R.id.two);
        Button w_three= (Button) findViewById(R.id.three);
        Button w_four= (Button) findViewById(R.id.four);
        Button w_five= (Button) findViewById(R.id.five);
        Button w_six= (Button) findViewById(R.id.six);
        Button w_seven= (Button) findViewById(R.id.seven);
        Button w_eight= (Button) findViewById(R.id.eight);
        Button w_nine= (Button) findViewById(R.id.nine);
        Button w_ten= (Button) findViewById(R.id.ten);
        Button b_one= (Button) findViewById(R.id.bone);
        Button b_two= (Button) findViewById(R.id.btwo);
        Button b_three= (Button) findViewById(R.id.bthree);
        Button b_four= (Button) findViewById(R.id.bfour);
        Button b_five= (Button) findViewById(R.id.bfive);
        Button b_six= (Button) findViewById(R.id.bsix);
        Button b_seven= (Button) findViewById(R.id.bseven);
        final TextView msg=(TextView) findViewById(R.id.val);


        final ImageButton save_exit = (ImageButton) findViewById(R.id.save);
        save_exit.setVisibility(View.GONE);


        w_one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_c_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_c_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_c_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + A.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });


        w_two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_d_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_d_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_d_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + B.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });


        w_three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_e_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_e_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_e_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + C.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        w_four.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_f_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_f_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_f_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + D.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        w_five.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_g_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_g_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_g_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + E.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });


        w_six.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_a_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_a_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_a_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + F.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });



        w_seven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_b_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_b_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_b_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + G.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        w_eight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_c_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_c_high);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_c_ext);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + H.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        w_nine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_d_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_d_high);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_d_ext);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + I.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        w_ten.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_e_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_e_high);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.cap_e_ext);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + J.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        b_one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.c_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.c_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.c_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + a.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        b_two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.d_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.d_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.d_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + b.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        b_three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.f_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.f_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.f_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + c.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        b_four.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.g_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.g_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.g_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + d.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        b_five.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.a_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.a_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.a_high);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + e.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        b_six.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.c_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.c_high);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.c_ext);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + f.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        b_seven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.d_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.d_high);

                if(three.isChecked())
                    player=MediaPlayer.create(third.this,R.raw.d_ext);

                ++ctr;

                if(ctr>10)
                    save_exit.performClick();
                else {
                    player.start();
                    disp = disp + g.getText().toString();
                    msg.setText(disp);

                    if(ctr==10) {
                        if (save_exit.getVisibility() == View.GONE) {
                            save_exit.setVisibility(View.VISIBLE);
                        }
                    }else
                        disp=disp+".";
                }
            }
        });

        ImageButton mm=(ImageButton) findViewById(R.id.home);

        mm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        save_exit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //call dialog box for confirming saving
                AlertDialog confirm=sv.create();
                //confirm.setTitle("Alert !!!");
                confirm.show();
            }

        });

    }

}
