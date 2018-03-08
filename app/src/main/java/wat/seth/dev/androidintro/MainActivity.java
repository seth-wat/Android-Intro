package wat.seth.dev.androidintro;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView orangeCircle;
    ImageView blueCircle;
    FrameLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root = findViewById(R.id.root_frame_layout);
        orangeCircle = findViewById(R.id.circle_orange);
        blueCircle = findViewById(R.id.circle_blue);

        orangeCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orangeCircle));
            }
        });

        blueCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.blueCircle));
            }
        });


    }

}
