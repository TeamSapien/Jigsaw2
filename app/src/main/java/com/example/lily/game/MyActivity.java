package com.example.lily.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;



public class MyActivity extends Activity {
   // RadioGroup radiogroup = (RadioGroup) findViewById(R.id.rGroup);
    RadioButton radioButton;
    public final static String EXTRA_MESSAGE = "com.example.lily.game.MESSAGE";
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void StartPuzzle(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        Intent intent = new Intent(this, PlayPuzzle.class);

        /*int selectedId = radiogroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);
        Toast.makeText(MyActivity.this, radioButton.getText(), Toast.LENGTH_LONG).show();*/
        switch (view.getId()) {
            case R.id.EasyButton:

                if (checked)
                    radioButton = (RadioButton) findViewById(R.id.EasyButton);
                    string = radioButton.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, string);
                    startActivity(intent);

            case R.id.MediumButton:
                if (checked)
                    radioButton = (RadioButton) findViewById(R.id.MediumButton);
                    string = radioButton.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, string);
                    startActivity(intent);

            case R.id.HardButton:
                if (checked)
                    radioButton = (RadioButton) findViewById(R.id.HardButton);
                    string = radioButton.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, string);
                    startActivity(intent);

        }


    }

}
