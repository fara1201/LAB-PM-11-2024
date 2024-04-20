package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostinganActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postingan_actvity);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvUsername = findViewById(R.id.tv_user);
        ImageView ivPost = findViewById(R.id.iv_post);
        TextView tvDesc = findViewById(R.id.tv_desc);

        Intent intent = getIntent();

        int fotoProfile = intent.getIntExtra("FOTO PROFILE",0);
        String username = intent.getStringExtra("USERNAME");
        int postingan = intent.getIntExtra("POSTINGAN", 0);
        String desc = intent.getStringExtra("DESKRIPSI");

        ivProfile.setImageResource(fotoProfile);
        tvUsername.setText(username);
        ivPost.setImageResource(postingan);
        tvDesc.setText(desc);

        ivProfile.setOnClickListener(v -> {
            if(fotoProfile == R.drawable.aeris){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.aeris);
                Storyintent.putExtra("NAMA PROFILE", "aerisbeaute");
                Storyintent.putExtra("STORY",R.drawable.aeris);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.dearme){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.dearme);
                Storyintent.putExtra("NAMA PROFILE", "dearmebeauty");
                Storyintent.putExtra("STORY",R.drawable.dearme);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.esqa){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.esqa);
                Storyintent.putExtra("NAMA PROFILE", "esqacosmetics");
                Storyintent.putExtra("STORY",R.drawable.esqa);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.holika){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.postholika);
                Storyintent.putExtra("NAMA PROFILE", "holikaholika");
                Storyintent.putExtra("STORY",R.drawable.holika);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.nivea){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.postnivea);
                Storyintent.putExtra("NAMA PROFILE", "nivea.id");
                Storyintent.putExtra("STORY",R.drawable.nivea);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.makeover){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.makeover);
                Storyintent.putExtra("NAMA PROFILE", "makeover.id");
                Storyintent.putExtra("STORY",R.drawable.makeover);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.pinkflash){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.pinkflash);
                Storyintent.putExtra("NAMA PROFILE", "pinkflash");
                Storyintent.putExtra("STORY",R.drawable.pinkflash);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.rarebeauty){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.rarebeauty);
                Storyintent.putExtra("NAMA PROFILE", "rarebeauty");
                Storyintent.putExtra("STORY",R.drawable.rarebeauty);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.roseallday){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.roseallday);
                Storyintent.putExtra("NAMA PROFILE", "roseallday");
                Storyintent.putExtra("STORY",R.drawable.roseallday);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.tbs){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.tbs);
                Storyintent.putExtra("NAMA PROFILE", "thebodyshop");
                Storyintent.putExtra("STORY",R.drawable.tbs);
                startActivity(Storyintent);
            }
        });

        tvUsername.setOnClickListener(v -> {
            if(username.equals("aerisbeaute")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.aeris);
                profileIntent.putExtra("NAMA PROFILE","aerisbeaute");
                profileIntent.putExtra("FOLLOWERS","156k");
                profileIntent.putExtra("FOLLOWING","4");
                profileIntent.putExtra("POSTINGAN", R.drawable.postaeris);
                startActivity((profileIntent));
            }if(username.equals("dearmebeauty")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.dearme);
                profileIntent.putExtra("NAMA PROFILE","dearmebeauty");
                profileIntent.putExtra("FOLLOWERS","720k");
                profileIntent.putExtra("FOLLOWING","1");
                profileIntent.putExtra("POSTINGAN", R.drawable.postdearme);
                startActivity((profileIntent));
            } if(username.equals("esqacosmetics")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.esqa);
                profileIntent.putExtra("NAMA PROFILE","esqacosmetics");
                profileIntent.putExtra("FOLLOWERS","291k");
                profileIntent.putExtra("FOLLOWING","3");
                profileIntent.putExtra("POSTINGAN", R.drawable.postesqa);
                startActivity((profileIntent));
            } if(username.equals("holikaholika")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.holika);
                profileIntent.putExtra("NAMA PROFILE","holikaholika");
                profileIntent.putExtra("FOLLOWERS","287k");
                profileIntent.putExtra("FOLLOWING","88");
                profileIntent.putExtra("POSTINGAN", R.drawable.postholika);
                startActivity((profileIntent));
            }if(username.equals("nivea.id")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.nivea);
                profileIntent.putExtra("NAMA PROFILE","nivea.id");
                profileIntent.putExtra("FOLLOWERS","291k");
                profileIntent.putExtra("FOLLOWING","3");
                profileIntent.putExtra("POSTINGAN", R.drawable.postnivea);
                startActivity((profileIntent));
            }if(username.equals("makeover.id")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.makeover);
                profileIntent.putExtra("NAMA PROFILE","makeover.id");
                profileIntent.putExtra("FOLLOWERS","1,3 M");
                profileIntent.putExtra("FOLLOWING","174");
                profileIntent.putExtra("POSTINGAN", R.drawable.postmakeover);
                startActivity((profileIntent));
            }if(username.equals("pinkflash")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.pinkflash);
                profileIntent.putExtra("NAMA PROFILE","pinkflash");
                profileIntent.putExtra("FOLLOWERS","8262 k");
                profileIntent.putExtra("FOLLOWING","8");
                profileIntent.putExtra("POSTINGAN", R.drawable.postpinkflash);
                startActivity((profileIntent));
            } if(username.equals("rarebeauty")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.rarebeauty);
                profileIntent.putExtra("NAMA PROFILE","rarebeauty");
                profileIntent.putExtra("FOLLOWERS","7,2 M");
                profileIntent.putExtra("FOLLOWING","353");
                profileIntent.putExtra("POSTINGAN", R.drawable.postrarebeauty);
                startActivity((profileIntent));
            }if(username.equals("roseallday")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.roseallday);
                profileIntent.putExtra("NAMA PROFILE","roseallday");
                profileIntent.putExtra("FOLLOWERS","207k");
                profileIntent.putExtra("FOLLOWING","219");
                profileIntent.putExtra("POSTINGAN", R.drawable.postroseallday);
                startActivity((profileIntent));
            } if(username.equals("thebodyshop")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.tbs);
                profileIntent.putExtra("NAMA PROFILE","thebodyshop");
                profileIntent.putExtra("FOLLOWERS","836k");
                profileIntent.putExtra("FOLLOWING","321");
                profileIntent.putExtra("POSTINGAN", R.drawable.posttbs);
                startActivity((profileIntent));
            }
        });
    }
}
