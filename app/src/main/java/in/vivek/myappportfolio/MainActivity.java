package in.vivek.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button spotifyStreamer, scoresApp, libraryApp, buildItBiggerApp, xyzReaderApp, capstoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(true);

        }
        spotifyStreamer = (Button) findViewById(R.id.spotifyStreamerBtn);
        spotifyStreamer.setOnClickListener(this);
        scoresApp = (Button) findViewById(R.id.scoresAppBtn);
        scoresApp.setOnClickListener(this);
        libraryApp = (Button) findViewById(R.id.libraryAppBtn);
        libraryApp.setOnClickListener(this);
        buildItBiggerApp = (Button) findViewById(R.id.buildItBiggerBtn);
        buildItBiggerApp.setOnClickListener(this);
        xyzReaderApp = (Button) findViewById(R.id.xyzReaderBtn);
        xyzReaderApp.setOnClickListener(this);
        capstoneApp = (Button) findViewById(R.id.capstoneBtn);
        capstoneApp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.spotifyStreamerBtn) {
            Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer App!", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.scoresAppBtn) {
            Toast.makeText(MainActivity.this, "This button will launch my Scores App!", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.libraryAppBtn) {
            Toast.makeText(MainActivity.this, "This button will launch my Library App!", Toast.LENGTH_SHORT).show();

        }
        if (v.getId() == R.id.buildItBiggerBtn) {
            Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger App!", Toast.LENGTH_SHORT).show();

        }
        if (v.getId() == R.id.xyzReaderBtn) {
            Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader App!", Toast.LENGTH_SHORT).show();

        }
        if (v.getId() == R.id.capstoneBtn) {
            Toast.makeText(MainActivity.this, "This button will launch my Capstone App!", Toast.LENGTH_SHORT).show();

        }
    }
}
