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
            potentialCountry += x;
            if (x == countries.charAt(countries.length() - 1)) {
                allCountries[idx] = potentialCountry;
            }
            if (x == ' ') {
                allCountries[idx] = potentialCountry.substring(0, potentialCountry.length() - 1);
                if (Objects.equals(countries.charAt(i + 1), 'a') && (Objects.equals(countries.charAt(i + 2), 'n') &&
                        (Objects.equals(countries.charAt(i + 3), 'd') && (Objects.equals(countries.charAt(i + 4), ' '))))
                        || (Objects.equals(countries.charAt(i - 1), 'd') && (Objects.equals(countries.charAt(i - 2), 'n') &&
                        (Objects.equals(countries.charAt(i - 3), 'a') && (Objects.equals(countries.charAt(i - 4), ' ')))))) {
                } else if ((allCountries[idx].matches("American")) || ((allCountries[idx].matches("European")))) {
                } else {
                    potentialCountry = "";
                    idx++;
                }
            }
        }
        String allCountryNames = "";
        for (String countryName : allCountries) {
            allCountryNames += "\"" + countryName + "\", ";
        }
        System.out.println(allCountryNames.substring(0, allCountryNames.length() - 2) + ".");
    }
}


//           allCountries[token] = strObject.nextElement().toString(); //@TODO with custom String country parser
//            //@TODO prettier for android Studio
//        for (int token = 0; token < allCountries.length; token++) {
//
//            if (allCountries[token].matches("and")) {
//                allCountries[token -1] =   allCountries[token -1] + " " + allCountries[token] +  " " + allCountries[token+1];
//                for (int split = token; split < allCountries.length-2; split++) {
//                    allCountries [split] = allCountries[split+2];
//                   } break;
//               }
//            if ((allCountries[token].matches("American"))||(allCountries[token].matches("European"))
//                    ||(allCountries[token].matches("United")))
//            {
//                allCountries[token] = allCountries[token] + " " + allCountries[token+1];
//                for (int split = token + 1; split < allCountries.length-2; split++) {
//                    allCountries [split] = allCountries[split+1];
//                } break;
//            }}
//        String allCountryNames = "";
//
//        for (String countryName : allCountries) {
//
//            allCountryNames += "\"" + countryName + "\", ";
//        }
//        System.out.println(allCountryNames.substring(0, allCountryNames.length()-2) + ".");










