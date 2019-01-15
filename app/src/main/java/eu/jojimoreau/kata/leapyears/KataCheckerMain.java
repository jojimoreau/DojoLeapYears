package eu.jojimoreau.kata.leapyears;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KataCheckerMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_checker_main);

        final Button checkButton = findViewById(R.id.checkButton);
        final EditText yearInput = findViewById(R.id.yearInput);
        final TextView resultLabel = findViewById(R.id.resultLabel);

        checkButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String year = yearInput.getText().toString();
                boolean leapYear;
                String resultText;

                try {
                    leapYear = leapCheck(Integer.parseInt(year));
                    if(leapYear){
                        resultText = "You can enjoy the 29th of February in " + year + ".";
                    }
                    else{
                        resultText = "Your holiday will be 1 day shorter than expected in " + year + ", since there is no 29th of February.";
                    }
                    resultLabel.setTextColor(getColor(R.color.textColorPrimary));
                } catch (NumberFormatException e) {
                    resultText = "The year you entered is too big, please chose something closer to your planned holiday.";
                    resultLabel.setTextColor(getColor(R.color.textColorError));
                }

                resultLabel.setText(resultText);
            }
        });
    }

    protected boolean leapCheck(int year){
        // All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).-->
        // All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
        // All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
        // All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
        if((year % 4 != 0)){
            return false;
        }
        else if(year % 100 != 0){
            return true;
        }
        else if(year % 400 != 0){
            return false;
        }
        else{
            return true;
        }
    }
}
