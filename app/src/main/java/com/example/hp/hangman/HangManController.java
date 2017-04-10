package com.example.hp.hangman;

/**
 * Created by HP on 10.04.2017.
 */

class HangManController {

    private HangManModel model;

    public HangManController(HangManModel hangManModel) {
        model = hangManModel;
    }

    public void setWord(String word) {
        model.setWord(word);
    }

    public void acceptGuess(String letter) {
        if (model.getWord().contains(letter)){
            showLetter(letter);

        } else model.setfGallowPart(model.getGallowPart() + 1);

    }

    private void showLetter(String letter) {

    }
}
