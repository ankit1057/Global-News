package com.devoy.androidnewsapp.Common;

import com.devoy.androidnewsapp.Interface.IconBetterIdeaService;
import com.devoy.androidnewsapp.Interface.NewsService;
import com.devoy.androidnewsapp.Remote.IconBetterIdeaClient;
import com.devoy.androidnewsapp.Remote.RetrofitClient;

/**
 * Created by reale on 10/4/2017.
 */

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="5bff40078f904cf5b0c1031f282c413b";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=a7072d9c2ad9495a8dd5cb58a7fd30df
    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}
