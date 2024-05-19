package com.example.pertemuan4.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pertemuan4.DataSource;
import com.example.pertemuan4.Instagram;
import com.example.pertemuan4.R;
import com.example.pertemuan4.SearchAdapter;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SearchFragment extends Fragment {

    private ArrayList<Instagram> instagramList;
    private RecyclerView recyclerView;
    private SearchAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        instagramList = new ArrayList<>();

        adapter = new SearchAdapter(instagramList);
        recyclerView.setAdapter(adapter);

        ImageView iv_home = view.findViewById(R.id.IV_Home);
        ImageView iv_profile = view.findViewById(R.id.IV_Profile);
        ImageView iv_posting = view.findViewById(R.id.IV_Post);
        ProgressBar progressBar = view.findViewById(R.id.progressBar);

        androidx.appcompat.widget.SearchView searchView = view.findViewById(R.id.search_view); // u ambil objek SearchView trus disimpan ke searchView

        searchView.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() { //spy ketika kita ketik/hapus nama disearch bs dia tangkap perubahannya trus dijalankan sesuai apa yg dicari
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                progressBar.setVisibility(View.VISIBLE);

                ExecutorService executor = Executors.newSingleThreadExecutor();
                Handler handler = new Handler(Looper.getMainLooper()); //untuk perbarui UInya
                executor.execute(() -> {
                    ArrayList<Instagram> filteredList = new ArrayList<>(); //buat arrayList kosong u simpan hasil filter(serach yg muncul klo ngetik)
                    if (!newText.isEmpty()) {
                        for (Instagram item : DataSource.instagrams) {
                            if (item.getUsername().toLowerCase().contains(newText.toLowerCase()) || //u periksa username Instagram mengandung teks pencarian yang diubah menjadi huruf kecil.
                                    item.getName().toLowerCase().contains(newText.toLowerCase())) {
                                filteredList.add(item); // klo ndd cocok, objek Instagram ditambahkan ke dalam filteredList.
                            }
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.post(() -> {
                        progressBar.setVisibility(View.GONE); //Mengubah visibilitas ProgressBar jadi tidak terlihat (GONE)
                        instagramList.clear();
                        if (!newText.isEmpty()) {
                            instagramList.addAll(filteredList);
                        }
                        adapter.notifyDataSetChanged();
                    });
                });
                return true;
            }
        });

        iv_profile.setOnClickListener(v -> {
            ProfileFragment profileFragment = new ProfileFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction() //proses transaksi u perubahan di fragment
                    .replace(R.id.frame_container, profileFragment) //u tampilkan kembali instace baru dari ProfilFragment
                    .addToBackStack(null) //spy tidak langsung keluar apk (kembali ke slide sebelumnya)
                    .commit(); //u simpanmi transksi yg sdh dibuat dan saat ini dijalankan
        });

        iv_posting.setOnClickListener(v -> {
            PostinganFragment postinganFragment = new PostinganFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, postinganFragment)
                    .addToBackStack(null)
                    .commit();
        });

        iv_home.setOnClickListener(v -> {
            HomeFragment homeFragment = new HomeFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, homeFragment)
                    .addToBackStack(null)
                    .commit();
        });
    }
}