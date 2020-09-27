package com.nayan.trisqua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{

        int number;

        public boolean isSquare(){

            double squareRoot = Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot)){

                return true;

            }
            else{

                return false;

            }

        }

        public boolean isTriangular(){

            int count = 1;

            int triangularNumber = 1;

            while(triangularNumber < number){

                count++;

                triangularNumber = triangularNumber + count;
            }

            if(triangularNumber == number){

                return true;
            }else{

                return false;
            }

        }
    }

    public void testNumber(View view) {

        Log.i("info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String message;

        if (editText.getText().toString().isEmpty()) {

            message = "enter a number";

        } else {


            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(editText.getText().toString());

            message = editText.getText().toString();

            if (myNumber.isSquare() && myNumber.isTriangular()) {

                message += " is both square and Triangular Number";

            } else if (myNumber.isSquare()) {

                message += "is square but not an Triangular Number";

            } else if (myNumber.isTriangular()) {

                message += "is Triangular but not square";
            } else {

                message += "is niether triangular nor square";

            }

        }
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
