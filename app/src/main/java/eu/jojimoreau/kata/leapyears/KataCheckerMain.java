package eu.jojimoreau.kata.leapyears;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class KataCheckerMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_checker_main);
    }

    protected boolean leapCheck(int year){
        // All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).-->
        if((year % 4 != 0)){
            return false;
        }

        // All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
        if(year % 400 == 0){
            return true;
        }

        // All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
        if((year % 4 == 0) && (year % 100 != 0)){
            return true;
        }

        // All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
        if((year % 100 == 0) && (year % 400 != 0)){
            return false;
        }

        return false;
    }
}
