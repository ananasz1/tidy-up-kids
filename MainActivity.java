package com.example.vikischmideg.tidyup;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.button;
import static android.R.attr.text;
import static android.R.attr.textViewStyle;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    // tracks the score for Kids
    int scoreKid1 = 0;
    int scoreKid2 = 0;

    //initializes values
    int DollNumberOfToys = 8;
    int DollQuantityOfToys = 0;
    int PlushNumberOfToys = 16;
    int PlushQuantityOfToys = 0;
    int CarNumberOfToys = 12;
    int CarQuantityOfToys = 0;
    int BookNumberOfToys = 10;
    int BookQuantityOfToys = 0;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * Value of the toy is added to the actual score if there are remaining toys
     */

    public void K1PushButton(int pointsPerToy) {
            scoreKid1 = scoreKid1 + pointsPerToy;
            displayForKid1(scoreKid1);
        }


    public void K2PushButton(int pointsPerToy) {
            scoreKid2 = scoreKid2 + pointsPerToy;
            displayForKid2(scoreKid2);
        }

    /**
     * Increase the score for Kid 1 by 4 points
     */

    public void addFourForKid1(View view) {
        if (DollQuantityOfToys < DollNumberOfToys) {
            DollQuantityOfToys = DollQuantityOfToys + 1;
            K1PushButton(4);

        }
        //**display the quantity of toys the player has from one type / the maximum */
        TextView txt = (TextView) findViewById(R.id.dollQuantity);
        txt.setText(DollQuantityOfToys + " / " + DollNumberOfToys);


    }
    /**
     * Increase the score for Kid 1 by 3 points
     */
    public void addThreeForKid1(View view) {
        if (PlushQuantityOfToys < PlushNumberOfToys) {
            PlushQuantityOfToys = PlushQuantityOfToys + 1;
            K1PushButton(3);

        }
        //**display the quantity of toys the player has from one type / the maximum*/
        TextView txt = (TextView) findViewById(R.id.plushQuantity);
        txt.setText(PlushQuantityOfToys + " / " + PlushNumberOfToys);
    }
    /**
     * Increase the score for Kid 1 by 2 points
     */
    public void addTwoForKid1(View view) {
        if (CarQuantityOfToys < CarNumberOfToys) {
            CarQuantityOfToys = CarQuantityOfToys + 1;
            K1PushButton(2);

        }
        //**display the quantity of toys the player has from one type / the maximum quantity*/
        TextView txt = (TextView) findViewById(R.id.carQuantity);
        txt.setText(CarQuantityOfToys + " / " + CarNumberOfToys);

    }
    /**
     * Increase the score for Kid 1 by 1 points
     */
    public void addOneForKid1(View view) {
        if (BookQuantityOfToys < BookNumberOfToys) {
            BookQuantityOfToys = BookQuantityOfToys + 1;
            K1PushButton(1);

        }
        //**display the quantity of toys the player has from one type / the maximum quantity*/
        TextView txt = (TextView) findViewById(R.id.bookQuantity);
        txt.setText(BookQuantityOfToys + " / " + BookNumberOfToys);

    }

    /**
     * Displays the given score for Kid 1.
     */
    public void displayForKid1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kid_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Kid 2 by 4 points
     */
    public void addFourForKid2(View view) {
        if (DollQuantityOfToys < DollNumberOfToys) {
            DollQuantityOfToys = DollQuantityOfToys + 1;
            K2PushButton(4);

        }
        //**display the quantity of toys the player has from one type / the maximum*/
        TextView txt = (TextView) findViewById(R.id.dollQuantity);
        txt.setText(DollQuantityOfToys + " / " + DollNumberOfToys);
    }

    /**
     * Increase the score for Kid 2 by 3 points
     */
    public void addThreeForKid2(View view) {
        if (PlushQuantityOfToys < PlushNumberOfToys) {
            PlushQuantityOfToys = PlushQuantityOfToys + 1;
            K2PushButton(3);

        }
        //**display the quantity of toys the player has from one type / the maximum*/
        TextView txt = (TextView) findViewById(R.id.plushQuantity);
        txt.setText(PlushQuantityOfToys + " / " + PlushNumberOfToys);
    }
    /**
     * Increase the score for Kid 2 by 2 points
     */
    public void addTwoForKid2(View view) {
        if (CarQuantityOfToys < CarNumberOfToys) {
            CarQuantityOfToys = CarQuantityOfToys + 1;
            K2PushButton(2);

        }
        //**display the quantity of toys the player has from one type / the maximum*/
        TextView txt = (TextView) findViewById(R.id.carQuantity);
        txt.setText(CarQuantityOfToys + " / " + CarNumberOfToys);
    }
    /**
     * Increase the score for Kid 2 by 1 points
     */
    public void addOneForKid2(View view) {
        if (BookQuantityOfToys < BookNumberOfToys) {
            BookQuantityOfToys = BookQuantityOfToys + 1;
            K2PushButton(1);

        }
        //**display the quantity of toys the player has from one type / the maximum*/
        TextView txt = (TextView) findViewById(R.id.bookQuantity);
        txt.setText(BookQuantityOfToys + " / " + BookNumberOfToys);
    }


    /**
     * Displays the given score for Kid 2.
     */
    public void displayForKid2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kid_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetCounterText(String text, TextView textView) {
        textView.setText(text);
    }


    /**
         * Set the scores to 0
         */
    public void resetScore(View v) {
        scoreKid1 = 0;
        scoreKid2 = 0;
        DollQuantityOfToys = 0;
        PlushQuantityOfToys = 0;
        CarQuantityOfToys = 0;
        BookQuantityOfToys = 0;


        displayForKid1(scoreKid1);
        displayForKid2(scoreKid2);
        displaySetCounterText(DollQuantityOfToys + " / " + DollNumberOfToys, (TextView) findViewById(R.id.dollQuantity));
        displaySetCounterText(PlushQuantityOfToys + " / " + PlushNumberOfToys, (TextView) findViewById(R.id.plushQuantity));
        displaySetCounterText(CarQuantityOfToys + " / " + CarNumberOfToys, (TextView) findViewById(R.id.carQuantity));
        displaySetCounterText(BookQuantityOfToys + " / " + BookNumberOfToys, (TextView) findViewById(R.id.bookQuantity));

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    /**
     * AnyStickButtonPushed method: it reduced the quantity of remained stick till zero. When it is zero, it displays that the game is over.
     */




}


