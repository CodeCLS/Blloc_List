package cls.development.blloc_list;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
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
        final MotionLayout motionLayout = findViewById(R.id.motionlayout_1);
        //motionLayout.getTransition(R.id.motionlayout_1).setEnable(false);
        LinearLayout linearLayout = findViewById(R.id.linear);







        Toast.makeText(this, "enabled: "+motionLayout.isInteractionEnabled(), Toast.LENGTH_SHORT).show();






        final RecyclerView recyclerView2 = findViewById(R.id.rec_2);

        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(new recyclerViewAdapter());
        recyclerView2.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {
                boolean state =motionLayout.isActivated();
                Log.d("State23","state: " + state);
                motionLayout.setTransitionListener(new MotionLayout.TransitionListener() {
                    @Override
                    public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {

                    }

                    @Override
                    public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {

                    }

                    @Override
                    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
                        recyclerView2.setLayoutFrozen(false);

                    }

                    @Override
                    public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {
                        recyclerView2.setLayoutFrozen(true);



                    }
                });


            }
        });








    }
}