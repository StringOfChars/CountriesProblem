package com.example.countriesproblem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String countries = "Afghanistan Albania Algeria American Samoa Andorra Angola " +
                "OAE Antigua and Barbuda Atlantis Argentina Armenia Aruba Australia Austria Bosnia European Union";
        String[] allCountries = new String[16];
        String potentialCountry = "";
        int idx = 0;

        for (int i = 0; i < countries.length(); i++) {
            char x = countries.charAt(i);

            if ((i <= countries.length() - 3 && countries.charAt(i + 1) == 'a' && countries.charAt(i + 2) == 'n' &&
                    countries.charAt(i + 3) == 'd' && countries.charAt(i + 4) == ' ')
                    || (i > 3 && countries.charAt(i - 1) == 'd' && countries.charAt(i - 2) == 'n' &&
                    countries.charAt(i - 3) == 'a' && countries.charAt(i - 4) == ' ')
                    || potentialCountry.matches("American") || potentialCountry.matches("European")) {
                potentialCountry += x;
                continue;
            }

            if (x == ' ') {
                allCountries[idx] = potentialCountry;
                potentialCountry = "";
                idx++;
                continue;
            }

            potentialCountry += x;

            if (x == countries.charAt(countries.length() - 1)) {
                allCountries[idx] = potentialCountry;
            }
        }
        String allCountryNames = "";
        for (String countryName : allCountries) {
            allCountryNames += "\"" + countryName + "\", ";
        }
        System.out.println(allCountryNames.substring(0, allCountryNames.length() - 2) + ".");
    }

}










