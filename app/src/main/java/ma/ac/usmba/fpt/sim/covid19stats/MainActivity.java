package ma.ac.usmba.fpt.sim.covid19stats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void about(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void advices(View view) {
        Intent intent = new Intent(this, Advices.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

    public void news(View view) {
        Intent intent = new Intent(this, News.class);
        startActivity(intent);
    }
}