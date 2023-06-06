package com.example.ponmithranfaq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<faqmodel> faqmodelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleview);

        initData();
        setRecyclerView();

    }

    private void setRecyclerView() {

        faqmodeladapter faqmodeladapter=new faqmodeladapter(faqmodelList);
        recyclerView.setAdapter(faqmodeladapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {

       faqmodelList=new ArrayList<>();

       faqmodelList.add(new faqmodel("What is a feedChart","Answer","The feed chart is all about feeding the cattles"));
       faqmodelList.add(new faqmodel("How to change the language","Answer","In initial find the language button and can be changed using that"));
       faqmodelList.add(new faqmodel("What is the River toll free no","Answer","RIVER: 123456789"));
    }
}