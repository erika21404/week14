package eisc.tku.week14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RatingBar rat;
    private SeekBar seek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    rat=findViewById(R.id.ratingBar);
    rat.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
        @Override
        public void onRatingChanged(RatingBar rat,float rating,boolean fromUser){
            String text=rating+"Star(s)";
            Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
        }
    });

    seek=findViewById(R.id.seekBar);
    seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            TextView text=(TextView)findViewById(R.id.textView);
            text.setTextSize(progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            Toast.makeText(MainActivity.this,"start size="+seekBar.getProgress(),Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            Toast.makeText(MainActivity.this,"stop size="+seekBar.getProgress(),Toast.LENGTH_SHORT).show();
        }
    });


    }
}
