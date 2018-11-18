package com.example.android.openrandom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    Random r;
    int[] images = {R.drawable.bachor, R.drawable.bucket, R.drawable.burin, R.drawable.chick, R.drawable.eight4, R.drawable.eimaim
            , R.drawable.goin, R.drawable.mahalai, R.drawable.mrgrill, R.drawable.shabu2n, R.drawable.pela
            , R.drawable.steaktechno, R.drawable.thinkmilk, R.drawable.timber};
    int pickedImage = 0;
    int lastPicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageRand);
        button = (Button) findViewById(R.id.butRand);
        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do{
                    pickedImage = r.nextInt(images.length);
                } while(pickedImage == lastPicked);

                lastPicked = pickedImage;
                imageView.setImageResource(images[pickedImage]);
            }
        });

    }
}




