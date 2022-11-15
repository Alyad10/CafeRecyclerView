package com.example.caferecyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String>cafeList = new ArrayList<>();
    private CafeAdapter adapter = new CafeAdapter (cafeList);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);


        loadData();

    }

    private void loadData() {
        cafeList.add("Вкус Востока");
        cafeList.add("Дияр");
        cafeList.add("Жасмин");
        cafeList.add("Арзу");
        cafeList.add("Финик");
        cafeList.add("Ди-2");
        cafeList.add("Инсар");
        cafeList.add("Фаризат");
        cafeList.add("Фаиза");
        cafeList.add("Сара");
        cafeList.add("Нават");
        cafeList.add("Уста");
        cafeList.add("Бухара Ассорти");
        cafeList.add("Версаль");
        cafeList.add("Мубарак");
        cafeList.add("Ихсан");
        cafeList.add("Ожак кебаб");
        cafeList.add("Муслим");
        cafeList.add("Алтын казына");
        cafeList.add("Мустафа");
        cafeList.add("Кекеев");
        cafeList.add("Амина");
        cafeList.add("Караван сарай");

    }

}