package com.example.bookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class all_books extends AppCompatActivity {
    List<Item> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.booksList);
        DataAdapter adapter = new DataAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        items.add(new Item ("Происхождение", "Дэн Браун", "детективы", "1500", R.drawable.braun));
        items.add(new Item ("Убийство в Восточном экспрессе", "Агата Кристи", "детективы", "1700", R.drawable.kristi));
        items.add(new Item ("Мастер и Маргарита", "Михаил Булгаков", "классика", "1000", R.drawable.master_i_margarita));
        items.add(new Item ("Война и мир", "Лев Толстой", "классика", "900", R.drawable.voina_i_mir));
        items.add(new Item ("Кот в сапогах", "Шарль Перро", "сказки", "700", R.drawable.kot_v_sapogah));
        items.add(new Item ("Золотой ключик", "Алексей Толстой", "сказки", "500", R.drawable.zolotoy_kluch));
        items.add(new Item ("И грянул гром", "Рэй Бредбери", "фантастика", "1200", R.drawable.i_grynul_grom));
        items.add(new Item ("Танатонавты", "Бернар Вербер", "фантастика", "1000", R.drawable.tanotonavti));

    }
}
