package com.hfad.messenger;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class CreateMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Call onSendMessage() when the button is clicked
    public void onSendMessage(View view){

    }
}
