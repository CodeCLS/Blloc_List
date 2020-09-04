package cls.development.blloc_list;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MotionLayout motionLayout = findViewById(R.id.motionlayout_1);
        //motionLayout.getTransition(R.id.motionlayout_1).setEnable(false);
        RecyclerView recyclerView = findViewById(R.id.rec_1);
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayout linearLayout = findViewById(R.id.linear);
        linearLayout.setNestedScrollingEnabled(false);

        Toast.makeText(this, "enabled: "+motionLayout.isInteractionEnabled(), Toast.LENGTH_SHORT).show();
        motionLayout.addTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {
                Toast.makeText(MainActivity.this, "Started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {
                Toast.makeText(MainActivity.this, "Ended", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int i) {

            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {
                Toast.makeText(MainActivity.this, "Triggered", Toast.LENGTH_SHORT).show();

            }
        });
        recyclerView.addOnItemTouchListener(new RecyclerView.SimpleOnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                return true;
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new recyclerViewAdapter());
        recyclerView.setClipToOutline(false);
        recyclerView.setClipChildren(false);


        RecyclerView recyclerView2 = findViewById(R.id.rec_2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(new recyclerViewAdapter());



    }
}