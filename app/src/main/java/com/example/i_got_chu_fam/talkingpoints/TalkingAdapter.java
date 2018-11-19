package com.example.i_got_chu_fam.talkingpoints;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TalkingAdapter extends RecyclerView.Adapter<TalkingAdapter.myViewHolder> {
    private List<TalkingPoints> talkingPointData;

    public static class myViewHolder extends RecyclerView.ViewHolder{
        public TextView title, date;

        public myViewHolder(TextView v) {
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            date = (TextView) v.findViewById(R.id.date);
        }
    }

    public TalkingAdapter(List<TalkingPoints> mDataset){
        talkingPointData = mDataset;
    }

    @Override
    public TalkingAdapter.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.talking_points_list, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position){

    }
    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return talkingPointData.size();
    }

}
