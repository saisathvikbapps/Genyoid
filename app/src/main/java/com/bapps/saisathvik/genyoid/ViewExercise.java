package com.bapps.saisathvik.genyoid;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewExercise extends AppCompatActivity {

    int image_id;
    String name;

     TextView timer,title;
     ImageView detail_image;
    Button btnStart;
    boolean isRunning = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_exercise);

        timer = (TextView) findViewById(R.id.timer);
        title = (TextView) findViewById(R.id.title);
        detail_image = (ImageView) findViewById(R.id.detail_image);


        btnStart = (Button) findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!isRunning){

                    btnStart.setText("DONE");
                    new CountDownTimer(10000, 1000) {
                        @Override
                        public void onTick(long l) {

                            timer.setText(""+l/1000);
                        }

                        @Override
                        public void onFinish() {
                            //We can add ADSENSE here
                            Toast.makeText(ViewExercise.this,"Finish!!!",Toast.LENGTH_SHORT).show();
                            finish();

                        }
                    }.start();
                }
                else{

                    //We can add ADSENSE here
                    Toast.makeText(ViewExercise.this,"Finish!!!",Toast.LENGTH_SHORT).show();
                    finish();
                }

                isRunning = !isRunning;
            }
        });

        if(getIntent() != null){

            image_id = getIntent().getIntExtra("image_id",-1);
            name = getIntent().getStringExtra("name");

            detail_image.setImageResource(image_id);
            title.setText(name);


        }
    }
}
