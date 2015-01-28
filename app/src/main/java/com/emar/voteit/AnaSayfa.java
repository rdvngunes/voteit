package com.emar.voteit;


import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class AnaSayfa extends Activity {
int message=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_sayfa_java);

        final ScrollView scrollview = ((ScrollView) findViewById(R.id.scrool));





        RelativeLayout genel=(RelativeLayout)findViewById(R.id.rv);
for(int i=1;i<=4;i++) {
    RelativeLayout genel2 = new RelativeLayout(this);
    genel.addView(genel2);
    RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
    genel2.setId(i + 1);
    genel2.setLayoutParams(params2);
    params2.addRule(RelativeLayout.BELOW, genel2.getId() - 1);
    //   stup.setLayoutResource(R.layout.ana_sayfa);
    //  View inflated = stup.inflate();
    // ViewStub stub = (ViewStub) findViewById(R.id.layout_stub);
    // stub.setLayoutResource(R.layout.ana_sayfa);
    // View inflated = stub.inflate();
    // ViewStub stub1 = (ViewStub) findViewById(R.id.layout_stub1);
    // stub1.setLayoutResource(R.layout.deneme);
    //View inflated1 = stub1.inflate();


    RelativeLayout rv = new RelativeLayout(this);
    rv.setVisibility(View.VISIBLE);
    Drawable drawable = getResources().getDrawable(R.drawable.isim);
    rv.setBackground(drawable);
    rv.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 120));
    rv.setId(i+1);
    genel2.addView(rv);


    HorizontalScrollView hz = new HorizontalScrollView(this);
    hz.setVisibility(View.VISIBLE);
    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
    params.addRule(RelativeLayout.BELOW, rv.getId());
    hz.setId(4 * i + 5);
    hz.setLayoutParams(params);
    genel2.addView(hz);


    RelativeLayout rvhz = new RelativeLayout(this);
    rvhz.setVisibility(View.VISIBLE);
    rvhz.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
    hz.addView(rvhz);

    ImageView imgBir = new ImageView(this);
    imgBir.setVisibility(View.VISIBLE);
    Drawable drawable1 = getResources().getDrawable(R.drawable.birinci);
    RelativeLayout.LayoutParams paramsimgBir = new RelativeLayout.LayoutParams( 768, 500);
    imgBir.setLayoutParams(paramsimgBir);
    imgBir.setBackground(drawable1);
    imgBir.setId(4*i+1);
    rvhz.addView(imgBir);



    ImageView imgIki = new ImageView(this);
    imgIki.setVisibility(View.VISIBLE);
    Drawable drawable2 = getResources().getDrawable(R.drawable.ikinci);
    imgIki.setBackground(drawable2);
    rvhz.addView(imgIki);
    imgIki.setId(4*i+2);
    RelativeLayout.LayoutParams paramsimgIki = new RelativeLayout.LayoutParams( 768, 500);
    paramsimgIki.addRule(RelativeLayout.RIGHT_OF, imgBir.getId());
    imgIki.setLayoutParams(paramsimgIki);


    ImageView imgBirVote = new ImageView(this);
    imgBirVote.setVisibility(View.VISIBLE);
    Drawable drawableVote1 = getResources().getDrawable(R.drawable.vote);
    RelativeLayout.LayoutParams paramsimgBirVote = new RelativeLayout.LayoutParams( 768, 100);
    paramsimgBirVote.addRule(RelativeLayout.BELOW, imgBir.getId());
    paramsimgBirVote.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
    paramsimgBirVote.addRule(RelativeLayout.ALIGN_PARENT_START, RelativeLayout.TRUE);
    imgBirVote.setLayoutParams(paramsimgBirVote);
    imgBirVote.setBackground(drawableVote1);
    imgBirVote.setId(4*i+3);
    rvhz.addView(imgBirVote);


    ImageView imgIkiVote = new ImageView(this);
    imgIkiVote.setVisibility(View.VISIBLE);
    Drawable drawableVote2 = getResources().getDrawable(R.drawable.vote);
    RelativeLayout.LayoutParams paramsimgIkiVote = new RelativeLayout.LayoutParams( 768, 100);
    paramsimgIkiVote.addRule(RelativeLayout.RIGHT_OF, imgBirVote.getId());
    imgIkiVote.setLayoutParams(paramsimgIkiVote);
    imgIkiVote.setBackground(drawableVote2);
    paramsimgIkiVote.addRule(RelativeLayout.BELOW, imgBir.getId());
    imgIkiVote.setId(4*i+4);
    rvhz.addView(imgIkiVote);


    TextView txtAciklama =new TextView(this);
    txtAciklama.setText("Sizce Hangisini Profil resmi yapmalıyım, Lütfen beğendiğiniz Fotya oy verin...");
    txtAciklama.setVisibility(View.VISIBLE);
    RelativeLayout.LayoutParams paramsAciklama = new RelativeLayout.LayoutParams( 1536, 100);
    txtAciklama.setLayoutParams(paramsAciklama);
    paramsAciklama.addRule(RelativeLayout.BELOW, hz.getId());
    paramsAciklama.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
    paramsAciklama.addRule(RelativeLayout.ALIGN_PARENT_START, RelativeLayout.TRUE);
    paramsAciklama.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
    genel2.addView(txtAciklama);



}
        TextView txtAciklama2 =new TextView(this);
        txtAciklama2.setText("Sizce Hangisini Profil resmi yapmalıyım, gfdgdfgdfgdfgdfgdfgdfgdfgdfgdfgLütfen beğendiğiniz Fotya oy verin...");
        txtAciklama2.setVisibility(View.VISIBLE);
        RelativeLayout.LayoutParams paramsAciklama2 = new RelativeLayout.LayoutParams( 1536, 100);
        txtAciklama2.setLayoutParams(paramsAciklama2);
        paramsAciklama2.addRule(RelativeLayout.BELOW, genel.getId());
        paramsAciklama2.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        paramsAciklama2.addRule(RelativeLayout.ALIGN_PARENT_START, RelativeLayout.TRUE);
        paramsAciklama2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        genel.addView(txtAciklama2);

   // scrollview.fullScroll(View.FOCUS_DOWN);




}




}
