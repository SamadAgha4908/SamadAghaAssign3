package samad.agha.n01364908;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import samad.agha.n01364908.ui.main.SectionsPagerAdapter;

public class SamadActivity extends AppCompatActivity {
    public static Paint mPaint = new Paint();
    private CanvasView customCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        customCanvas = (CanvasView) findViewById(R.id.canvas);

    }

    public void redColor(View view){
        mPaint.setColor(Color.RED);
        currentColor(mPaint.getColor());

    }

    public void blueColor(View view){

    }

    public void greenColor(View view){

    }

    public void currentColor(int c){

    }


    public void clearCanvas(View view){
        customCanvas = (CanvasView) findViewById(R.id.signature_canvas);
        customCanvas.resetPath();
    }
}