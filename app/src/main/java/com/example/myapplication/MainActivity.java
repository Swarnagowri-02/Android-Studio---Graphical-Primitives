package com.example.myapplication;

import static android.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        Samplecanvas sc = new Samplecanvas(this);
        setContentView(sc);
    }
    private class Samplecanvas extends View {

        public Samplecanvas(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setColor(Color.TRANSPARENT);
            canvas.drawPaint(paint);
            paint.setColor(Color.YELLOW);
            canvas.drawCircle(800,1300,150,paint);
            paint.setColor(Color.GREEN);
            canvas.drawRect(600,200,300,400,paint);
            paint.setColor(Color.RED);
            canvas.drawOval(200,100,50,500,paint);
            paint.setColor(Color.BLUE);
            canvas.drawRect(50, 850, 350, 1150, paint);


            //.drawOval(500,1000,150,700,paint);
           // canvas.drawRect(550,700,200,400,paint);


        }



    }

}