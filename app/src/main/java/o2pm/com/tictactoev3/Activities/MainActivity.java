package o2pm.com.tictactoev3.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import o2pm.com.tictactoev3.R;

import static o2pm.com.tictactoev3.Util.Constants.NOTURN;
import static o2pm.com.tictactoev3.Util.Constants.OPLAY;
import static o2pm.com.tictactoev3.Util.Constants.OTURN;
import static o2pm.com.tictactoev3.Util.Constants.XPLAY;
import static o2pm.com.tictactoev3.Util.Constants.XTURN;

public class MainActivity extends AppCompatActivity {

    private TextView title;
    private Button button00;
    private Button button01;
    private Button button02;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button20;
    private Button button21;
    private Button button22;

    private Boolean playerTurn = true; //X Goes first
    private Boolean gameStatus = true; //game is in play when false game is over


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                resetGame();

            }
        });

        title = findViewById(R.id.gameInfoID);
        title.setText(XTURN);


        button00 = findViewById(R.id.button00);
        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);

        button00.setText(NOTURN);
        button01.setText(NOTURN);
        button02.setText(NOTURN);
        button10.setText(NOTURN);
        button11.setText(NOTURN);
        button12.setText(NOTURN);
        button20.setText(NOTURN);
        button21.setText(NOTURN);
        button22.setText(NOTURN);





        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button00.getText() == NOTURN) {
                        if (playerTurn) {
                            button00.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);
                        } else {
                            button00.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }

        });
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button01.getText() == NOTURN) {
                        if (playerTurn) {
                            button01.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);
                        } else {
                            button01.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button02.getText() == NOTURN) {
                        if (playerTurn) {
                            button02.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);
                        } else {
                            button02.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button10.getText() == NOTURN) {
                        if (playerTurn) {
                            button10.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);
                        } else {
                            button10.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button11.getText() == NOTURN) {
                        if (playerTurn) {
                            button11.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);

                        } else {
                            button11.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button12.getText() == NOTURN) {
                        if (playerTurn) {
                            button12.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);
                        } else {
                            button12.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button20.getText() == NOTURN) {
                        if (playerTurn) {
                            button20.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);
                        } else {
                            button20.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button21.getText() == NOTURN) {
                        if (playerTurn) {
                            button21.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);
                        } else {
                            button21.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStatus) {
                    if (button22.getText() == NOTURN) {
                        if (playerTurn) {
                            button22.setText(XPLAY);
                            playerTurn = false;
                            title.setText(OTURN);
                            checkForWinner(gameStatus);
                        } else {
                            button22.setText(OPLAY);
                            playerTurn = true;
                            title.setText(XTURN);
                            checkForWinner(gameStatus);
                        }
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean checkForWinner(Boolean gameStatus) {
        //boolean gameStatus = true - game is in play when false game is over

        if (this.gameStatus) {

            if ((button00.getText() != NOTURN) && (button01.getText() != NOTURN) && (button02.getText() != NOTURN) &&
                    (button10.getText() != NOTURN) && (button11.getText() != NOTURN) && (button12.getText() != NOTURN) &&
                    (button20.getText() != NOTURN) && (button21.getText() != NOTURN) && (button22.getText() != NOTURN))
            {
                title.setText("Tie Game!!");
                this.gameStatus = false;
            }

            if (((button00.getText() == "X") && (button01.getText() == "X") && (button02.getText() == "X")) ||
                    ((button10.getText() == "X") && (button11.getText() == "X") && (button12.getText() == "X")) ||
                    ((button20.getText() == "X") && (button21.getText() == "X") && (button22.getText() == "X")) ||
                    ((button00.getText() == "X") && (button11.getText() == "X") && (button22.getText() == "X")) ||
                    ((button02.getText() == "X") && (button11.getText() == "X") && (button20.getText() == "X")) ||
                    ((button00.getText() == "X") && (button10.getText() == "X") && (button20.getText() == "X")) ||
                    ((button01.getText() == "X") && (button11.getText() == "X") && (button21.getText() == "X")) ||
                    ((button02.getText() == "X") && (button12.getText() == "X") && (button22.getText() == "X")))

            {
                title.setText("X Wins!!");
                this.gameStatus = false;
            }

            else if (((button00.getText() == "O") && (button01.getText() == "O") && (button02.getText() == "O")) ||
                    ((button10.getText() == "O") && (button11.getText() == "O") && (button12.getText() == "O")) ||
                    ((button20.getText() == "O") && (button21.getText() == "O") && (button22.getText() == "O")) ||
                    ((button00.getText() == "O") && (button11.getText() == "O") && (button22.getText() == "O")) ||
                    ((button02.getText() == "O") && (button11.getText() == "O") && (button20.getText() == "O")) ||
                    ((button00.getText() == "O") && (button10.getText() == "O") && (button20.getText() == "O")) ||
                    ((button01.getText() == "O") && (button11.getText() == "O") && (button21.getText() == "O")) ||
                    ((button02.getText() == "O") && (button12.getText() == "O") && (button22.getText() == "O")))
            {
                title.setText("O Wins!!");
                this.gameStatus = false;
            }
        }
        return this.gameStatus;
    }

    public void resetGame() {
        //title.setText(playerTurn.toString());
        button00.setText(NOTURN);
        button01.setText(NOTURN);
        button02.setText(NOTURN);
        button10.setText(NOTURN);
        button11.setText(NOTURN);
        button12.setText(NOTURN);
        button20.setText(NOTURN);
        button21.setText(NOTURN);
        button22.setText(NOTURN);

        gameStatus = true;

        if (playerTurn){
            title.setText(XTURN);
        } else title.setText(OTURN);

    }

}
