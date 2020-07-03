package com.suek.retrofit_market_practice0630;

import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface RetrofitService {

    @Multipart
    @POST("/Retrofit_Board_Market_Practice/insertDB.php")
    Call<String> postDataBoard(@PartMap Map<String, String> dataPart,
                               @Part MultipartBody.Part filePart);




}
