package com.example.charityfinder;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import io.realm.Realm;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;
import io.realm.mongodb.Credentials;
import io.realm.mongodb.User;
import io.realm.mongodb.sync.SyncConfiguration;




public class MainActivity extends AppCompatActivity {

    //references to buttons and other controls

    Button submitbtn;
    RadioButton medicalRadio, envirRadio, hserviceRadio, educationRadio, publicaRadio,
    cultureRadio, domesticvRadio, hrightsRadio, homelessRadio, religionRadio, youthRadio;
    final String appID = "charityfinder-zmuxz";
    Realm uiThreadRealm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Realm.init(this);
        App app = new App(new AppConfiguration.Builder(appID).build());

        Credentials credentials = Credentials.anonymous();
        app.loginAsync(credentials, result -> {
            if (result.isSuccess()) {
                Log.v("QUICKSTART", "Successfully authenticated anonymously.");
                User user = app.currentUser();
                String partitionValue = "Category";
                SyncConfiguration config = new SyncConfiguration.Builder(user, partitionValue)
                        .allowQueriesOnUiThread(true)
                        .allowWritesOnUiThread(true)
                        .build();
                uiThreadRealm = Realm.getInstance(config);


            } else {
                Log.e("QUICKSTART", "Failed to log in. Error: " + result.getError());
            }
        });



        medicalRadio = findViewById(R.id.medicalRadio);
        envirRadio = findViewById(R.id.envirRadio);
        hserviceRadio = findViewById(R.id.hserviceRadio);
        educationRadio = findViewById(R.id.educationRadio);
        publicaRadio = findViewById(R.id.publicaRadio);
        cultureRadio = findViewById(R.id.cultureRadio);
        domesticvRadio = findViewById(R.id.domesticvRadio);
        hrightsRadio = findViewById(R.id.hrightsRadio);
        homelessRadio = findViewById(R.id.homelessRadio);
        religionRadio = findViewById(R.id.religionRadio);
        youthRadio = findViewById(R.id.youthRadio);
        submitbtn = findViewById(R.id.submitbtn);




    }
    String category;


    public void onRadioButtonClicked(View view) {

        if (medicalRadio.isChecked()) { category = "Medical"; }
        else if (envirRadio.isChecked()) { category = "Environmental_Animal";}
        else if (hserviceRadio.isChecked()) { category = "Human_Services";}
        else if (educationRadio.isChecked()) { category = "Education"; }
        else if (publicaRadio.isChecked()) { category = "Public_Affairs";}
        else if (cultureRadio.isChecked()) { category = "Culture_Arts_Humanities";}
        else if (domesticvRadio.isChecked()) { category = "Domestic_Violence";}
        else if (hrightsRadio.isChecked()) { category = "Human_Rights";}
        else if (homelessRadio.isChecked()) { category = "Homelessness";}
        else if (religionRadio.isChecked()) { category = "Religious";}
        else if (youthRadio.isChecked()) { category = "Youth";}
    }
            public void onclicked(View view) {
                
                //passes category to second activity
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                intent.putExtra("category", category); // pass "category" to the next Activity
                startActivity(intent);
            }
}



