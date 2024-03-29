//package com.ikhiloyaimokhai.expandablerecyclerview.multitypeandcheck;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.ikhiloyaimokhai.expandablerecyclerview.R;
//
//import static com.ikhiloyaimokhai.expandablerecyclerview.factory.GenreDataFactory.makeSingleCheckGenres;
//
///**
// * Created by Ikhiloya Imokhai on 2019-10-31.
// */
//
//public class MultiTypeCheckGenreActivity extends AppCompatActivity {
//
//    private MultiTypeCheckGenreAdapter adapter;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_multi_type_and_check);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setTitle(getClass().getSimpleName());
//
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//
//        adapter = new MultiTypeCheckGenreAdapter(makeSingleCheckGenres());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
//
//        Button clear = (Button) findViewById(R.id.clear_button);
//        clear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                adapter.clearChoices();
//            }
//        });
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        adapter.onSaveInstanceState(outState);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        adapter.onRestoreInstanceState(savedInstanceState);
//    }
//}