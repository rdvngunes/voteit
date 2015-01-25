package com.emar.voteit;


import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class AnaSayfa extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_sayfa_java);
        RelativeLayout genel=(RelativeLayout)findViewById(R.id.rv);

        RelativeLayout rv=new RelativeLayout(this);
        rv.setVisibility(View.VISIBLE);
        Drawable drawable = getResources().getDrawable(R.drawable.isim);
        rv.setBackground(drawable);
        rv.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 120));
        rv.setId(Integer.parseInt("144"));
        genel.addView(rv);


        HorizontalScrollView hz=new HorizontalScrollView(this);
        hz.setVisibility(View.VISIBLE);
        hz.setLayoutParams(new HorizontalScrollView.LayoutParams(HorizontalScrollView.LayoutParams.WRAP_CONTENT, HorizontalScrollView.LayoutParams.WRAP_CONTENT));
        rv.addView(hz);



        RelativeLayout rvhz=new RelativeLayout(this);
        rvhz.setVisibility(View.VISIBLE);
        rvhz.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT ));
        hz.addView(rvhz);

        ImageView imgBir=new ImageView(this);
        imgBir.setVisibility(View.VISIBLE);
        Drawable drawale = getResources().getDrawable(R.drawable.birinci);
        imgBir.setBackground(drawale);
        rvhz.addView(imgBir, 200, 200);

    }

}
