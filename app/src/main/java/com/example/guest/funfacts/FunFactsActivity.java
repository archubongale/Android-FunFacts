package com.example.guest.funfacts;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign the views from layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);

        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //The button was clicked, so update the fact label with a new fact
                String fact = "";
                // Randomly select a fact
                Random randomGenerator =  new Random(); // Construct a new random number generator
                int randomNumber = randomGenerator.nextInt(3);

                /*Convert the randomNumber to a text fact
                    * 0 = Ants stretch when they wake up in the morning.
                    * 1 = Ostriches can run faster than horses.
                    * 2 = Olympic gold medals are actually made mostly of silver.
                 */

                //if randomNumber equals 0 then
                if (randomNumber == 0 ) {
                    //set fact equal to ants fact
                    fact = "Ants stretch when they wake up in the morning.";
                }else if (randomNumber == 1 ) {
                    fact = "Ostriches can run faster than horses.";
                }else if (randomNumber == 2 ) {
                    fact = "Olympic gold medals are actually made mostly of silver.";
                }
                else {
                    fact = "Sorry there was an error";
                }

                //if randomNumber equals 1 then
                //set fact equal to ostriches fact
                //if randomNumber equals 2 then
                //set fact equal to olympic fact

                //update the label with our dynamic fact


                //update the label with our dynamic fact
                factLabel.setText(fact);

            }

        };
        showFactButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
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
}
