package com.example.dailyfairy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DaysAdapter extends RecyclerView.Adapter<DaysAdapter.DaysViewHolder> {

    private int daysCount;

    public DaysAdapter(int daysCount) {
        this.daysCount = daysCount;
    }

    @NonNull
    @Override
    public DaysViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.day_list_item;

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, parent, false);

        DaysViewHolder viewHolder = new DaysViewHolder(view);
        
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DaysViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return daysCount;
    }

    class DaysViewHolder extends RecyclerView.ViewHolder {

        TextView listItemDaysView;

        public DaysViewHolder(@NonNull View itemView) {
            super(itemView);

            listItemDaysView = itemView.findViewById(R.id.days_item);
        }

        void bind(int listIndex) {
            listItemDaysView.setText(String.valueOf(listIndex));
        }
    }
}
