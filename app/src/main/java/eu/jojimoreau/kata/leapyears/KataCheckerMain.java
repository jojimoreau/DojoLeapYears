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
        return true;
    }
}
