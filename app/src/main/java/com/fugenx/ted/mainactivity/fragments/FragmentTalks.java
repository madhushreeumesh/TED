package com.fugenx.ted.mainactivity.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fugenx.ted.mainactivity.MainActivity;
import com.fugenx.ted.R;
import com.fugenx.ted.mainactivity.adapters.ProductAdapter;
import com.fugenx.ted.mainactivity.model.Product;

import java.util.ArrayList;
import java.util.List;

public class FragmentTalks extends Fragment implements View.OnClickListener{
    RecyclerView recyclerView;
    List<Product> productList;
    Context context;
    private Button btn_text1 , btn_text2 , btn_text3, btn_text4,btn_text5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_talks, container, false);

        context = getActivity();

        Button button = (Button) view.findViewById(R.id.btn_text2);
        button.setOnClickListener(this);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        productList = new ArrayList<>();
        productList.add(
                new Product(
                        1,
                        R.drawable.image1,
                        "Suzuki jimny",
                        "Beautiful car with Brown color",
                        "0:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image2,
                        "Vazirani Automotive",
                        "Beautiful shul hyper car",
                        "0:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image3,
                        "Mercedes benz",
                        "Beautiful E220d All-Terian",
                        "0:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image4,
                        "New Toyota",
                        "Beautiful toyota century car",
                        "0:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image5,
                        "BMW Bike",
                        "New BMW G 310 GS India",
                        "0:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image6,
                        "Bentley Car",
                        "Bentley bentyage pikes peak",
                        "0:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image7,
                        "Ducati Bike",
                        "Ducati Multistarda 1260",
                        "0:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image8,
                        "Jeep Renegade",
                        "Renegade Trailhawk Facelift",
                        "0:00"));

        ProductAdapter adapter = new ProductAdapter(context, productList);
        recyclerView.setAdapter(adapter);

        btn_text1 = (Button) view.findViewById(R.id.btn_text);
        btn_text2 = (Button) view.findViewById(R.id.btn_text2);
        btn_text3 = (Button) view.findViewById(R.id.btn_text3);
        btn_text4 = (Button) view.findViewById(R.id.btn_text4);
        btn_text5 = (Button) view.findViewById(R.id.btn_text5);

        btn_text1.setOnClickListener(this);
        btn_text2.setOnClickListener(this);
        btn_text3.setOnClickListener(this);
        btn_text4.setOnClickListener(this);
        btn_text5.setOnClickListener(this);

        return view;
    }

    public void onResume(){
        super.onResume();

        ((MainActivity) getActivity())
                .setActionBarTitle("TED Talks");
        }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch(id)
        {
            case R.id.btn_text:
                if(view.equals(btn_text1))
                {
                    btn_text1.setTextColor(ContextCompat.getColor(context, R.color.colorPrimaryDark));
                }
                else
                    btn_text2.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text3.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text4.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text5.setTextColor(ContextCompat.getColor(context,R.color.black));
                break;

            case R.id.btn_text2:

                if(view.equals(btn_text2))
                {
                    btn_text2.setTextColor(ContextCompat.getColor(context, R.color.colorPrimaryDark));

                }
                else

                    btn_text3.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text4.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text5.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text1.setTextColor(ContextCompat.getColor(context,R.color.black));

                break;

            case R.id.btn_text3:

                if(view.equals(btn_text3))
                {
                    btn_text3.setTextColor(ContextCompat.getColor(context, R.color.colorPrimaryDark));
                }
                else
                    btn_text4.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text5.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text1.setTextColor(ContextCompat.getColor(context, R.color.black));
                btn_text2.setTextColor(ContextCompat.getColor(context,R.color.black));
                break;

            case R.id.btn_text4:

                if(view.equals(btn_text4))
                {
                    btn_text4.setTextColor(ContextCompat.getColor(context, R.color.colorPrimaryDark));
                }
                else

                    btn_text5.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text1.setTextColor(ContextCompat.getColor(context, R.color.black));
                btn_text2.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text3.setTextColor(ContextCompat.getColor(context,R.color.black));
                break;

            case R.id.btn_text5:
                if(view.equals(btn_text5))
                {
                    btn_text5.setTextColor(ContextCompat.getColor(context, R.color.colorPrimaryDark));
                }
                else
                    btn_text1.setTextColor(ContextCompat.getColor(context, R.color.black));
                btn_text2.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text3.setTextColor(ContextCompat.getColor(context,R.color.black));
                btn_text4.setTextColor(ContextCompat.getColor(context,R.color.black));
                break;
        }
    }

}
