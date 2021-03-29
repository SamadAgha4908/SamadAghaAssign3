//Samad Agha n01364908 C
package samad.agha.n01364908;

import android.Manifest;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import samad.agha.n01364908.ui.main.SectionsPagerAdapter;


public class SamadActivity extends AppCompatActivity {
    private CanvasView Canvasview;
    AnimationDrawable mframeAnimation = null;
    private ImageView ImageViewmoon;
    private ImageView ImageViewearth;
    private int STORAGE_PERMISSION_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        Canvasview = (CanvasView) findViewById(R.id.samadcanvas);

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
        Canvasview = (CanvasView) findViewById(R.id.SamadDrawingcanvas);
        Canvasview.resetPath();
    }

    public void startAnimation(View view)
    {

        ImageView img = (ImageView)findViewById(R.id.imageViewBanana);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana0);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana1);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana2);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana3);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana4);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana5);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana6);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana7);

        int reasonableDuration = 500;
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

    public void startAnimationx1(View view)
    {

        ImageView img = (ImageView)findViewById(R.id.imageViewBanana);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana0);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana1);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana2);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana3);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana4);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana5);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana6);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana7);

        int reasonableDuration = 1000;
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

    public void startAnimationx2(View view)
    {

        ImageView img = (ImageView)findViewById(R.id.imageViewBanana);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana0);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana1);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana2);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana3);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana4);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana5);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana6);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana7);

        int reasonableDuration = 500;
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

    public void startAnimationx3(View view)
    {

        ImageView img = (ImageView)findViewById(R.id.imageViewBanana);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana0);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana1);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana2);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana3);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana4);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana5);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana6);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana7);

        int reasonableDuration = 100;
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

    public void startAnimationx4(View view)
    {

        ImageView img = (ImageView)findViewById(R.id.imageViewBanana);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana0);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana1);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana2);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana3);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana4);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana5);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana6);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.banana7);

        int reasonableDuration = 30;
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


    public void stopAnimation(View view)
    {
        mframeAnimation.stop();
        mframeAnimation.setVisible(false,false);

    }

    public void startmoon(View view) {
        this.ImageViewearth = findViewById(R.id.earthImgView);
        this.ImageViewmoon = findViewById(R.id.moonImgView);

        findViewById(R.id.samadstartAnimBtn).setOnClickListener(v -> this._startAnimation());
    }

    public void stopmoon(View view) {
        this.ImageViewearth = findViewById(R.id.earthImgView);
        this.ImageViewmoon = findViewById(R.id.moonImgView);

        findViewById(R.id.samadstopAnimBtn).setOnClickListener(v -> this._stopAnimation());
    }

    private void _startAnimation() {
        this.ImageViewearth.setImageResource(R.drawable.earth);
        this.ImageViewmoon.setImageResource(R.drawable.moonog);

        Animation earthAnim = AnimationUtils.loadAnimation(this, R.anim.spin);
        Animation moonAnim = AnimationUtils.loadAnimation(this, R.anim.spin2);

        earthAnim.setRepeatCount(Animation.INFINITE);
        moonAnim.setRepeatMode(Animation.RESTART);
        moonAnim.setRepeatCount(Animation.INFINITE);

        this.ImageViewmoon.startAnimation(moonAnim);
        this.ImageViewearth.startAnimation(earthAnim);
    }

    private void _stopAnimation() {
        this.ImageViewearth.clearAnimation();
        this.ImageViewmoon.clearAnimation();

    }


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_baseline_warning_24)
                .setTitle(getString(R.string.ExitConfirmTitle))
                .setMessage(getString(R.string.ExitConfirm))
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void request(View view) {
        Button buttonRequest = findViewById(R.id.samadPermbtn);
        buttonRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(SamadActivity.this,
                        Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(SamadActivity.this, "This permission is already granted",
                            Toast.LENGTH_SHORT).show();
                } else {
                    requestStoragePermission();
                }
            }
        });
    }

    private void requestStoragePermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.READ_EXTERNAL_STORAGE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission needed")
                    .setMessage("This permission is needed because of the assignment")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(SamadActivity.this,
                                    new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
                        }
                    })
                    .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create().show();
        } else {
            ActivityCompat.requestPermissions(this,
                    new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == STORAGE_PERMISSION_CODE)  {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission GRANTED", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }
}


