package bh.edu.ahlia.bahrainapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button playb,stopb;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playb = findViewById(R.id.playid);
        stopb = findViewById(R.id.stopid);

        playb.setOnClickListener(this);
        stopb.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.playid:
                if (mediaPlayer == null){
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.banv);
                    mediaPlayer.start();
                }
                break;
            case R.id.stopid:
                if (mediaPlayer != null){
                    mediaPlayer.stop();
                    mediaPlayer = null;
                }
                break;
        }

    }
}
