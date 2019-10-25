package com.example.infshw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Button cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        MenuAdapter menuAdapter = new MenuAdapter();

        menuAdapter.setData(MenuDatabase.getAllMenu());
        recyclerView.setAdapter(menuAdapter);


        RelativeLayout constraintLayout = findViewById(R.id.constraintLayout);
        Button cart = constraintLayout.findViewById(R.id.cartButton);
        cart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openCartActivity();
            }
        });
    }

        public void openCartActivity(){
            Intent intent = new Intent(this, CartActivity.class);
                    startActivity(intent);
        }

    }

