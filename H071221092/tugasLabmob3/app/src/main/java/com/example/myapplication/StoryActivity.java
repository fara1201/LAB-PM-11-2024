package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        ImageView ivProfile = findViewById(R.id.iv_profile2);
        TextView tvProfile = findViewById(R.id.tv_profile2);
        ImageView imageStory = findViewById(R.id.imageStory);

        Intent intent = getIntent();

        int fotoProfile = intent.getIntExtra("FOTO PROFILE",0);
        String namaProfile = intent.getStringExtra("NAMA PROFILE");
        int fotoStory = intent.getIntExtra("STORY", 0);

        ivProfile.setImageResource(fotoProfile);
        tvProfile.setText(namaProfile);
        imageStory.setImageResource(fotoStory);

        tvProfile.setOnClickListener(v -> {
            // Check condition based on profile name
            if (namaProfile.equals("aerisbeaute")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.aeris);
                profileIntent.putExtra("NAMA PROFILE", "aerisbeaute");
                profileIntent.putExtra("FOLLOWERS", "156k");
                profileIntent.putExtra("FOLLOWING","4");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postaeris);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("dearmebeauty")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.dearme);
                profileIntent.putExtra("NAMA PROFILE", "dearmebeauty");
                profileIntent.putExtra("FOLLOWERS", "720k");
                profileIntent.putExtra("FOLLOWING","1");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postdearme);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("esqacosmetics")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.esqa);
                profileIntent.putExtra("NAMA PROFILE", "esqacosmetics");
                profileIntent.putExtra("FOLLOWERS", "291k");
                profileIntent.putExtra("FOLLOWING","3");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postesqa);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("holikaholika")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.holika);
                profileIntent.putExtra("NAMA PROFILE", "holikaholika");
                profileIntent.putExtra("FOLLOWERS", "287k");
                profileIntent.putExtra("FOLLOWING","88");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postholika);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("nivea.id")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.nivea);
                profileIntent.putExtra("NAMA PROFILE", "nivea.id");
                profileIntent.putExtra("FOLLOWERS", "291k");
                profileIntent.putExtra("FOLLOWING","3");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postnivea);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("makeover.id")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.makeover);
                profileIntent.putExtra("NAMA PROFILE", "makeover.id");
                profileIntent.putExtra("FOLLOWERS", "1,3 M");
                profileIntent.putExtra("FOLLOWING","174");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postmakeover);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("pinkflash")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.pinkflash);
                profileIntent.putExtra("NAMA PROFILE", "pinkflash");
                profileIntent.putExtra("FOLLOWERS", "263k");
                profileIntent.putExtra("FOLLOWING","8");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postpinkflash);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("rarebeauty")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.rarebeauty);
                profileIntent.putExtra("NAMA PROFILE", "rarebauty");
                profileIntent.putExtra("FOLLOWERS", "7,2 M");
                profileIntent.putExtra("FOLLOWING","353");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postrarebeauty);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("roseallday")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.roseallday);
                profileIntent.putExtra("NAMA PROFILE", "melissa");
                profileIntent.putExtra("FOLLOWERS", "207k");
                profileIntent.putExtra("FOLLOWING","219");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postroseallday);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("thebodyshop")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.tbs);
                profileIntent.putExtra("NAMA PROFILE", "thebodyshop");
                profileIntent.putExtra("FOLLOWERS", "836k");
                profileIntent.putExtra("FOLLOWING","321");
                profileIntent.putExtra("POSTINGAN" , R.drawable.posttbs);
                startActivity(profileIntent);
            }
        });

    }
}