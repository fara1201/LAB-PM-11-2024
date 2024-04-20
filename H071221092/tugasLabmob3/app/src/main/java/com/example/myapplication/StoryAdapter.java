package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>{

    private final ArrayList<Story> stories;

    private Context context;

    public StoryAdapter(ArrayList<Story> stories, Context context) {
        this.context = context;
        this.stories = stories;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_story,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.setData(story);

        holder.imageView.setOnClickListener(v -> {
            if(stories.get(position).getImage().equals(R.drawable.aeris)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.aeris);
                intent.putExtra("NAMA PROFILE", "aerisbeaute");
                intent.putExtra("STORY",R.drawable.aeris);
                context.startActivity(intent);
            } if(stories.get(position).getImage().equals(R.drawable.tbs)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.tbs);
                intent.putExtra("NAMA PROFILE", "thebodyshop");
                intent.putExtra("STORY",R.drawable.tbs);
                context.startActivity(intent);
            } if(stories.get(position).getImage().equals(R.drawable.roseallday)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.roseallday);
                intent.putExtra("NAMA PROFILE", "roseallday");
                intent.putExtra("STORY",R.drawable.roseallday);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.rarebeauty)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.rarebeauty);
                intent.putExtra("NAMA PROFILE", "rarebeauty");
                intent.putExtra("STORY",R.drawable.rarebeauty);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.pinkflash)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.pinkflash);
                intent.putExtra("NAMA PROFILE", "pinkflash");
                intent.putExtra("STORY",R.drawable.pinkflash);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.nivea)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.nivea);
                intent.putExtra("NAMA PROFILE", "nivea.id");
                intent.putExtra("STORY",R.drawable.nivea);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.esqa)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.esqa);
                intent.putExtra("NAMA PROFILE", "esqacosmetics");
                intent.putExtra("STORY",R.drawable.esqa);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.dearme)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.dearme);
                intent.putExtra("NAMA PROFILE", "dearmebeauty");
                intent.putExtra("STORY",R.drawable.dearme);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.holika)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.holika);
                intent.putExtra("NAMA PROFILE", "holikaholika");
                intent.putExtra("STORY",R.drawable.holika);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.makeover)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.makeover);
                intent.putExtra("NAMA PROFILE", "makeover.id");
                intent.putExtra("STORY",R.drawable.makeover);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_nama);
            imageView = itemView.findViewById(R.id.iv_story);
        }

        public void setData(Story story) {
            textView.setText(story.getNama());
            imageView.setImageResource(story.getImage());
        };

    }
}
