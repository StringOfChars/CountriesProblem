package com.example.countriesproblem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String countries = "Afghanistan Albania Algeria American Samoa Andorra Angola " +
                "Antigua and Barbuda Atlantis Argentina Armenia Aruba Australia Austria Bosnia";
        String[] allCountries = new String[17];
        StringTokenizer strObject = new StringTokenizer(countries, " ");

        String potentialCountry = "";
        int idx = 0;

        for (int i = 0; i < countries.length(); i++) {
            char x = countries.charAt(i);
            potentialCountry += x;

            if (x == countries.charAt(countries.length() - 1)) {
                allCountries[idx] = potentialCountry;
            }

            if (x == ' ') {
                StringBuffer sb = new StringBuffer(potentialCountry);
                allCountries[idx] = sb.substring(0, potentialCountry.length() - 1);
                if (allCountries[idx] == "and") {
                    allCountries[idx] = "Test";
                    potentialCountry = "";
                } else {
                    potentialCountry = "";
                    idx++;
                }
            }
        }

        System.out.println(Arrays.toString(allCountries) + ".");
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










