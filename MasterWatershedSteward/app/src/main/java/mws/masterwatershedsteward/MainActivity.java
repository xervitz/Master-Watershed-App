package mws.masterwatershedsteward;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buttTest = (Button) findViewById(R.id.buttTest);
        buttTest.setOnClickListener(
                System.out.println("Tits");
        );
        setContentView(R.layout.activity_main);
    }
}
