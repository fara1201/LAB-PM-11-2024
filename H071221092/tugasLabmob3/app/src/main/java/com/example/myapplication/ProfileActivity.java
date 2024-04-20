package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvProfile = findViewById(R.id.Tv_profile);
        TextView tvAngkaFollowers = findViewById(R.id.Tv_followers);
        TextView tvAngkaFollowing = findViewById(R.id.Tv_following);
        ImageView ivPost = findViewById(R.id.iv_post);

        Intent intent = getIntent();

        int fotoProfile = intent.getIntExtra("FOTO PROFILE", 0);
        String namaProfile = intent.getStringExtra("NAMA PROFILE");
        String angkaFollowers = intent.getStringExtra("FOLLOWERS");
        String angkaFollowing = intent.getStringExtra("FOLLOWING");
        int postingan = intent.getIntExtra("POSTINGAN", 0);

        ivProfile.setImageResource(fotoProfile);
        tvProfile.setText(namaProfile);
        tvAngkaFollowers.setText(angkaFollowers);
        tvAngkaFollowing.setText(angkaFollowing);
        ivPost.setImageResource(postingan);

        ivProfile.setOnClickListener(v -> {
            if (fotoProfile == R.drawable.aeris) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.aeris);
                storyIntent.putExtra("NAMA PROFILE", "aerisbeaute");
                storyIntent.putExtra("STORY", R.drawable.aeris);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.tbs) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.tbs);
                storyIntent.putExtra("NAMA PROFILE", "thebodyshop");
                storyIntent.putExtra("STORY", R.drawable.tbs);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.roseallday) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.roseallday);
                storyIntent.putExtra("NAMA PROFILE", "roseallday");
                storyIntent.putExtra("STORY", R.drawable.roseallday);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.rarebeauty) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.rarebeauty);
                storyIntent.putExtra("NAMA PROFILE", "rarebeauty");
                storyIntent.putExtra("STORY", R.drawable.rarebeauty);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.pinkflash) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.pinkflash);
                storyIntent.putExtra("NAMA PROFILE", "pinkflash");
                storyIntent.putExtra("STORY", R.drawable.pinkflash);
                startActivity(storyIntent);
            }  if (fotoProfile == R.drawable.nivea) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.nivea);
                storyIntent.putExtra("NAMA PROFILE", "nivea.id");
                storyIntent.putExtra("STORY", R.drawable.nivea);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.esqa) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.esqa);
                storyIntent.putExtra("NAMA PROFILE", "esqacosmetics");
                storyIntent.putExtra("STORY", R.drawable.esqa);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.dearme) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.dearme);
                storyIntent.putExtra("NAMA PROFILE", "dearmebeauty");
                storyIntent.putExtra("STORY", R.drawable.dearme);
                startActivity(storyIntent);
            } else if (fotoProfile == R.drawable.holika) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.holika);
                storyIntent.putExtra("NAMA PROFILE", "holikaholika");
                storyIntent.putExtra("STORY", R.drawable.holika);
                startActivity(storyIntent);
            } else if (fotoProfile == R.drawable.makeover) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.makeover);
                storyIntent.putExtra("NAMA PROFILE", "makeover.id");
                storyIntent.putExtra("STORY", R.drawable.makeover);
                startActivity(storyIntent);
            }
        });

        ivPost.setOnClickListener(v -> {
            if (postingan == R.drawable.postaeris) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.aeris);
                storyIntent.putExtra("USERNAME", "aerisbeaute");
                storyIntent.putExtra("POSTINGAN", R.drawable.postaeris);
                storyIntent.putExtra("DESKRIPSI", "4.4 FLASH SALE");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postdearme) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.dearme);
                storyIntent.putExtra("USERNAME", "dearmebeauty");
                storyIntent.putExtra("POSTINGAN", R.drawable.postdearme);
                storyIntent.putExtra("DESKRIPSI", "Hypergloss Lip Balm DEAR RACHEL");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postesqa) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.esqa);
                storyIntent.putExtra("USERNAME", "esqacosmetics");
                storyIntent.putExtra("POSTINGAN", R.drawable.postesqa);
                storyIntent.putExtra("DESKRIPSI", "Sunset Stunner from Esqa");
                startActivity(storyIntent);
            }if (postingan == R.drawable.postholika) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.holika);
                storyIntent.putExtra("USERNAME", "holikaholika");
                storyIntent.putExtra("POSTINGAN", R.drawable.postholika);
                storyIntent.putExtra("DESKRIPSI", "Set MakeUp Holika");
                startActivity(storyIntent);
            }if (postingan == R.drawable.postnivea) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.nivea);
                storyIntent.putExtra("USERNAME", "nivea.id");
                storyIntent.putExtra("POSTINGAN", R.drawable.postnivea);
                storyIntent.putExtra("DESKRIPSI", "Pilih MicellAIR yang tepat untuk kulitmu");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postmakeover) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.makeover);
                storyIntent.putExtra("USERNAME", "makeover.id");
                storyIntent.putExtra("POSTINGAN", R.drawable.postmakeover);
                storyIntent.putExtra("DESKRIPSI", "Coming Soon");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postpinkflash) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.pinkflash);
                storyIntent.putExtra("USERNAME", "pinkflash");
                storyIntent.putExtra("POSTINGAN", R.drawable.postpinkflash);
                storyIntent.putExtra("DESKRIPSI", "Lip product");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postrarebeauty) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.rarebeauty);
                storyIntent.putExtra("USERNAME", "rarebeauty");
                storyIntent.putExtra("POSTINGAN", R.drawable.postrarebeauty);
                storyIntent.putExtra("DESKRIPSI", "easy To Blend");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postroseallday) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.roseallday);
                storyIntent.putExtra("USERNAME", "roseallday");
                storyIntent.putExtra("POSTINGAN", R.drawable.postroseallday);
                storyIntent.putExtra("DESKRIPSI", "Available in 10 SHADES");
                startActivity(storyIntent);
            } if (postingan == R.drawable.posttbs) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.tbs);
                storyIntent.putExtra("USERNAME", "thebodyshop");
                storyIntent.putExtra("POSTINGAN", R.drawable.posttbs);
                storyIntent.putExtra("DESKRIPSI", "Body Butter Vegan");
                startActivity(storyIntent);
            }
        });
    }
}
