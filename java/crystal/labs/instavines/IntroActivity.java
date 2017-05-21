package crystal.labs.instavines;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;
import com.pratap.gplaystore.Main2Activity;
import com.pratap.gplaystore.MainActivity;

public class IntroActivity extends AppIntro2 {

    @Override
    public void setImageSkipButton(Drawable imageSkipButton) {
        super.setImageSkipButton(imageSkipButton);
        Intent intent = new Intent(IntroActivity.this, Main2Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        addSlide(AppIntro2Fragment.newInstance("Passwords are safe", "We do not sell your passwords to Google or anyone else ,data is stored in your device only ", R.drawable.ic_matthew,
//                Color.parseColor("#424874")));
//        addSlide(AppIntro2Fragment.newInstance("Social Accounts", "Save social media emails and passwords of Facebook ,Google and more.. ", R.drawable.ic_amandacerny,
//                Color.parseColor("#8E0B4F")));
//        addSlide(AppIntro2Fragment.newInstance("Saving Notes", "Save your ideas in a colorful and shareable format",
//                R.drawable.ic_curtislepore, Color.parseColor("#8C4843")));
//        addSlide(AppIntro2Fragment.newInstance("Save Web Pages", " Allows to save web pages for offline access and future reading ", R.drawable.ic_kingbach,
//                Color.parseColor("#58BC82")));

        // OPTIONAL METHODS
        // Override bar/separator color.
//        setBarColor(Color.parseColor("#3F51B5"));
//        setSeparatorColor(Color.parseColor("#2196F3"));

        showSkipButton(true);
        setProgressButtonEnabled(true);
        setFlowAnimation();


    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);


        // Do something when the slide changes.
    }

}
