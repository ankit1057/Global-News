package com.devoy.androidnewsapp.Interface;

import com.devoy.androidnewsapp.Common.Common;
import com.devoy.androidnewsapp.Model.News;
import com.devoy.androidnewsapp.Model.WebSite;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by reale on 10/4/2017.
 */

public interface NewsService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
