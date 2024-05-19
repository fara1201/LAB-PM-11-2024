package com.example.pertemuan4.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.pertemuan4.R;

public class ProfileFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    } //u ambil layout xml fragment profil supaya jadi tampilan fragmentnya

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView IV_Home = view.findViewById(R.id.IV_Home);
        ImageView IV_Postingan = view.findViewById(R.id.IV_Post);
        ImageView iv_search = view.findViewById(R.id.IV_Search);

        IV_Home.setOnClickListener(v -> {
            HomeFragment homeFragment = new HomeFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, homeFragment)
                    .addToBackStack(null)
                    .commit();
        });

        IV_Postingan.setOnClickListener(v -> {
            PostinganFragment postinganFragment = new PostinganFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, postinganFragment)
                    .addToBackStack(null)
                    .commit();
        });

        iv_search.setOnClickListener(v -> {
            SearchFragment searchFragment = new SearchFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, searchFragment)
                    .addToBackStack(null)
                    .commit();
        });
    }
}