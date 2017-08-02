package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePoints(View v) {
        teamA = teamA + 3;
        displayForTeamA(teamA);
    }

    public void twoPoints(View v) {
        teamA = teamA + 2;
        displayForTeamA(teamA);
    }

    public void freeThrow(View v) {
        teamA = teamA + 1;
        displayForTeamA(teamA);
    }

    public void threePointsB(View v) {
        teamB = teamB + 3;
        displayForTeamB(teamB);
    }

    public void twoPointsB(View v) {
        teamB = teamB + 2;
        displayForTeamB(teamB);
    }

    public void freeThrowB(View v) {
        teamB = teamB + 1;
        displayForTeamB(teamB);
    }

    public void reset (View v) {
        teamA = 0;
        teamB = 0;
        displayForTeamB(teamB);
        displayForTeamA(teamA);

    }
}
