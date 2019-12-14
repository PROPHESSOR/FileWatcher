package com.prophessor.filewatcher;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView snapshotList = (ListView) findViewById(R.id.snapshotList);

        String[] list = {};

        for (int i = 0; i < 100; i++) {
            list.push("Item" + i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)

        snapshotList.setAdapter(adapter);
    }
}
