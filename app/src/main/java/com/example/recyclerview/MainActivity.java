package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<State> stateList = new ArrayList<>();
        stateList.add(new State("Россия", "Москва", R.drawable.russia_flag));
        stateList.add(new State("США", "Вашингтон", R.drawable.usa_flag));
        stateList.add(new State("Китай", "Пекин", R.drawable.china_flag));

        StateAdapter adapter = new StateAdapter(stateList, this);
        recyclerView.setAdapter(adapter);
    }
}
