package org.stealthrobotics.mpossoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.opengl.Visibility;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playIndead(View view)  {
        MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.indead_clip);
        player.start();
    }

    public void playCanyou(View view)    {
        MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.canyou_clip);
        player.start();
    }

    public void playPosBoss(View view)  {
        MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.posboss_clip);
        player.start();
    }

    public void playOklahoma(View view)    {
        MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.oklahoma_clip);
        player.start();
    }

    public void tapTap(View view)   {
        MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.tap_clip);
        player.start();
        ((TableLayout) findViewById(R.id.buttons)).setVisibility(View.GONE);
        ((ImageView) findViewById(R.id.imageView)).setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ((TableLayout) findViewById(R.id.buttons)).setVisibility(View.VISIBLE);
                ((ImageView) findViewById(R.id.imageView)).setVisibility(View.GONE);
            }
        }, 5000);

    }

    public void playHitting(View view)    {
        MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.hitting_clip);
        player.start();
    }

    public void playYouare(View view)    {
        MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.youare_clip);
        player.start();
    }

    public void playQuote(View view)    {
        MediaPlayer player;
        switch((int)(Math.random() * 9))
        {
            case 1:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip1);
                break;
            case 2:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip2);
                break;
            case 3:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip3);
                break;
            case 4:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip4);
                break;
            case 5:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip5);
                break;
            case 6:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip6);
                break;
            case 7:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip7);
                break;
            case 8:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip8);
                break;
            default:
                player = MediaPlayer.create(MainActivity.this, R.raw.quote_clip9);
        }
        player.start();
    }
}
