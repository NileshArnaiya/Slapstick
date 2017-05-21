package crystal.labs.instavines;

import android.support.multidex.MultiDexApplication;

import crystal.labs.instavines.api.YoutubeDataClient;

public class CustomApplication extends MultiDexApplication {

    private static YoutubeDataClient youtubeClient;

    public static YoutubeDataClient getYoutubeClient() {
        return youtubeClient;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        youtubeClient = new YoutubeDataClient();
    }

}