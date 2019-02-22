package com.ahlinyuan.dagger.http;

import com.ahlinyuan.dagger.model.BaseModel;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    /**
     * http://static.owspace.com/index.php?m=Home&c=Api&a=getLunar&client=android&device_id=866963027059338&version=866963027059338
     * @return
     */
    @GET("index.php")
    Observable<BaseModel> getRecommend(@Query("m") String m, @Query("c") String api, @Query("a") String a, @Query("client") String client, @Query("version") String version, @Query("device_id") String deviceId);

}
