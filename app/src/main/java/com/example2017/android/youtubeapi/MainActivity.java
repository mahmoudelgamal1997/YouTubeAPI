package com.example2017.android.youtubeapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String key="AIzaSyAaGQJ98MaaNztJp1FrGD1cMD98fnF8c6w";
        //define youtubeplerview
        final YouTubePlayerView play=(YouTubePlayerView)findViewById(R.id.youtube_player_view);

        play.initialize(key,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                    //video id
                        youTubePlayer.cueVideo("a4NT5iBFuZs");

                    }
                    //this function is exception when is error or id is false
                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                    }
                }
        );
    }
    }

