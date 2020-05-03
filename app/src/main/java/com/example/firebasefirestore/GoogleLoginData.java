package com.example.firebasefirestore;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class GoogleLoginData extends AppCompatActivity {

    ImageView iv;
    TextView name, email, id;
    //Some Random Data HasBeen Changed
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_login_data);

        iv = findViewById(R.id.imageView);
        name = findViewById(R.id.Name);
        email = findViewById(R.id.Email);
        id = findViewById(R.id.Id);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personGivenName = acct.getGivenName();
            String personFamilyName = acct.getFamilyName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();
            System.out.println(personPhoto.toString());
           /* Glide
                    .with(this)
                    .load(String.valueOf(personPhoto))
                    .apply(new RequestOptions().override(600, 200))
                    .into(iv);*/

            name.setText(personName);
            email.setText(personEmail);
            id.setText(personId);

        }


    }
}
