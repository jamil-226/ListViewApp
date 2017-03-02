package jameel.com.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.List);
        String[] items = {"Pakistan","United Kingdom","United States","India","Australia","South Africa",
                          "Bangladesh","Canada","Brazil","Paragoye","Afganistan","China","Russia","Japan","Korea"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

    }
}
