//Samad Agha n01364908 C
package samad.agha.n01364908;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import samad.agha.n01364908.ui.main.SectionsPagerAdapter;
import samad.agha.n01364908.CanvasView;

import static java.security.AccessController.getContext;


public class SamadActivity extends AppCompatActivity {
    private CanvasView Canvasview;
    AnimationDrawable mframeAnimation = null;
    private ImageView ImageViewmoon;
    private ImageView ImageViewearth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        Canvasview = (CanvasView) findViewById(R.id.canvas);

    }

    // Handle Start Button frame frame
    public void starting(View view)
    {
        final Button onButton = (Button) findViewById(R.id.ButtonStart);
        onButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startAnimation();
            }
        });
    }

    // Handle Stop Button
    public void stopping(View view){
    final Button offButton = (Button) findViewById(R.id.ButtonStop);
        offButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            stopAnimation();
        }
    });
        }

    public void redColor(View view){
        CanvasView.mPaint.setColor(Color.RED);
    }
    public void blueColor(View view){
        CanvasView.mPaint.setColor(Color.BLUE);
    }
    public void greenColor(View view){
        CanvasView.mPaint.setColor(Color.GREEN);
    }
    public void blackColor(View view){
        CanvasView.mPaint.setColor(Color.BLACK);
    }

    public void s1(View view) { CanvasView.mPaint.setStrokeWidth(3); }
    public void s2(View view) { CanvasView.mPaint.setStrokeWidth(10); }
    public void s3(View view) { CanvasView.mPaint.setStrokeWidth(20); }

    public void clearCanvas(View view){
        Canvasview = (CanvasView) findViewById(R.id.signature_canvas);
        Canvasview.resetPath();
    }

    private void startAnimation()
    {

        ImageView img = (ImageView)findViewById(R.id.imageView_Boy);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana0);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana1);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana2);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana3);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana4);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana5);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana6);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana7);


        // Get the background, which has been compiled to an AnimationDrawable object.
        int reasonableDuration = 250;
        mframeAnimation = new AnimationDrawable();
        mframeAnimation.setOneShot(false);	// loop continuously
        mframeAnimation.addFrame(frame1, reasonableDuration);
        mframeAnimation.addFrame(frame2, reasonableDuration);
        mframeAnimation.addFrame(frame3, reasonableDuration);
        mframeAnimation.addFrame(frame4, reasonableDuration);
        mframeAnimation.addFrame(frame5, reasonableDuration);
        mframeAnimation.addFrame(frame6, reasonableDuration);
        mframeAnimation.addFrame(frame7, reasonableDuration);
        mframeAnimation.addFrame(frame8, reasonableDuration);

        img.setBackground(mframeAnimation);

        mframeAnimation.setVisible(true,true);
        mframeAnimation.start();
    }
    private void stopAnimation()
    {
        mframeAnimation.stop();
        mframeAnimation.setVisible(false,false);

    }

    public void startmoon(View view) {
        this.ImageViewearth = findViewById(R.id.earthImgView);
        this.ImageViewmoon = findViewById(R.id.moonImgView);

        // add event handlers
        findViewById(R.id.startAnimBtn).setOnClickListener(v -> this._startAnimation());
    }

    public void stopmoon(View view) {
        this.ImageViewearth = findViewById(R.id.earthImgView);
        this.ImageViewmoon = findViewById(R.id.moonImgView);

        findViewById(R.id.stopAnimBtn).setOnClickListener(v -> this._stopAnimation());
    }

    //helper methods
    private void _startAnimation() {
        Toast.makeText(this, getResources().getString(R.string.startanim_txt), Toast.LENGTH_SHORT).show();
        // we will animate the imageview
        this.ImageViewearth.setImageResource(R.drawable.earth);
        this.ImageViewmoon.setImageResource(R.drawable.moonog);

        // Load the appropriate animation
        Animation earthAnim = AnimationUtils.loadAnimation(this, R.anim.spin);
        Animation moonAnim = AnimationUtils.loadAnimation(this, R.anim.spin2);

        earthAnim.setRepeatCount(Animation.INFINITE);
        moonAnim.setRepeatMode(Animation.RESTART);
        moonAnim.setRepeatCount(Animation.INFINITE);
        // Register a listener, so we can disable and re-enable buttons
//        an.setAnimationListener(new MyAnimationListener());
        // Start the animation
        this.ImageViewmoon.startAnimation(moonAnim);
        this.ImageViewearth.startAnimation(earthAnim);
    }

    private void _stopAnimation() {
        Toast.makeText(this, getResources().getString(R.string.stopanim_txt), Toast.LENGTH_SHORT).show();
        this.ImageViewearth.clearAnimation();
        this.ImageViewmoon.clearAnimation();
        // remove image resources
//        this._earthImageView.setImageResource(0);
//        this._moonImageView.setImageResource(0);
    }



}

