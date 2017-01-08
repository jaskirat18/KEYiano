package com.example.jaskirat.keyiano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class final_play extends AppCompatActivity
{

    MediaPlayer player;
    String msg;
    int time;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_play);


        //getting into this activity
        final Intent next = getIntent();
        msg=next.getStringExtra(showcase.CODE);
        s=next.getStringExtra(showcase.SPEED);

        char ch=s.charAt(0);
        int temp=ch-'0';

        switch(temp)
        {
            case 0:time=250;
                break;

            case 1:time=500;
                break;

            case 2:time=1200;
                break;

            default:time=250;
        }



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
        final Button w_two= (Button) findViewById(R.id.two);
        final Button w_three= (Button) findViewById(R.id.three);
        final Button w_four= (Button) findViewById(R.id.four);
        final Button w_five= (Button) findViewById(R.id.five);
        final Button w_six= (Button) findViewById(R.id.six);
        final Button w_seven= (Button) findViewById(R.id.seven);
        final Button w_eight= (Button) findViewById(R.id.eight);
        final Button w_nine= (Button) findViewById(R.id.nine);
        final Button w_ten= (Button) findViewById(R.id.ten);
        final Button b_one= (Button) findViewById(R.id.bone);
        final Button b_two= (Button) findViewById(R.id.btwo);
        final Button b_three= (Button) findViewById(R.id.bthree);
        final Button b_four= (Button) findViewById(R.id.bfour);
        final Button b_five= (Button) findViewById(R.id.bfive);
        final Button b_six= (Button) findViewById(R.id.bsix);
        final Button b_seven= (Button) findViewById(R.id.bseven);

        w_one.setBackgroundResource(R.drawable.w);
        w_two.setBackgroundResource(R.drawable.w);
        w_three.setBackgroundResource(R.drawable.w);
        w_four.setBackgroundResource(R.drawable.w);
        w_five.setBackgroundResource(R.drawable.w);
        w_six.setBackgroundResource(R.drawable.w);
        w_seven.setBackgroundResource(R.drawable.w);
        w_eight.setBackgroundResource(R.drawable.w);
        w_nine.setBackgroundResource(R.drawable.w);
        w_ten.setBackgroundResource(R.drawable.w);

        b_one.setBackgroundResource(R.drawable.blackss);
        b_two.setBackgroundResource(R.drawable.blackss);
        b_three.setBackgroundResource(R.drawable.blackss);
        b_four.setBackgroundResource(R.drawable.blackss);
        b_five.setBackgroundResource(R.drawable.blackss);
        b_six.setBackgroundResource(R.drawable.blackss);
        b_seven.setBackgroundResource(R.drawable.blackss);

        //Button leave=(Button) findViewById(R.id.Back);
        ImageButton leave=(ImageButton) findViewById(R.id.home);

        TextView display=(TextView) findViewById(R.id.val);
        display.setText(msg);

        w_one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(player!=null)
                    player.reset();

                if(one.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_c_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_c_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_c_high);

                player.start();

                w_one.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_one.setBackgroundResource(R.drawable.w);
                    }
                }, 100);

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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_d_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_d_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_d_high);

                player.start();

                w_two.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_two.setBackgroundResource(R.drawable.w);
                    }
                }, 100);

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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_e_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_e_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_e_high);

                player.start();

                w_three.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_three.setBackgroundResource(R.drawable.w);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_f_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_f_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_f_high);

                player.start();

                w_four.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_four.setBackgroundResource(R.drawable.w);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_g_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_g_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_g_high);

                player.start();

                w_five.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_five.setBackgroundResource(R.drawable.w);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_a_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_a_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_a_high);

                player.start();

                w_six.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_six.setBackgroundResource(R.drawable.w);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_b_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_b_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_b_high);

                player.start();

                w_seven.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_seven.setBackgroundResource(R.drawable.w);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_c_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_c_high);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_c_ext);

                player.start();

                w_eight.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_eight.setBackgroundResource(R.drawable.w);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_d_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_d_high);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_d_ext);

                player.start();

                w_nine.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_nine.setBackgroundResource(R.drawable.w);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.cap_e_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_e_high);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.cap_e_ext);

                player.start();

                w_ten.setBackgroundResource(R.drawable.y);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        w_ten.setBackgroundResource(R.drawable.w);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.c_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.c_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.c_high);

                player.start();

                b_one.setBackgroundResource(R.drawable.clikss);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b_one.setBackgroundResource(R.drawable.blackss);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.d_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.d_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.d_high);

                player.start();

                b_two.setBackgroundResource(R.drawable.clikss);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b_two.setBackgroundResource(R.drawable.blackss);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.f_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.f_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.f_high);

                player.start();

                b_three.setBackgroundResource(R.drawable.clikss);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b_three.setBackgroundResource(R.drawable.blackss);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.g_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.g_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.g_high);

                player.start();

                b_four.setBackgroundResource(R.drawable.clikss);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b_four.setBackgroundResource(R.drawable.blackss);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.a_lowest);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.a_mid);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.a_high);

                player.start();

                b_five.setBackgroundResource(R.drawable.clikss);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b_five.setBackgroundResource(R.drawable.blackss);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.c_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.c_high);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.c_ext);

                player.start();

                b_six.setBackgroundResource(R.drawable.clikss);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b_six.setBackgroundResource(R.drawable.blackss);
                    }
                }, 100);
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
                    player=MediaPlayer.create(final_play.this,R.raw.d_mid);

                if(two.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.d_high);

                if(three.isChecked())
                    player=MediaPlayer.create(final_play.this,R.raw.d_ext);

                player.start();

                b_seven.setBackgroundResource(R.drawable.clikss);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b_seven.setBackgroundResource(R.drawable.blackss);
                    }
                }, 100);
            }
        });

        final ImageButton mm=(ImageButton) findViewById(R.id.home);
        //mm.setVisibility(View.GONE);
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });


        ImageButton first=(ImageButton) findViewById(R.id.playButton);
        final ImageButton playing=(ImageButton) findViewById(R.id.playButton);

        first.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(msg.charAt(0)!='<')
                {
                    msg+=" ";
                    mm.setVisibility(View.GONE);
                    playing.setVisibility(View.GONE);
                    method(msg.substring(0,2));

                    Handler one=new Handler();
                    one.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            method(msg.substring(3,5));

                            Handler two=new Handler();
                            two.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    method(msg.substring(6,8));

                                    Handler three=new Handler();
                                    three.postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            method(msg.substring(9,11));

                                            Handler four=new Handler();
                                            four.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    method(msg.substring(12,14));

                                                    Handler five=new Handler();
                                                    five.postDelayed(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            method(msg.substring(15,17));

                                                            Handler six=new Handler();
                                                            six.postDelayed(new Runnable() {
                                                                @Override
                                                                public void run() {
                                                                    method(msg.substring(18,20));

                                                                    Handler seven=new Handler();
                                                                    seven.postDelayed(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                            method(msg.substring(21,23));

                                                                            Handler eight=new Handler();
                                                                            eight.postDelayed(new Runnable() {
                                                                                @Override
                                                                                public void run() {
                                                                                    method(msg.substring(24,26));

                                                                                    Handler nine=new Handler();
                                                                                    nine.postDelayed(new Runnable() {
                                                                                        @Override
                                                                                        public void run() {
                                                                                            method(msg.substring(27,29));

                                                                                            Handler ten=new Handler();
                                                                                            ten.postDelayed(new Runnable() {
                                                                                                @Override
                                                                                                public void run() {
                                                                                                    method("  ");
                                                                                                }
                                                                                            }, time);
                                                                                        }
                                                                                    }, time);
                                                                                }
                                                                            }, time);
                                                                        }
                                                                    }, time);
                                                                }
                                                            }, time);
                                                        }
                                                    }, time);
                                                }
                                            }, time);
                                        }
                                    }, time);

                                }
                            }, time);
                        }
                    }, time);

                }

                else
                    method("  ");

            }
        });

        leave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

    }

    public void method(String ch)
    {
        final Button w_one= (Button) findViewById(R.id.one);
        final Button w_two= (Button) findViewById(R.id.two);
        final Button w_three= (Button) findViewById(R.id.three);
        final Button w_four= (Button) findViewById(R.id.four);
        final Button w_five= (Button) findViewById(R.id.five);
        final Button w_six= (Button) findViewById(R.id.six);
        final Button w_seven= (Button) findViewById(R.id.seven);
        final Button w_eight= (Button) findViewById(R.id.eight);
        final Button w_nine= (Button) findViewById(R.id.nine);
        final Button w_ten= (Button) findViewById(R.id.ten);
        final Button b_one= (Button) findViewById(R.id.bone);
        final Button b_two= (Button) findViewById(R.id.btwo);
        final Button b_three= (Button) findViewById(R.id.bthree);
        final Button b_four= (Button) findViewById(R.id.bfour);
        final Button b_five= (Button) findViewById(R.id.bfive);
        final Button b_six= (Button) findViewById(R.id.bsix);
        final Button b_seven= (Button) findViewById(R.id.bseven);

        final ImageButton mm=(ImageButton) findViewById(R.id.home);
        final ImageButton playing=(ImageButton) findViewById(R.id.playButton);

        final RadioButton one=(RadioButton) findViewById(R.id.low);
        final RadioButton two=(RadioButton) findViewById(R.id.med);
        final RadioButton three=(RadioButton) findViewById(R.id.high);


        //changing music scale

        if(ch.charAt(1)=='1')
            one.performClick();

        if(ch.charAt(1)=='2')
            two.performClick();

        if(ch.charAt(1)=='3')
            three.performClick();

        if(ch.charAt(1)=='4')
            three.performClick();

        //clicking button on keyboard

        if(ch.equals("C1")) {
            w_one.performClick();
        }

        if(ch.equals("D1")) {
            w_two.performClick();
        }

        if(ch.equals("E1")) {
            w_three.performClick();
        }

        if(ch.equals("F1")) {
            w_four.performClick();
        }

        if(ch.equals("G1")) {
            w_five.performClick();
        }

        if(ch.equals("A1")) {
            w_six.performClick();
        }

        if(ch.equals("B1")) {
            w_seven.performClick();
        }

        if(ch.equals("C2")) {
            w_one.performClick();
        }

        if(ch.equals("D2")) {
            w_two.performClick();
        }

        if(ch.equals("E2")) {
            w_three.performClick();
        }

        if(ch.equals("F2")) {
            w_four.performClick();
        }

        if(ch.equals("G2")) {
            w_five.performClick();
        }

        if(ch.equals("A2")) {
            w_six.performClick();
        }

        if(ch.equals("B2")) {
            w_seven.performClick();
        }

        if(ch.equals("C3")) {
            w_one.performClick();
        }

        if(ch.equals("D3")) {
            w_two.performClick();
        }

        if(ch.equals("E3")) {
            w_three.performClick();
        }

        if(ch.equals("F3")) {
            w_four.performClick();
        }

        if(ch.equals("G3")) {
            w_five.performClick();
        }

        if(ch.equals("A3")) {
            w_six.performClick();
        }

        if(ch.equals("B3")) {
            w_seven.performClick();
        }

        if(ch.equals("C4")) {
            w_eight.performClick();
        }

        if(ch.equals("D4")) {
            w_nine.performClick();
        }

        if(ch.equals("E4")) {
            w_ten.performClick();
        }

        if(ch.equals("c1")) {
            b_one.performClick();
        }

        if(ch.equals("d1")) {
            b_two.performClick();
        }

        if(ch.equals("f1")) {
            b_three.performClick();
        }

        if(ch.equals("g1")) {
            b_four.performClick();
        }

        if(ch.equals("a1")) {
            b_five.performClick();
        }

        if(ch.equals("c2")) {
            b_one.performClick();
        }

        if(ch.equals("d2")) {
            b_two.performClick();
        }

        if(ch.equals("f2")) {
            b_three.performClick();
        }

        if(ch.equals("g2")) {
            b_four.performClick();
        }

        if(ch.equals("a2")) {
            b_five.performClick();
        }

        if(ch.equals("c3")) {
            b_one.performClick();
        }

        if(ch.equals("d3")) {
            b_two.performClick();
        }

        if(ch.equals("f3")) {
            b_three.performClick();
        }

        if(ch.equals("g3")) {
            b_four.performClick();
        }

        if(ch.equals("a3")) {
            b_five.performClick();
        }

        if(ch.equals("c4")) {
            b_six.performClick();
        }

        if(ch.equals("d4")) {
            b_seven.performClick();
        }

        if(ch.equals("  ")) {
            if (mm.getVisibility() == View.GONE) {
                mm.setVisibility(View.VISIBLE);
                playing.setVisibility(View.VISIBLE);
            }
        }

    }


    @Override
    public void onResume()
    {
        super.onResume();

        final RadioButton one=(RadioButton) findViewById(R.id.low);
        final RadioButton two=(RadioButton) findViewById(R.id.med);
        final RadioButton three=(RadioButton) findViewById(R.id.high);

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

        if(one.isChecked()) {
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

        }else
        if(two.isChecked())
        {
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

        }else
        {
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
    }

}

