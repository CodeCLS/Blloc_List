package cls.development.blloc_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class recyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rec_item,parent,false);
        return new holder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        position = position+1;
        ((holder1) holder).txt.setText("Recent Conversation " + position);




    }

    @Override
    public int getItemCount() {
        return 10;
    }
    public static class holder1 extends RecyclerView.ViewHolder{
        TextView txt;

        public holder1(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.textView);
        }
    }

}
