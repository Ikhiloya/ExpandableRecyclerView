package com.ikhiloyaimokhai.expandablerecyclerview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ikhiloyaimokhai.expandablerecyclerview.R;
import com.ikhiloyaimokhai.expandablerecyclerview.expand.ExpandActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button expand = (Button) findViewById(R.id.expand_button);
        expand.setOnClickListener(navigateTo(ExpandActivity.class));

//        Button multiSelect = (Button) findViewById(R.id.multi_check_button);
//        multiSelect.setOnClickListener(navigateTo(MultiCheckActivity.class));
//
//        Button singleSelect = (Button) findViewById(R.id.single_check_button);
//        singleSelect.setOnClickListener(navigateTo(SingleCheckActivity.class));
//
//        Button mixedSelect = (Button) findViewById(R.id.mixedtype_button);
//        mixedSelect.setOnClickListener(navigateTo(MultiTypeActivity.class));
//
//        Button mixedTypeAndCheck = (Button) findViewById(R.id.mixedtype_check_button);
//        mixedTypeAndCheck.setOnClickListener(navigateTo(MultiTypeCheckGenreActivity.class));
    }

    public View.OnClickListener navigateTo(final Class<?> clazz) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, clazz);
                startActivity(intent);
            }
        };
    }
}

