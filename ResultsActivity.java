package com.example.charityfinder;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import io.realm.Realm;
import io.realm.RealmResults;



public class ResultsActivity extends AppCompatActivity {
    TextView dataresults;
    String resultString;

    Realm myRealm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       myRealm = Realm.getDefaultInstance();

       dataresults = findViewById(R.id.dataresults);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
           resultString = getIntent().getStringExtra("category");
           if (resultString.equals("Medical")) {
               filterforMed();
           }
           else if (resultString.equals("Environmental_Animal")) {
                filterforEnv();
           }
           else if (resultString.equals("Human_Services")) {
                filterforHServices();
           }
           else if (resultString.equals("Education")) {
                filterforEdu();
           }
           else if (resultString.equals("Public_Affairs")) {
                filterforPublica();
           }
           else if (resultString.equals("Culture_Arts_Humanities")) {
                filterforCulture();
           }
           else if (resultString.equals("Domestic_Violence")) {
                filterforDomesticv();
           }
           else if (resultString.equals("Human_Rights")) {
                filterforHrights();
           }
           else if (resultString.equals("Homelessness")) {
                filterforHomelessness();
           }
           else if (resultString.equals("Religious")) {
                filterforReligious();
           }
           else if (resultString.equals("Youth")) {
                filterforYouth();
           }
           else {
               Log.d("Error", "There was an error.");
           }
        }
    }


    public void filterforMed() {
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Medical").findAll();
        for(NationalCharity charity: results) {
            dataresults.setText("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }
    }

    public void filterforEnv(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Environmental_Animal").findAll();
        for(NationalCharity charity: results) {
            dataresults.setText("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }

        }

    public void filterforHServices(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Human_Services").findAll();
        for(NationalCharity charity: results) {
            dataresults.setText("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }

    }
    public void filterforEdu(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Education").findAll();
        dataresults.setText("");
        for(NationalCharity charity: results) {
            dataresults.append("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }

    }

    public void filterforPublica(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Public_Affairs").findAll();
        dataresults.setText("");
        for(NationalCharity charity: results) {
                dataresults.append("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                        "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                        "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                        "Web Address: " + charity.getWeb_address() + "\n");
        }
    }
    public void filterforCulture(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Culture_Arts_Humanities").findAll();
        dataresults.setText("");
        for(NationalCharity charity: results) {
            dataresults.append("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }
    }

    public void filterforDomesticv(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Domestic_Violence").findAll();
        dataresults.setText("");
        for(NationalCharity charity: results) {
            dataresults.append("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }
    }
    public void filterforHrights(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Human_Rights").findAll();
        dataresults.setText("");
        for(NationalCharity charity: results) {
            dataresults.append("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }
    }

    public void filterforHomelessness(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Homelessness").findAll();
        dataresults.setText("");
        for(NationalCharity charity: results) {
            dataresults.append("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }
    }

    public void filterforReligious(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Religious").findAll();
        dataresults.setText("");
        for(NationalCharity charity: results) {
            dataresults.append("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }
    }
    public void filterforYouth(){
        RealmResults<NationalCharity> results = myRealm.where(NationalCharity.class).equalTo("Category", "Youth").findAll();
        dataresults.setText("");
        for(NationalCharity charity: results) {
            dataresults.append("Charity name: " + charity.getCharity_name() + " " + "Category: " + charity.getCategory() + "\n" +
                    "Address: " + charity.getAddress() + " " + "City: " + charity.getCity() + " " + "State: " + charity.getState() + " " +
                    "Zip code: " + charity.getZipcode() + "\n" + "Mission Statement: " + charity.getMission_statement() + "\n" +
                    "Web Address: " + charity.getWeb_address() + "\n");
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        myRealm.close();
    }


}



