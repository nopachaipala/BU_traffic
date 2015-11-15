package bu.nopachai.butraffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ExerciseActivity extends AppCompatActivity {

    //
    private TextView questionTextView;
    private ImageView trafficImageView;
    private RadioGroup choiceRadioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton,
            choice3RadioButton, choice4RadioButton;
    private int timesAnInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        bindWidget();
    }   // Main Method

    public void clickAnswer(View view) {

        String[] strQuestion = new String[5];
        strQuestion[0] = "1. What Is This?";
        strQuestion[1] = "2. What Is This?";
        strQuestion[2] = "3. What Is This?";
        strQuestion[3] = "4. What Is This?";
        strQuestion[4] = "5. What Is This?";

        timesAnInt += 1;

        if (timesAnInt < 5) {

            questionTextView.setText(strQuestion[timesAnInt]);

        } else {

            startActivity(new Intent(ExerciseActivity.this, ScoreActivity.class));

        }


    } // clickAnswer

    private void bindWidget() {
        questionTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView3);
        choiceRadioGroup = (RadioGroup) findViewById(R.id.radChoice);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);

    }
}
