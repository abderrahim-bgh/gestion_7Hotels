package com.example.gestion_hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class cat_chambre extends AppCompatActivity {
      TextView name_h;
      Intent intent;
      AppCompatButton b1;
    AppCompatButton b2;
    AppCompatButton b3;
    AppCompatButton b4;
    AppCompatButton b5,rsrv;
    AppCompatButton b6,b8,b9;
    AppCompatButton b7;
    TextView name_ch;
    ImageView imageView1,img2;
    TextView t1,t2,t3,t4,t5,t6;
    ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_chambre);
        name_h= findViewById(R.id.hotn);
       intent= getIntent();
        b1 = findViewById(R.id.type1);
        b2 = findViewById(R.id.type2);
        b3 = findViewById(R.id.type3);
        b4 = findViewById(R.id.type4);
        b5 = findViewById(R.id.type5);
        b6 = findViewById(R.id.type6);
        b7 = findViewById(R.id.type7);
        b8 = findViewById(R.id.typ8);
        b9 = findViewById(R.id.typ9);
        rsrv=findViewById(R.id.rsrv);
        rsrv.setVisibility(View.GONE);

        t1=findViewById(R.id.pre2);
        t2=findViewById(R.id.lie2);
        t3=findViewById(R.id.wifi2);
        t4=findViewById(R.id.paye2);
        t5=findViewById(R.id.aute);
        t6=findViewById(R.id.autre2);

        i1=findViewById(R.id.pre);
        i2=findViewById(R.id.lie);
        i3=findViewById(R.id.wifi);
        i4=findViewById(R.id.paye);
              t1.setVisibility(View.GONE);
        i4.setVisibility(View.GONE);
        t2.setVisibility(View.GONE);
        t3.setVisibility(View.GONE);
        t4.setVisibility(View.GONE);
        t5.setVisibility(View.GONE);
        t6.setVisibility(View.GONE);
        i1.setVisibility(View.GONE);
        i2.setVisibility(View.GONE);
        i3.setVisibility(View.GONE);
        imageView1 = findViewById(R.id.image_cat);
        name_ch=findViewById(R.id.name_cat);
        img2=findViewById(R.id.image_cat2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.ch01);
                img2.setImageResource(R.drawable.c011);
                name_ch.setText("Chambre Classique");
                t1.setText("  2 personnes");
                t2.setText("  2 lit");
                t1.setVisibility(View.VISIBLE);
                rsrv.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.c3p);
                img2.setImageResource(R.drawable.c011);
                name_ch.setText("Chambre Classique");
                  t1.setText("  3 personnes");
                  t2.setText("  3 lit");
                rsrv.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.ch7);
                img2.setImageResource(R.drawable.ch50);
                name_ch.setText("Chambre Supérieure");
                rsrv.setVisibility(View.VISIBLE);
                t2.setText("  1 très grand lit");
                t1.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.ch7);
                img2.setImageResource(R.drawable.ch70);
                name_ch.setText("Grande Room");
                t2.setText("  1 très grand lit");
                t1.setVisibility(View.VISIBLE);
                rsrv.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.ch01);
                img2.setImageResource(R.drawable.ch70);
                name_ch.setText("Chambre Majestueuse, accessible aux personnes à mobilité réduite");
                t2.setText("  2 lit");
                t1.setVisibility(View.VISIBLE);
                rsrv.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.ch5);
                img2.setImageResource(R.drawable.c011);
                name_ch.setText("Grand chambre ");
                rsrv.setVisibility(View.VISIBLE);
                t2.setText("  1 très grand lit");
                t1.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.ch7);
                img2.setImageResource(R.drawable.ch700);
                name_ch.setText("Suite");
                t2.setText("  1 très grand lit + 1 lie");
                t1.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                rsrv.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.ch5);
                img2.setImageResource(R.drawable.ch700);
                name_ch.setText("Suite");
                rsrv.setVisibility(View.VISIBLE);
                t2.setText("  1 très grand lit + 1 lie");
                t1.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.chsup);
                img2.setImageResource(R.drawable.ch700);
                name_ch.setText("Suite Royale");
                rsrv.setVisibility(View.VISIBLE);
                t2.setText("  1 très grand lit + 2 lits");
                t1.setVisibility(View.VISIBLE);
                i4.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
            }
        });

        String k =intent.getStringExtra("keyy");
        name_h.setText(k);


        rsrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cat_chambre.this,reservation.class);
                i.putExtra("cat",name_ch.getText().toString());
                startActivity(i);
            }
        });




    }
}