package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StateDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_detail);

        // Получаем переданные данные
        String stateName = getIntent().getStringExtra("stateName");
        String stateCapital = getIntent().getStringExtra("stateCapital");
        int flagResource = getIntent().getIntExtra("flagResource", -1); // -1 если флаг не будет найден

        // Ищем View-компоненты для отображения данных
        TextView textViewName = findViewById(R.id.textViewStateName);
        TextView textViewCapital = findViewById(R.id.textViewStateCapital);
        ImageView imageViewFlag = findViewById(R.id.imageViewFlag);

        // Устанавливаем значения в View
        textViewName.setText(stateName);
        textViewCapital.setText(stateCapital);
        if (flagResource != -1) {
            imageViewFlag.setImageResource(flagResource);
        }
    }



}
