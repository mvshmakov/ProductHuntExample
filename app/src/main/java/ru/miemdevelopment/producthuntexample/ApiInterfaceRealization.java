package ru.miemdevelopment.producthuntexample;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiInterfaceRealization extends Application {

    private static ProductHuntApi productHuntApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.producthunt.com/") //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        productHuntApi = retrofit.create(ProductHuntApi.class); //Создаем объект, при помощи которого будем выполнять запросы
    }

    public static ProductHuntApi getApi() {
        return productHuntApi;
    }
}