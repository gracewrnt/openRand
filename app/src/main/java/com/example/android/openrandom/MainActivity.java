package com.example.android.openrandom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    GifImageView imageView,imageRand;
    Button button1, button2;
    Random r;
    int[] images = {R.drawable.bachor, R.drawable.bucket, R.drawable.burin, R.drawable.chick, R.drawable.eight4, R.drawable.eimaim
            , R.drawable.goin, R.drawable.mahalai, R.drawable.mrgrill, R.drawable.shabu2n, R.drawable.pela
            , R.drawable.steaktechno, R.drawable.thinkmilk, R.drawable.timber};
    int pickedImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (GifImageView) findViewById(R.id.imageRand);
        button1 = (Button) findViewById(R.id.butRand1);
        r = new Random();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickedImage = r.nextInt(images.length);
                imageView.setImageResource(images[pickedImage]);
            }
        });


        imageRand = (GifImageView) findViewById(R.id.imageRand);
        button2 = (Button) findViewById(R.id.butRand2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageRand.setImageResource(R.drawable.rand_img);
            }
        });



    }
}




