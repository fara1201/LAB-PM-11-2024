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

public class PostinganAdapter extends RecyclerView.Adapter<PostinganAdapter.ViewHolder> {

    private final ArrayList<Postingan> postingans;

    private Context context;

    public PostinganAdapter(ArrayList<Postingan> postingans, Context context) {
        this.context =context;
        this.postingans = postingans;
    }

    @NonNull
    @Override
    public PostinganAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostinganAdapter.ViewHolder holder, int position) {
        Postingan postingan = postingans.get(position);
        holder.setData(postingan);

        holder.tvUser.setOnClickListener(v -> {
            if(postingans.get(position).getUsername().equals("aerisbeaute")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.aeris);
                intent.putExtra("NAMA PROFILE","aerisbeaute");
                intent.putExtra("FOLLOWERS","156k");
                intent.putExtra("FOLLOWING","4");
                intent.putExtra("POSTINGAN", R.drawable.postaeris);
                context.startActivity(intent);
            }  if(postingans.get(position).getUsername().equals("pinkflash")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.pinkflash);
                intent.putExtra("NAMA PROFILE","pinkflash");
                intent.putExtra("FOLLOWERS","262k");
                intent.putExtra("FOLLOWING","8");
                intent.putExtra("POSTINGAN", R.drawable.postpinkflash);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("dearmebeauty")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.dearme);
                intent.putExtra("NAMA PROFILE","dearmebeauty");
                intent.putExtra("FOLLOWERS","720k");
                intent.putExtra("FOLLOWING","1");
                intent.putExtra("POSTINGAN", R.drawable.postdearme);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("esqacosmetics")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.esqa);
                intent.putExtra("NAMA PROFILE","esqacosmetics");
                intent.putExtra("FOLLOWERS","295k");
                intent.putExtra("FOLLOWING","14");
                intent.putExtra("POSTINGAN", R.drawable.postesqa);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("holikaholika")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.holika);
                intent.putExtra("NAMA PROFILE","holikaholika");
                intent.putExtra("FOLLOWERS","287k");
                intent.putExtra("FOLLOWING","88");
                intent.putExtra("POSTINGAN", R.drawable.postholika);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("nivea.id")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.nivea);
                intent.putExtra("NAMA PROFILE","nivea.id");
                intent.putExtra("FOLLOWERS","291k");
                intent.putExtra("FOLLOWING","3");
                intent.putExtra("POSTINGAN", R.drawable.postnivea);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("makeover.id")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.makeover);
                intent.putExtra("NAMA PROFILE","makeover.id");
                intent.putExtra("FOLLOWERS","1,3 M");
                intent.putExtra("FOLLOWING","174");
                intent.putExtra("POSTINGAN", R.drawable.postmakeover);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("rarebeauty")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.rarebeauty);
                intent.putExtra("NAMA PROFILE","rarebeauty");
                intent.putExtra("FOLLOWERS","7,2 M");
                intent.putExtra("FOLLOWING","353");
                intent.putExtra("POSTINGAN", R.drawable.postrarebeauty);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("roseallday")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.roseallday);
                intent.putExtra("NAMA PROFILE","roseallday");
                intent.putExtra("FOLLOWERS","207k");
                intent.putExtra("FOLLOWING","219");
                intent.putExtra("POSTINGAN", R.drawable.postroseallday);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("thebodyshop")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.tbs);
                intent.putExtra("NAMA PROFILE","thebodyshop");
                intent.putExtra("FOLLOWERS","836k");
                intent.putExtra("FOLLOWING","321");
                intent.putExtra("POSTINGAN", R.drawable.posttbs);
                context.startActivity(intent);
            }
        });
        holder.imageView2.setOnClickListener(v -> {
            if(postingans.get(position).getImage().equals(R.drawable.postaeris)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.aeris);
                intent.putExtra("NAMA PROFILE", "aerisbeauty");
                intent.putExtra("STORY",R.drawable.aeris);
                context.startActivity(intent);
            } if(postingans.get(position).getImage().equals(R.drawable.posttbs)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.tbs);
                intent.putExtra("NAMA PROFILE", "thebodyshop");
                intent.putExtra("STORY",R.drawable.tbs);
                context.startActivity(intent);
            } if(postingans.get(position).getImage().equals(R.drawable.postroseallday)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.roseallday);
                intent.putExtra("NAMA PROFILE", "roseallday");
                intent.putExtra("STORY",R.drawable.roseallday);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.postrarebeauty)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.rarebeauty);
                intent.putExtra("NAMA PROFILE", "rarebeauty");
                intent.putExtra("STORY",R.drawable.rarebeauty);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.postpinkflash)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.pinkflash);
                intent.putExtra("NAMA PROFILE", "pinkflash");
                intent.putExtra("STORY",R.drawable.pinkflash);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.postnivea)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.nivea);
                intent.putExtra("NAMA PROFILE", "nivea.id");
                intent.putExtra("STORY",R.drawable.nivea);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.postesqa)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.esqa);
                intent.putExtra("NAMA PROFILE", "esqacosmetics");
                intent.putExtra("STORY",R.drawable.esqa);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.postdearme)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.dearme);
                intent.putExtra("NAMA PROFILE", "dearmebeauty");
                intent.putExtra("STORY",R.drawable.dearme);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.postholika)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.holika);
                intent.putExtra("NAMA PROFILE", "holikaholika");
                intent.putExtra("STORY",R.drawable.holika);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.postmakeover)){
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
        return postingans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView, imageView2;

        private final TextView tvUser, tvDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.iv_profile);
            imageView = itemView.findViewById(R.id.iv_post);
            tvUser = itemView.findViewById(R.id.tv_user);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }

        public void setData(Postingan postingan) {
            imageView2.setImageResource(postingan.getImage2());
            imageView.setImageResource(postingan.getImage());
            tvUser.setText(postingan.getUsername());
            tvDesc.setText(postingan.getDesc());
        }
    }
}
