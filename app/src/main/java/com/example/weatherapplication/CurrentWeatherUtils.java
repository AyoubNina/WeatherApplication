package com.example.weatherapplication;

import androidx.annotation.DrawableRes;

public class CurrentWeatherUtils {

        @DrawableRes
        public static int getWeatherIconResId(final int weatherConditionId) {
            switch (weatherConditionId) {
                case 200:
                case 201:
                case 202:
                case 210:
                case 211:
                case 212:
                case 221:
                case 230:
                case 231:
                case 232:
                    return R.drawable.storm_sun_thunder_weather_icon_210229;
                case 300:
                case 301:
                case 302:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 321:
                    return R.drawable.sun_sunshine_day_weather_icon_210232;
                case 500:
                case 501:
                case 502:
                case 503:
                case 504:
                case 511:
                case 520:
                case 521:
                case 522:
                case 531:
                case 701:
                    return R.drawable.rainy_rain_cloud_cloudy_weather_icon_210231;
                case 600:
                case 601:
                case 602:
                case 611:
                case 612:
                case 613:
                case 615:
                case 616:
                case 620:
                case 621:
                case 622:
                    return R.drawable.snowy_snow_cloud_cloudy_weather_snowflake_icon_210233;
                case 711:
                    return R.drawable.storm_sun_thunder_weather_icon_210229;
                case 721:
                    return R.drawable.sun_sunshine_day_weather_icon_210232;
                case 731:
                case 761:
                case 762:
                    return R.drawable.cloudy_weather_sun_cloud_icon_210228;
                case 741:
                    return R.drawable.rainy_rain_cloud_cloudy_weather_icon_210231;
                case 771:
                    return R.drawable.cloudy_cloud_weather_icon_210226;
                case 781:
                    return R.drawable.cloudy_cloud_weather_icon_210226;
                case 800:
                    return R.drawable.sun_sunshine_day_weather_icon_210232;
                case 801:
                case 802:
                case 803:
                case 804:
                    return R.drawable.cloudy_cloud_weather_icon_210226;
                default:
                    return R.drawable.rainy_rain_cloud_cloudy_weather_icon_210231;
            }
        }
}
