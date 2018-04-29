package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of soccer stats for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int homeShots = 0;
    int homeYellowCards = 0;
    int homeRedCards = 0;
    int awayScore = 0;
    int awayShots = 0;
    int awayYellowCards = 0;
    int awayRedCards = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for the Home team by 1 goal.
     */
    public void addGoalForHome(View v) {
        homeScore = homeScore + 1;
        displayScoreForHome(homeScore);
    }

    /**
     * Increase the shots count by 1 for the Home team.
     */
    public void addOneShotHome(View v) {
        homeShots = homeShots + 1;
        displayShotsHome(homeShots);
    }

    /**
     * Increase the Yellow Card count by 1 for the Home team.
     */
    public void addOneYellowCardHome(View v) {
        homeYellowCards = homeYellowCards + 1;
        displayYellowsHome(homeYellowCards);
    }

    /**
     * Increase the Red Card count by 1 for the Home Team.
     */
    public void addOneRedCardHome(View v) {
        homeRedCards = homeRedCards + 1;
        displayRedsHome(homeRedCards);
    }

    /**
     * Increase the score for the Away team by 1 goal.
     */
    public void addOneGoalForAway(View v) {
        awayScore = awayScore + 1;
        displayScoreForAway(awayScore);
    }

    /**
     * Increase the shot count by 1 for the Away team.
     */
    public void addOneShotAway(View v) {
        awayShots = awayShots + 1;
        displayShotsAway(awayShots);
    }

    /**
     * Increase the Yellow Card count by 1 for the Away team.
     */
    public void addOneYellowCardAway(View v) {
        awayYellowCards = awayYellowCards + 1;
        displayYellowsAway(awayYellowCards);
    }

    /**
     * Increase the Red Card count by 1 for the Away team.
     */
    public void addOneRedCardAway(View v) {
        awayRedCards = awayRedCards + 1;
        displayRedsAway(awayRedCards);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetMatch(View v) {
        homeScore = 0;
        homeShots = 0;
        homeYellowCards = 0;
        homeRedCards = 0;
        awayScore = 0;
        awayShots = 0;
        awayYellowCards = 0;
        awayRedCards = 0;
        displayScoreForHome(homeScore);
        displayShotsHome(homeShots);
        displayYellowsHome(homeYellowCards);
        displayRedsHome(homeRedCards);
        displayScoreForAway(awayScore);
        displayShotsAway(awayShots);
        displayYellowsAway(awayYellowCards);
        displayRedsAway(awayRedCards);

    }

    /**
     * Displays the given score for the Home team.
     */
    public void displayScoreForHome(int score) {
        TextView scoreView = findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Shots count for the Home team.
     */
    public void displayShotsHome(int score) {
        TextView scoreView = findViewById(R.id.shots_home);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Yellow Card count for the Home team.
     */
    public void displayYellowsHome(int score) {
        TextView scoreView = findViewById(R.id.yellow_cards_home);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Red Card count for the Home team.
     */
    public void displayRedsHome(int score) {
        TextView scoreView = findViewById(R.id.red_cards_home);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for the Away team.
     */
    public void displayScoreForAway(int score) {
        TextView scoreView = findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Shots count for the Away team.
     */
    public void displayShotsAway(int score) {
        TextView scoreView = findViewById(R.id.shots_away);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Yellow Card count for the Away team.
     */
    public void displayYellowsAway(int score) {
        TextView scoreView = findViewById(R.id.yellow_cards_away);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Red Card count for the Away team.
     */
    public void displayRedsAway(int score) {
        TextView scoreView = findViewById(R.id.red_cards_away);
        scoreView.setText(String.valueOf(score));
    }
}