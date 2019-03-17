package pro.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = findViewById(R.id.button);
        final ImageView ans = findViewById(R.id.image);
        final int Answers[] = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random number = new Random();
                int result  = number.nextInt(5);
                ans.animate().rotationX(360);
                ans.setImageResource(Answers[result]);
            }
        });
    }
}
