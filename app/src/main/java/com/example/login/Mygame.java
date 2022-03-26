package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Mygame extends AppCompatActivity {


    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private String startGame="X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5;
    int X_Count=0,O_Count=0,i=0;
    private TextView Player1_ScoreX , Player2_ScoreO;
    private Button Restart;
    int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
    ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mygame);

        btn1=findViewById(R.id.btnimage1);
        btn2=findViewById(R.id.btnimage2);
        btn3=findViewById(R.id.btnimage3);
        btn4=findViewById(R.id.btnimage4);
        btn5=findViewById(R.id.btnimage5);
        btn6=findViewById(R.id.btnimage6);
        btn7=findViewById(R.id.btnimage7);
        btn8=findViewById(R.id.btnimage8);
        btn9=findViewById(R.id.btnimage9);

        Restart=findViewById(R.id.Restart);
        Player1_ScoreX=findViewById(R.id.Player1_ScoreX);
        Player2_ScoreO=findViewById(R.id.Player2_ScoreO);
        logo=findViewById(R.id.logo);






        Restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setImageDrawable(null);
                btn2.setImageDrawable(null);
                btn3.setImageDrawable(null);
                btn4.setImageDrawable(null);
                btn5.setImageDrawable(null);
                btn6.setImageDrawable(null);
                btn7.setImageDrawable(null);
                btn8.setImageDrawable(null);
                btn9.setImageDrawable(null);
                X_Count=0;
                O_Count=0;
                Player1_ScoreX.setText("Player1 ScoreX➡  "+String.valueOf(X_Count));
                Player2_ScoreO.setText("Player2 ScoreO➡  "+String.valueOf(O_Count));

                RestartValue();


            }

        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(c1==0) {

                    if(startGame.equals("X")) {
                        btn1.setImageResource(R.drawable.close);
                        b1 = 1;
                        i++;
                        c1=1;
                    }
                    else {
                        btn1.setImageResource(R.drawable.rec);
                        b1 = 0;
                        i++;
                        c1=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });





        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c2==0)
                {


                    if(startGame.equals("X"))
                    {
                        btn2.setImageResource(R.drawable.close);
                        b2=1;
                        i++;
                        c2=1;
                    }
                    else
                    {
                        btn2.setImageResource(R.drawable.rec);
                        b2=0;
                        i++;
                        c2=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c3==0)
                {
                    if(startGame.equals("X"))
                    {
                        btn3.setImageResource(R.drawable.close);
                        b3=1;
                        i++;
                        c3=1;
                    }
                    else
                    {
                        btn3.setImageResource(R.drawable.rec);
                        b3=0;
                        i++;
                        c3=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }


            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(c4==0)
                {

                    if(startGame.equals("X"))
                    {
                        btn4.setImageResource(R.drawable.close);
                        b4=1;
                        i++;
                        c4=1;
                    }
                    else
                    {
                        btn4.setImageResource(R.drawable.rec);
                        b4=0;
                        i++;
                        c4=1;
                    }
                    choosePlayer();
                    winningGame();


                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c5==0)
                {

                    if(startGame.equals("X"))
                    {
                        btn5.setImageResource(R.drawable.close);
                        b5=1;
                        i++;
                        c5=1;
                    }
                    else
                    {
                        btn5.setImageResource(R.drawable.rec);
                        b5=0;
                        i++;
                        c5=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c6==0)
                {

                    if(startGame.equals("X"))
                    {
                        btn6.setImageResource(R.drawable.close);
                        b6=1;
                        i++;
                        c6=1;
                    }
                    else
                    {
                        btn6.setImageResource(R.drawable.rec);
                        b6=0;
                        i++;
                        c6=1;
                    }
                    choosePlayer();
                    winningGame();


                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(c7==0)
                {

                    if(startGame.equals("X"))
                    {
                        btn7.setImageResource(R.drawable.close);
                        b7=1;
                        i++;
                        c7=1;
                    }
                    else
                    {
                        btn7.setImageResource(R.drawable.rec);
                        b7=0;
                        i++;
                        c7=1;
                    }
                    choosePlayer();
                    winningGame();


                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c8==0)
                {

                    if(startGame.equals("X"))
                    {
                        btn8.setImageResource(R.drawable.close);
                        b8=1;
                        i++;
                        c8=1;
                    }
                    else
                    {
                        btn8.setImageResource(R.drawable.rec);
                        b8=0;
                        i++;
                        c8=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c9==0)
                {

                    if(startGame.equals("X"))
                    {
                        btn9.setImageResource(R.drawable.close);
                        b9=1;
                        i++;
                        c9=1;
                    }
                    else
                    {
                        btn9.setImageResource(R.drawable.rec);
                        b9=0;
                        i++;
                        c9=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Mygame.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


    private void winningGame()
    {


        if((b1==1) && (b2==1) && (b3==1))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            X_Count++;
            Player1_ScoreX.setText("Score X :- "+String.valueOf(X_Count));


        }


        else if((b4==1) && (b5==1) && (b6==1))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            X_Count++;
            Player1_ScoreX.setText("Score X :- "+String.valueOf(X_Count));


        }


        else  if((b7==1) && (b8==1) && (b9==1))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            X_Count++;
            Player1_ScoreX.setText("Score X :- "+String.valueOf(X_Count));





        }

        else  if((b1==1) && (b4==1) && (b7==1))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            X_Count++;
            Player1_ScoreX.setText("Score X :- "+String.valueOf(X_Count));





        }


        else  if((b2==1) && (b5==1) && (b8==1))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            X_Count++;
            Player1_ScoreX.setText("Score X :- "+String.valueOf(X_Count));





        }


        else  if((b3==1) && (b6==1) && (b9==1))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            X_Count++;
            Player1_ScoreX.setText("Score X :- "+String.valueOf(X_Count));





        }


        else  if((b1==1) && (b5==1) && (b9==1))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            X_Count++;
            Player1_ScoreX.setText("Score X :- "+String.valueOf(X_Count));





        }

        else  if((b3==1) && (b5==1) && (b7==1))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            X_Count++;
            Player1_ScoreX.setText("Score X :- "+String.valueOf(X_Count));


        }

        else  if((b1==0) && (b2==0) && (b3==0))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            O_Count++;
            Player2_ScoreO.setText("Score Y :- "+String.valueOf(O_Count));

        }
        else  if((b4==0) && (b5==0) && (b6==0))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            O_Count++;
            Player2_ScoreO.setText("Score Y :- "+String.valueOf(O_Count));

        }



        else  if((b7==0) && (b8==0) && (b9==0))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            O_Count++;
            Player2_ScoreO.setText("Score Y :- "+String.valueOf(O_Count));

        }


        else  if((b1==0) && (b4==0) && (b7==0))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            O_Count++;
            Player2_ScoreO.setText("Score Y :- "+String.valueOf(O_Count));

        }

        else  if((b2==0) && (b5==0) && (b8==0))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            O_Count++;
            Player2_ScoreO.setText("Score Y :- "+String.valueOf(O_Count));

        }
        else  if((b3==0) && (b6==0) && (b9==0))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            O_Count++;
            Player2_ScoreO.setText("Score Y :- "+String.valueOf(O_Count));

        }
        else  if((b1==0) && (b5==0) && (b9==0))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            O_Count++;
            Player2_ScoreO.setText("Score Y :- "+String.valueOf(O_Count));

        }

        else  if((b3==0) && (b5==0) && (b7==0))
        {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    RestartValue();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            O_Count++;
            Player2_ScoreO.setText("Score Y :- "+String.valueOf(O_Count));

        }

        else
        {
            if(i==9)
            {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);

                builder.setMessage("No One Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn1.setImageDrawable(null);
                        btn2.setImageDrawable(null);
                        btn3.setImageDrawable(null);
                        btn4.setImageDrawable(null);
                        btn5.setImageDrawable(null);
                        btn6.setImageDrawable(null);
                        btn7.setImageDrawable(null);
                        btn8.setImageDrawable(null);
                        btn9.setImageDrawable(null);
                        RestartValue();
                    }
                });

                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }

        }

    }


    private void choosePlayer()
    {
        if(startGame.equals("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }


    private void RestartValue() {

        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
        i=0;
        c1=0;
        c2=0;
        c3=0;
        c4=0;
        c5=0;
        c6=0;
        c7=0;
        c8=0;
        c9=0;


    }
}