package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.StateViewHolder> {
    private List<State> stateList;
    private Context context;

    public StateAdapter(List<State> stateList, Context context) {
        this.stateList = stateList;
        this.context = context;
    }

    @NonNull
    @Override
    public StateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new StateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateViewHolder holder, int position) {
        State state = stateList.get(position);
        holder.textViewName.setText(state.getName());
        holder.textViewCapital.setText(state.getCapital());
        holder.imageViewFlag.setImageResource(state.getFlagResource());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, StateDetailActivity.class);
            intent.putExtra("stateName", state.getName());
            intent.putExtra("stateCapital", state.getCapital());
            intent.putExtra("flagResource", state.getFlagResource());
            context.startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return stateList.size();
    }

    static class StateViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewCapital;
        ImageView imageViewFlag;

        StateViewHolder(View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewCapital = itemView.findViewById(R.id.textViewCapital);
            imageViewFlag = itemView.findViewById(R.id.imageViewFlag);
        }
    }
}
