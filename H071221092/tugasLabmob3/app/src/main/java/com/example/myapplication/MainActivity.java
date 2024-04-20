package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPostingan = findViewById(R.id.rv_post);
        rvPostingan.setHasFixedSize(true); //u atur recycler view spy nda berubah

        PostinganAdapter postinganAdapter = new PostinganAdapter(DataSource.postingans,this); //untuk tampilkan data
        rvPostingan.setAdapter(postinganAdapter);

        RecyclerView rvStory = findViewById(R.id.rv_story);
        rvStory.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(DataSource.stories, this);
        rvStory.setAdapter(storyAdapter);
    }
}