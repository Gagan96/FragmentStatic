package com.iam9091107.escoladeltreball.org.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{


    private EditText editText;
    private Button button;
    private BlankFragment blankFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.etMainActivity);
        button = (Button) findViewById(R.id.btnMainActivity);
        blankFragment = (BlankFragment) getFragmentManager().findFragmentById(R.id.fragment);

        setup();

    }

    private void setup() {

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMsg(editText.getText().toString());
            }
        };
        button.setOnClickListener(listener);

    }

    private void sendMsg(String msg) {
        blankFragment.sendMsg(msg);
    }

    @Override
    public void onFragmentInteraction(String msg) {

        editText.setText(msg);
    }


}
