package com.prophessor.filewatcher;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
        ListView snapshotList = (ListView) findViewById(R.id.snapshotList);

        String[] list = new String[100];

        for (int i = 0; i < 100; i++) {
            list[i] = "Item" + i;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        snapshotList.setAdapter(adapter);
    }
}
