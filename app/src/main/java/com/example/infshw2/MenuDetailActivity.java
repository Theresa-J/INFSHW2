package com.example.infshw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MenuDetailActivity extends AppCompatActivity {
    public TextView nameTextView;
    public TextView descripTextView;
    public ImageView foodImageView;
    public TextView priceTextView;
    private int addMinus = 0;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);

        Intent intent = getIntent();

        int itemId = intent.getIntExtra("ItemId",0);

        Menu menu = MenuDatabase.getMenuById(itemId);

        nameTextView = findViewById(R.id.detailName);
        priceTextView = findViewById(R.id.detailPrice);
        descripTextView = findViewById(R.id.detailDescrip);
        foodImageView = findViewById(R.id.detailFood);

        nameTextView.setText(menu.getName());
        priceTextView.setText(Double.toString(menu.getCost()));
        descripTextView.setText(menu.getDescrip());

        foodImageView.setImageResource(menu.getImageDrawableId());

        ConstraintLayout details =findViewById(R.id.constraintLayoutDetail);
        ImageButton add = details.findViewById(R.id.add);
        final TextView editText = details.findViewById(R.id.editText);
        ImageButton minus = details.findViewById(R.id.minus);


        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                addMinus = addMinus +1;
                editText.setText(Integer.toString(addMinus));
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if(addMinus>0){addMinus = addMinus -1;
                editText.setText(Integer.toString(addMinus));}
            }
        });

    }
}
