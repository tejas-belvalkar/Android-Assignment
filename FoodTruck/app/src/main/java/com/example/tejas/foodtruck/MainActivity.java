
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

=======
        >>>>>>>parent of 4e723d7...Date and TIme

public class MainActivity extends AppCompatActivity {

    public static ArrayList<com.example.tejas.myapplication.Trackable> trackableObj;
    TextView textView;


    MainActivity(){
        trackableObj = new ArrayList<>();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view) {
        textView = findViewById(R.id.textView);
        trackableObj.add(new Trackable(1,"tejas","student","indian","Google.com"));
        trackableObj.add(new Trackable(2,"rishi","student","indian","Google.com"));
        trackableObj.add(new Trackable(3,"babloo","student","indian","Google.com"));
        textView.setText(null);

        for (int i=0;i<trackableObj.size();i++){
            textView.append("\n\n\n\t"+trackableObj.get(i).getName()+"\n\t"+trackableObj.get(i).getType()
                    +"\n\t"+trackableObj.get(i).getCusine()+"\n\t"+trackableObj.get(i).getUrl());
        }

        findViewById(R.id.button).setVisibility(View.INVISIBLE);
        findViewById(R.id.button2).setVisibility(View.VISIBLE);
        findViewById(R.id.button3).setVisibility(View.VISIBLE);
        findViewById(R.id.button4).setVisibility(View.VISIBLE);

        trackableObj.removeAll(trackableObj);


    }

    public void goBack(View view){
        textView.setText(null);
        setContentView(R.layout.activity_main);
    }

    public void onButton2Click(View view){
        setContentView(R.layout.tracking_screen);
        TextView textView = findViewById(R.id.textView2);
        textView.setText("Button 2 clicked");

    }

    public void onButton3Click(View view){
        setContentView(R.layout.tracking_screen);
        TextView textView = findViewById(R.id.textView2);
        textView.setText("Button 3 clicked");
    }

    public void onButton4Click(View view){
        setContentView(R.layout.tracking_screen);
        TextView textView = findViewById(R.id.textView2);
        textView.setText("Button 4 clicked");
    }
}









