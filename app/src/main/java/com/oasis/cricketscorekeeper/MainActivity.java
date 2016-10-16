package com.oasis.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mOversA=0, mBallsA=0, mOversB=0, mBallsB=0, mScoreTeamA = 0, mScoreTeamB = 0, mWicketsTeamA = 0, mWicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Increments ball by 1 for Team A
    public void incrementBallByOneForTeamA(View view){
        mBallsA = mBallsA + 1;
        if (mBallsA == 6)
        {
            mBallsA = 0;
            mOversA = mOversA + 1;
            displayOversForTeamA();
        }

        else
            displayOversForTeamA();
    }

    //Displays the balls and overs for Team A
    public void displayOversForTeamA(){
        TextView overTextView = (TextView) findViewById(R.id.team_a_overs);
        overTextView.setText(String.valueOf(mOversA));

        TextView ballTextView = (TextView) findViewById(R.id.team_a_balls);
        ballTextView.setText(String.valueOf(mBallsA));
    }

    //Displays the score for Team A
    public void displayScoreForTeamA(){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(mScoreTeamA));
    }

    //Displays the wickets for Team A
    public void displayWicketsForTeamA(){
        TextView wicketView = (TextView) findViewById(R.id.team_a_wickets);
        wicketView.setText(String.valueOf(mWicketsTeamA));
    }
    //Display All out for Team A
    public void displayAllOutForTeamA(){
        TextView wicketView = (TextView) findViewById(R.id.team_a_wickets);
        wicketView.setText("AO");
    }

    //Increments wicket by one.
    public void incrementWicketForTeamA(View view){
        mWicketsTeamA = mWicketsTeamA + 1;
        if(mWicketsTeamA == 10){
            displayAllOutForTeamA();
            mWicketsTeamA = 0;
        }
        else
        displayWicketsForTeamA();
    }

    //Increments score by 1
    public void incrementScoreByOneForTeamA(View view){
        mScoreTeamA = mScoreTeamA + 1;
        displayScoreForTeamA();
    }

    //Increments score by 2
    public void incrementScoreByTwoForTeamA(View view){
        mScoreTeamA = mScoreTeamA + 2;
        displayScoreForTeamA();
    }

    //Increments score by 3
    public void incrementScoreByThreeForTeamA(View view){
        mScoreTeamA = mScoreTeamA + 3;
        displayScoreForTeamA();
    }

    //Increments score by 4
    public void incrementScoreByFourForTeamA(View view){
        mScoreTeamA = mScoreTeamA + 4;
        displayScoreForTeamA();
    }

    //Increments score by 6
    public void incrementScoreBySixForTeamA(View view){
        mScoreTeamA = mScoreTeamA + 6;
        displayScoreForTeamA();
    }


    // Increments ball by 1 for Team B
    public void incrementBallByOneForTeamB(View view){
        mBallsB = mBallsB + 1;
        if (mBallsB == 6)
        {
            mBallsB = 0;
            mOversB = mOversB + 1;
            displayOversForTeamB();
        }

        else
            displayOversForTeamB();
    }

    //Displays the balls and overs for Team B
    public void displayOversForTeamB(){
        TextView overTextView = (TextView) findViewById(R.id.team_b_overs);
        overTextView.setText(String.valueOf(mOversB));

        TextView ballTextView = (TextView) findViewById(R.id.team_b_balls);
        ballTextView.setText(String.valueOf(mBallsB));
    }

    //Displays the wickets for Team B
    public void displayWicketsForTeamB(){
        TextView wicketView = (TextView) findViewById(R.id.team_b_wickets);
        wicketView.setText(String.valueOf(mWicketsTeamB));
    }

    //Increments wicket by one.
    public void incrementWicketForTeamB(View view){
        mWicketsTeamB = mWicketsTeamB + 1;
        if(mWicketsTeamB == 10) {
            displayAllOutForTeamB();
            mWicketsTeamB = 0;
        }
        else
        displayWicketsForTeamB();
    }

    public void displayAllOutForTeamB(){
        TextView wicketView = (TextView) findViewById(R.id.team_b_wickets);
        wicketView.setText("AO");
    }

    //Displays the score for Team B
    public void displayScoreForTeamB(){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(mScoreTeamB));
    }


    //Increments score by 1
    public void incrementScoreByOneForTeamB(View view){
        mScoreTeamB = mScoreTeamB + 1;
        displayScoreForTeamB();
    }

    //Increments score by 2
    public void incrementScoreByTwoForTeamB(View view){
        mScoreTeamB = mScoreTeamB + 2;
        displayScoreForTeamB();
    }

    //Increments score by 3
    public void incrementScoreByThreeForTeamB(View view){
        mScoreTeamB = mScoreTeamB + 3;
        displayScoreForTeamB();
    }

    //Increments score by 4
    public void incrementScoreByFourForTeamB(View view){
        mScoreTeamB = mScoreTeamB + 4;
        displayScoreForTeamB();
    }

    //Increments score by 6
    public void incrementScoreBySixForTeamB(View view){
        mScoreTeamB = mScoreTeamB + 6;
        displayScoreForTeamB();
    }

    //resets all values
    public void resetAll(View view){
        mWicketsTeamA = 0;
        mWicketsTeamB = 0;
        mBallsA = 0;
        mBallsB = 0;
        mOversA = 0;
        mOversB = 0;
        mScoreTeamA = 0;
        mScoreTeamB = 0;
        displayOversForTeamA();
        displayOversForTeamB();
        displayWicketsForTeamA();
        displayWicketsForTeamB();
        displayScoreForTeamA();
        displayScoreForTeamB();
    }
}
