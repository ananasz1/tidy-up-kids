package com.example.vikischmideg.tidyup;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;


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

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;

    TextView displayKid1;
    TextView displayKid2;
    TextView displayDoll;
    TextView displayPlush;
    TextView displayCar;
    TextView displayBook;

    static final String STATE_KID1_SCORE = "scoreKid1";
    static final String STATE_KID2_SCORE = "scoreKid2";
    static final String STATE_DOLL = "quantityOfDoll";
    static final String STATE_PLUSH = "quantityOfplush";
    static final String STATE_CAR = "quantityOfCar";
    static final String STATE_BOOK = "quantityOfBook";

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private com.google.android.gms.common.api.GoogleApiClient client2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        displayKid1 = (TextView) findViewById(R.id.kid_1_score);
        displayKid2 = (TextView) findViewById(R.id.kid_2_score);
        displayDoll = (TextView) findViewById(R.id.dollQuantity);
        displayPlush = (TextView) findViewById(R.id.plushQuantity);
        displayCar = (TextView) findViewById(R.id.carQuantity);
        displayBook = (TextView) findViewById(R.id.bookQuantity);

        button1 = (Button) findViewById(R.id.fourKid1);
        button2 = (Button) findViewById(R.id.threeKid1);
        button3 = (Button) findViewById(R.id.twoKid1);
        button4 = (Button) findViewById(R.id.oneKid1);
        button5 = (Button) findViewById(R.id.fourKid2);
        button6 = (Button) findViewById(R.id.threeKid2);
        button7 = (Button) findViewById(R.id.twoKid2);
        button8 = (Button) findViewById(R.id.oneKid2);



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2 = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    }


    /**
     * Set to save and restore activity state step by step. It doesn't allow to the app to forget the values when rotating
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_KID1_SCORE, scoreKid1);
        savedInstanceState.putInt(STATE_KID2_SCORE, scoreKid2);
        savedInstanceState.putInt(STATE_DOLL, DollQuantityOfToys);
        savedInstanceState.putInt(STATE_PLUSH, PlushQuantityOfToys);
        savedInstanceState.putInt(STATE_CAR, CarQuantityOfToys);
        savedInstanceState.putInt(STATE_BOOK, BookQuantityOfToys);

        savedInstanceState.putBoolean("state_button1", button1.isEnabled());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreKid1 = savedInstanceState.getInt(STATE_KID1_SCORE);
        scoreKid2 = savedInstanceState.getInt(STATE_KID2_SCORE);
        DollQuantityOfToys = savedInstanceState.getInt(STATE_DOLL);
        PlushQuantityOfToys = savedInstanceState.getInt(STATE_PLUSH);
        CarQuantityOfToys = savedInstanceState.getInt(STATE_CAR);
        BookQuantityOfToys = savedInstanceState.getInt(STATE_BOOK);
        Boolean enabled = savedInstanceState.getBoolean("state_button1");
        button1.setEnabled(enabled);

        redisplay();
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

        } else {
            button1.setEnabled(false);
            button1.setClickable(false);
            button1.setBackgroundResource(R.drawable.shape_button_inactive);
            button5.setEnabled(false);
            button5.setClickable(false);
            button5.setBackgroundResource(R.drawable.shape_button_inactive);

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
        } else {
            button2.setEnabled(false);
            button2.setClickable(false);
            button2.setBackgroundResource(R.drawable.shape_button_inactive);
            button6.setEnabled(false);
            button6.setClickable(false);
            button6.setBackgroundResource(R.drawable.shape_button_inactive);
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
        } else {
            button3.setEnabled(false);
            button3.setClickable(false);
            button3.setBackgroundResource(R.drawable.shape_button_inactive);
            button7.setEnabled(false);
            button7.setClickable(false);
            button7.setBackgroundResource(R.drawable.shape_button_inactive);
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
        } else {
            button4.setEnabled(false);
            button4.setClickable(false);
            button4.setBackgroundResource(R.drawable.shape_button_inactive);
            button8.setEnabled(false);
            button8.setClickable(false);
            button8.setBackgroundResource(R.drawable.shape_button_inactive);
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
        } else {
            button1.setEnabled(false);
            button1.setClickable(false);
            button1.setBackgroundResource(R.drawable.shape_button_inactive);
            button5.setEnabled(false);
            button5.setClickable(false);
            button5.setBackgroundResource(R.drawable.shape_button_inactive);

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
        } else {
            button2.setEnabled(false);
            button2.setClickable(false);
            button2.setBackgroundResource(R.drawable.shape_button_inactive);
            button6.setEnabled(false);
            button6.setClickable(false);
            button6.setBackgroundResource(R.drawable.shape_button_inactive);

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
        } else {
            button3.setEnabled(false);
            button3.setClickable(false);
            button3.setBackgroundResource(R.drawable.shape_button_inactive);
            button7.setEnabled(false);
            button7.setClickable(false);
            button7.setBackgroundResource(R.drawable.shape_button_inactive);
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
        } else {
            button4.setEnabled(false);
            button4.setClickable(false);
            button4.setBackgroundResource(R.drawable.shape_button_inactive);
            button8.setEnabled(false);
            button8.setClickable(false);
            button8.setBackgroundResource(R.drawable.shape_button_inactive);
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
        View Button1 = findViewById(R.id.fourKid1);
        View Button2 = findViewById(R.id.threeKid1);
        View Button3 = findViewById(R.id.twoKid1);
        View Button4 = findViewById(R.id.oneKid1);
        View Button5 = findViewById(R.id.fourKid2);
        View Button6 = findViewById(R.id.threeKid2);
        View Button7 = findViewById(R.id.twoKid2);
        View Button8 = findViewById(R.id.oneKid2);


        displayForKid1(scoreKid1);
        displayForKid2(scoreKid2);
        displaySetCounterText(DollQuantityOfToys + " / " + DollNumberOfToys, (TextView) findViewById(R.id.dollQuantity));
        displaySetCounterText(PlushQuantityOfToys + " / " + PlushNumberOfToys, (TextView) findViewById(R.id.plushQuantity));
        displaySetCounterText(CarQuantityOfToys + " / " + CarNumberOfToys, (TextView) findViewById(R.id.carQuantity));
        displaySetCounterText(BookQuantityOfToys + " / " + BookNumberOfToys, (TextView) findViewById(R.id.bookQuantity));

        Button1.setBackgroundResource(R.drawable.shape_button_green);
        Button1.setClickable(true);
        Button1.setEnabled(true);
        Button2.setBackgroundResource(R.drawable.shape_button_green);
        Button2.setClickable(true);
        Button2.setEnabled(true);
        Button3.setBackgroundResource(R.drawable.shape_button_green);
        Button3.setClickable(true);
        Button3.setEnabled(true);
        Button4.setBackgroundResource(R.drawable.shape_button_green);
        Button4.setClickable(true);
        Button4.setEnabled(true);
        Button5.setBackgroundResource(R.drawable.shape_button_purple);
        Button5.setClickable(true);
        Button5.setEnabled(true);
        Button6.setBackgroundResource(R.drawable.shape_button_purple);
        Button6.setClickable(true);
        Button6.setEnabled(true);
        Button7.setBackgroundResource(R.drawable.shape_button_purple);
        Button7.setClickable(true);
        Button7.setEnabled(true);
        Button8.setBackgroundResource(R.drawable.shape_button_purple);
        Button8.setClickable(true);
        Button8.setEnabled(true);


    }

    /**
     * Display the quantity after onRestore
     */
    public Button redisplay() {
        displayKid1.setText(String.valueOf(scoreKid1));
        displayKid2.setText(String.valueOf(scoreKid2));
        displayDoll.setText(String.valueOf(DollQuantityOfToys + " / " + DollNumberOfToys));
        displayPlush.setText(String.valueOf(PlushQuantityOfToys + " / " + PlushNumberOfToys));
        displayCar.setText(String.valueOf(CarQuantityOfToys + " / " + CarNumberOfToys));
        displayBook.setText(String.valueOf(BookQuantityOfToys + " / " + BookNumberOfToys));



        return null;
    }


    @Override
    public void onStart() {
        super.onStart();// ATTENTION: This was auto-generated to implement the App Indexing API.
// See https://g.co/AppIndexing/AndroidStudio for more information.
        client2.connect();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.start(client2, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();// ATTENTION: This was auto-generated to implement the App Indexing API.
// See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client2, getIndexApiAction());

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2.disconnect();
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


}
