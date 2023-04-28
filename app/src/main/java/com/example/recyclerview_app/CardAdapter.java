package com.example.recyclerview_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private List<CardItem> cardItemList;

    public CardAdapter(List<CardItem> cardItemList) {
        this.cardItemList = cardItemList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        CardItem cardItem = cardItemList.get(position);
        holder.numberTextView.setText(String.valueOf(cardItem.getNumber()));
        holder.titleTextView.setText(cardItem.getTitle());
    }

    @Override
    public int getItemCount() {
        return cardItemList.size();
    }

    public void addCardItem() {
        int position = cardItemList.size();
        CardItem cardItem = new CardItem(position + 1, "Card Title " + (position + 1));
        cardItemList.add(cardItem);
        notifyItemInserted(position);
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView numberTextView, titleTextView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            numberTextView = itemView.findViewById(R.id.numberTextView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
        }
    }
}

