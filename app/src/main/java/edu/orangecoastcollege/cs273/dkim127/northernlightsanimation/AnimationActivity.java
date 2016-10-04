package edu.orangecoastcollege.cs273.dkim127.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;

public class AnimationActivity extends AppCompatActivity {

    private Animation rotateAnim;
    private Animation shakeAnim;
    private Animation customAnim;
    private AnimationDrawable frameAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }
}
