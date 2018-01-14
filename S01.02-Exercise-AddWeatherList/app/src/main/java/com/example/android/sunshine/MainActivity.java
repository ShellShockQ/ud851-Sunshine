/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        mWeatherTextView = findViewById(R.id.tv_weather_data);

        String [] fakeWeatherData ={"" +
                "Today, Jan 14 - Clear - 32° C / 27° C",
                "Tomorrow, Jan 15 - Rainy - 35° C / 33° C",
                "Tue, Jan 16 - Sleet - 62° C / 48° C",
                "Wed, Jan 17 - Snow - 59° C / 55° C",
                "Thu, Jan 18 - Windy - 74° C / 64° C",
                "Fri, Jan 19 - Sunny - 99° C / 97° C",
                "Sat, Jan 20 - Fog - 67° C / 62° C",
                "Sun, Jan 21 - Tornado - 95° C / 88° C",
                "Mon, Jan 22 - Hail - 77° C / 70° C",
                "Tue, Jan 23 - Cloudy - 72° C / 68° C",
                "Wed, Jan 24 - Light Rain - 52° C / 47° C",
                "Wed, Jan 25 - Heavy Rain - 58° C / 50° C"
        };

        for (String forecast : fakeWeatherData){
            mWeatherTextView.append(forecast + "\n\n\n");

        }
    }
}