package com.example.hw3_2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean isApply = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View usualLayout = findViewById(R.id.usualLayout);
        final View engineerLayout = findViewById(R.id.engineerLayout);
        Button switchBtn = findViewById(R.id.switchBtn);

        switchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isApply) {
                    engineerLayout.setVisibility(View.INVISIBLE);
                    usualLayout.setVisibility(View.VISIBLE);
                    isApply = false;
                } else {
                    engineerLayout.setVisibility(View.VISIBLE);
                    usualLayout.setVisibility(View.INVISIBLE);
                    isApply = true;
                }
            }
        });

        init();
        initEngineer();
    }

    private void init () {
        final TextView result = findViewById(R.id.result);
        Button nineBtn = findViewById(R.id.nineBtn);
        Button eightBtn = findViewById(R.id.eightBtn);
        Button sevenBtn = findViewById(R.id.sevenBtn);
        Button sixBtn = findViewById(R.id.sixBtn);
        Button fiveBtn = findViewById(R.id.fiveBtn);
        Button fourBtn = findViewById(R.id.fourBtn);
        Button threeBtn = findViewById(R.id.threeBtn);
        Button twoBtn = findViewById(R.id.twoBtn);
        Button oneBtn = findViewById(R.id.oneBtn);
        Button zeroBtn = findViewById(R.id.zeroBtn);
        Button decimalPointBtn = findViewById(R.id.decimalPointBtn);
        Button clearingBtn = findViewById(R.id.clearingBtn);

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("9");
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("8");
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("7");
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("6");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("5");
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("4");
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("3");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("2");
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("1");
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
            }
        });

        decimalPointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(".");
            }
        });

        clearingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
    }

    private void initEngineer () {
        final TextView resultEng = findViewById(R.id.resultEng);
        Button nineEngBtn = findViewById(R.id.nineEngBtn);
        Button eightEngBtn = findViewById(R.id.eightEngBtn);
        Button sevenEngBtn = findViewById(R.id.sevenEngBtn);
        Button sixEngBtn = findViewById(R.id.sixEngBtn);
        Button fiveEngBtn = findViewById(R.id.fiveEngBtn);
        Button fourEngBtn = findViewById(R.id.fourEngBtn);
        Button threeEngBtn = findViewById(R.id.threeEngBtn);
        Button twoEngBtn = findViewById(R.id.twoEngBtn);
        Button oneEngBtn = findViewById(R.id.oneEngBtn);
        Button zeroEngBtn = findViewById(R.id.zeroEngBtn);
        Button decimalPointEngBtn = findViewById(R.id.decimalPointEngBtn);
        Button clearingEngBtn = findViewById(R.id.clearingEngBtn);

        nineEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("9");
            }
        });

        eightEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("8");
            }
        });

        sevenEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("7");
            }
        });

        sixEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("6");
            }
        });

        fiveEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("5");
            }
        });

        fourEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("4");
            }
        });

        threeEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("3");
            }
        });

        twoEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("2");
            }
        });

        oneEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("1");
            }
        });

        zeroEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("0");
            }
        });

        decimalPointEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText(".");
            }
        });

        clearingEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("");
            }
        });
    }
}