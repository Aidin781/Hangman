package com.example.hp.hangman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView gallowsView;
    private TextView wordView;
    private TextView lettersView;
    private EditText guessView;
    private Button submitButton;
    private hangManController hangManController;
    private hangManView hangManView;
    private hangManModel hangManModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update();
            }
        });

        hangManController.setWord("zagaka");

    }

    private void update() {
        hangManController.acceptGuess(guessView.getText().toString());
        hangManView.update(hangManModel);
        gallowsView.setText(hangManView.getGallow());
        wordView.setText(hangManView.getWord());
        lettersView.setText(hangManView.getLetters());

    }

    private void init() {
        gallowsView = (TextView)findViewById(R.id.textViewGallows);
        wordView = (TextView)findViewById(R.id.textViewWords);
        lettersView = (TextView)findViewById(R.id.textViewLetters);
        guessView = (EditText)findViewById(R.id.editTextGuess);
        submitButton = (Button)findViewById(R.id.button);

        hangManModel = new HangManModel();
        hangMandController = new HangManController(hangManModel);
        hangManView = new HangManView;

    }
}
