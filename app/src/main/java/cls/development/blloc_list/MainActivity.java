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
        LinearLayout linearLayout = findViewById(R.id.linear);


        Toast.makeText(this, "enabled: "+motionLayout.isInteractionEnabled(), Toast.LENGTH_SHORT).show();






        RecyclerView recyclerView2 = findViewById(R.id.rec_2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(new recyclerViewAdapter());



    }
}