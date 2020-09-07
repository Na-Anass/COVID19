package ma.ac.usmba.fpt.sim.covid19stats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.AdviceViewHoldre> {

    private Context mCtx;
    private List<Advice> adviceList;


    public CardAdapter(Context mCtx, ArrayList<Advice> adviceList) {
        this.mCtx = mCtx;
        this.adviceList = adviceList;
    }

    @NonNull
    @Override
    public AdviceViewHoldre onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater  = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_item,null);
        AdviceViewHoldre holdr = new AdviceViewHoldre(view);
        return holdr;
    }

    @Override
    public void onBindViewHolder(@NonNull AdviceViewHoldre holder, int position) {
        //getting the advice of the specified position
        Advice advice = adviceList.get(position);
        holder.textViewAdvice.setText(advice.getAdviceWords());
        holder.imageViewAdvice.setImageDrawable(mCtx.getResources().getDrawable(advice.getImageResourceId()));

    }

    @Override
    public int getItemCount() {
        return adviceList.size();
    }

    class AdviceViewHoldre extends RecyclerView.ViewHolder {

        ImageView imageViewAdvice;
        TextView textViewAdvice;
        public AdviceViewHoldre(@NonNull View itemView) {
            super(itemView);
            imageViewAdvice = itemView.findViewById(R.id.img_advice);
            textViewAdvice = itemView.findViewById(R.id.txt_advice);
        }
    }
}
