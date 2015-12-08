package com.example.gode_user01.buttonsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.imageTextButton1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "MUNI-MUNI!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2 = (Button) findViewById(R.id.imageTextButton2);
        btn2.setOnClickListener(btnListener);

        Button btn3 = (Button) findViewById(R.id.imageTextButton3);
        btn3.setOnClickListener(btnListener);

        Button btn4 = (Button) findViewById(R.id.imageTextButton4);
        btn4.setOnClickListener(btnListener);
    }

    private View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View view)
        {
            Toast.makeText(getBaseContext(),
                    ((Button) view).getText() + " !",
                    Toast.LENGTH_LONG).show();
        }
    };

    public void onClickImageButton(View view){
        Toast.makeText(getBaseContext(), "MUNI-MUNI!",
                Toast.LENGTH_SHORT).show();
    }

    public void onToggle(View view) {
        ToggleButton btn = (ToggleButton) view;
        Toast.makeText(this, "Toggle mode: " + btn.isChecked(),
                Toast.LENGTH_SHORT).show();
    }



}