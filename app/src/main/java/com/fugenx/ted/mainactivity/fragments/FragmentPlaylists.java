package com.fugenx.ted.mainactivity.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fugenx.ted.mainactivity.MainActivity;
import com.fugenx.ted.R;
import com.fugenx.ted.mainactivity.adapters.PlaylistAdapter;
import com.fugenx.ted.mainactivity.model.Product;

import java.util.ArrayList;
import java.util.List;

public class FragmentPlaylists extends Fragment {
    RecyclerView recyclerView;
    List<Product> productList;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_playlists, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        productList = new ArrayList<>();
        productList.add(
                new Product(
                        1,
                        R.drawable.image1,
                        "Suzuki jimny",
                        "4 Wheels   |",
                        "00:00:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image2,
                        "Vazirani Automotive",
                        "4 Wheels    |",
                        "00:00:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image3,
                        "Mercedes benz",
                        "4 Wheels   |",
                        "00:00:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image4,
                        "New Toyota",
                        "4 Wheels   |",
                        "00:00:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image5,
                        "BMW Bike",
                        "2 Wheels    |",
                        "00:00:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image6,
                        "Bentley Car",
                        "4 Wheels    |",
                        "00:00:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image7,
                        "Ducati Bike",
                        "2 Wheels   |",
                        "00:00:00"));
        productList.add(
                new Product(
                        1,
                        R.drawable.image8,
                        "Jeep Renegade",
                        "4 Wheels    |",
                        "00:00:00"));

        PlaylistAdapter adapter = new PlaylistAdapter(context, productList);

        recyclerView.setAdapter(adapter);
        return view;

    }
    public void onResume(){
        super.onResume();
        ((MainActivity) getActivity())
                .setActionBarTitle("TED Playlists");

    }
}
