package ma.ac.usmba.fpt.sim.covid19stats;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Advices extends AppCompatActivity {

    ArrayList<Advice> adviceList;
    CardAdapter adapter ;
    RecyclerView recyclerView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advices);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        adviceList = new ArrayList<>();


        adviceList.add(new Advice(R.drawable.mask,"Wear a face mask"));
        adviceList.add(new Advice(R.drawable.cough,"Cover your mounth and nose with your band elbow when you caugh or sneeze"));
        adviceList.add(new Advice(R.drawable.wash_hands,"Wash your hands with soap and water frequently"));
        adviceList.add(new Advice(R.drawable.covid_alcohol,"Use hand alcohol-based hand rub \nif soap and water are not available"));
        adviceList.add(new Advice(R.drawable.handshak,"Don't shake hands or hugg"));
        adviceList.add(new Advice(R.drawable.social_distance,"Stay 2m apart"));
        adviceList.add(new Advice(R.drawable.stay_at_home,"Stay home"));
        adviceList.add(new Advice(R.drawable.stay_away,"Stay away from each other"));
        adviceList.add(new Advice(R.drawable.strong,"Adopt healthy life style and exercices"));
        adviceList.add(new Advice(R.drawable.travel,"Avoid travel"));
        adviceList.add(new Advice(R.drawable.work_from_home,"Work from home if possible"));
        adviceList.add(new Advice(R.drawable.ventilation,"Ventilate rooms often"));


        CardAdapter adapter = new CardAdapter(this,adviceList);
        recyclerView.setAdapter(adapter);
    }
}