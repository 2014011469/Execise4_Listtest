package com.example.administrator.listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME ="name";
    private final static String SEX="sex";
    private final static String ID="id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names={"张三","李四","王五","小明"};
        String[] sexs={"男","男","男","男"};
        String[] ids={"001","002","003","004"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<names.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, names[i]);
            item.put(SEX, sexs[i]);
            item.put(ID, ids[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,SEX,ID},new int[]{R.id.txtName,R.id.txtSex,R.id.txtId});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);
    }
}
