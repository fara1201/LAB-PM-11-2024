package com.example.tugaslab2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Uri image;
    Button buttonSubmit;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.logoAlbum); //deklarasi value, pemanggilan menggunakan id
        buttonSubmit = findViewById(R.id.Button1);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editText.getText().toString();
                String Username = editText2.getText().toString();

                if (!nama.isEmpty() && !Username.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, com.example.tugaslab2.MainActivity2.class);
                    intent.putExtra("nama", nama); //nama hijau id, atau key, yang putih value yg mau dikirim
                    intent.putExtra("username", Username);

                    if (image !=null){
                        intent.putExtra("image", image.toString());
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Harap masukkan gambar", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Harap isi kedua kolom", Toast.LENGTH_SHORT).show();
                }
            }
        });

        imageView.setOnClickListener(view -> {
            Intent openGallery = new Intent(Intent.ACTION_PICK);
            openGallery.setType("image/*");
            launcherIntentGallery.launch(openGallery);
        });
    }
    ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult( //pemilihan gambar di galeri
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == Activity.RESULT_OK) { //kondisi yang cek ada atau tidak gambar yang dipilih, kalau terpenuhi bakal dieksekusi kode yang didalam if
                    Intent data = result.getData();
                    image = data.getData();
                    imageView.setImageURI(image);
                }
            }
    );
}