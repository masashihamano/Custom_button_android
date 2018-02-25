package misao.edu.custom_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        textView = findViewById( R.id.text_view );
        textView.setText( R.string.custom_button );

        Button customButton = findViewById( R.id.custom_button );

        customButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                String cnt = getString( R.string.tapped )+ " " + String.valueOf( count );
                textView.setText( cnt );
            }
        } );

    }
}
