package com.syntax.magicscontender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int pointsCounterPlayerA = 0;
    int mulligansCounterPlayerA = 0;
    int pointsCounterPlayerB = 0;
    int mulligansCounterPlayerB = 0;

    //views methods
    public void PointsTextViewPlayerA(int points) {
        TextView PointsPlayerA = findViewById(R.id.player_A_points_text_view);
        PointsPlayerA.setText("" + points);

    }

    public void MulligansTextViewPlayerA(int points) {
        TextView MulligansPlayerA = findViewById(R.id.player_A_mulligans_text_view);
        MulligansPlayerA.setText("" + points);

    }

    public void PointsTextViewPlayerB(int points) {
        TextView PointsPlayerB = findViewById(R.id.player_B_points_text_view);
        PointsPlayerB.setText("" + points);
    }

    public void MulligansTextViewPlayerB(int points) {
        TextView MulligansPlayerB = findViewById(R.id.player_B_mulligans_text_view);
        MulligansPlayerB.setText("" + points);

    }

    //points methods

    public void WinpointsPlayerA(View view) {
        pointsCounterPlayerA = pointsCounterPlayerA + 3;
        PointsTextViewPlayerA(pointsCounterPlayerA);
    }

    public void DrawpointsPlayerA(View view) {
        pointsCounterPlayerA = pointsCounterPlayerA + 1;
        PointsTextViewPlayerA(pointsCounterPlayerA);
    }

    public void MulligansPlayerA(View view) {

        mulligansCounterPlayerA = mulligansCounterPlayerA + 1;
        MulligansTextViewPlayerA(mulligansCounterPlayerA);
    }
    //player B

    public void WinpointsPlayerB(View view) {
        pointsCounterPlayerB = pointsCounterPlayerB + 3;
        PointsTextViewPlayerB(pointsCounterPlayerB);
    }

    public void DrawpointsPlayerB(View view) {
        pointsCounterPlayerB = pointsCounterPlayerB + 1;
        PointsTextViewPlayerB(pointsCounterPlayerB);
    }

    public void MulligansPlayerB(View view) {

        mulligansCounterPlayerB = mulligansCounterPlayerB + 1;
        MulligansTextViewPlayerA(mulligansCounterPlayerB);
    }

    //Reset Button
    public void ResetButton(View view){
         pointsCounterPlayerA = 0;
         mulligansCounterPlayerA = 0;
         pointsCounterPlayerB = 0;
         mulligansCounterPlayerB = 0;

        PointsTextViewPlayerA(pointsCounterPlayerA);
        MulligansTextViewPlayerA(mulligansCounterPlayerA);
        PointsTextViewPlayerB(pointsCounterPlayerB);
        MulligansTextViewPlayerA(mulligansCounterPlayerB);

    }

}
