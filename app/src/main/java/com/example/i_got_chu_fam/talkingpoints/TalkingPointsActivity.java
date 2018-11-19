package com.example.i_got_chu_fam.talkingpoints;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class TalkingPointsActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<TalkingPoints> talkingPointsList= new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talking_points);
        Button nb = (Button) findViewById(R.id.entry_1);
        nb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), NewJobActivity.class);
                startActivity(i);
            }
        });
      /*  mRecyclerView = (RecyclerView) findViewById(R.id.talking_points_recycler_view);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // specify an adapter (see also next example)
        mAdapter = new TalkingAdapter(talkingPointsList);
        mRecyclerView.setAdapter(mAdapter);
        prepareTalkingPointsDate();*/
    }

  /*  private void prepareTalkingPointsDate(){
        TalkingPoints talking_point = new TalkingPoints("Fell back again", "10/20/2018");
        talkingPointsList.add(talking_point);
    } */
}
