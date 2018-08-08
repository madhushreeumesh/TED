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
import com.fugenx.ted.mainactivity.adapters.PodcastAdapter;
import com.fugenx.ted.mainactivity.model.Podcast;

import java.util.ArrayList;
import java.util.List;

public class FragmentPodcasts extends Fragment {

        RecyclerView recyclerView;
        List<Podcast> productList;
        Context context;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_podcasts, container, false);
            recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
            productList = new ArrayList<>();
            productList.add(
                    new Podcast(
                            R.drawable.image1,
                            "Daily Talks",
                            "Today"));
            productList.add(
                    new Podcast(
                            R.drawable.image2,
                            "Work Life And Adam",
                            "Tuesday"));
            productList.add(
                    new Podcast(
                            R.drawable.image3,
                            "Nice Speech",
                            "Monday"));
            productList.add(
                    new Podcast(
                            R.drawable.image4,
                            "Sincerely TED",
                            "Today"));
            productList.add(
                    new Podcast(
                            R.drawable.image5,
                            "Radio Hour",
                            "Thurssday"));
            productList.add(
                    new Podcast(
                            R.drawable.image6,
                            "Radio Hour",
                            "Thurssday"));
            productList.add(
                    new Podcast(
                            R.drawable.image7,
                            "Radio Hour",
                            "Thurssday"));
            productList.add(
                    new Podcast(
                            R.drawable.image8,
                            "Radio Hour",
                            "Thurssday"));

            PodcastAdapter adapter = new PodcastAdapter(context, productList);

            recyclerView.setAdapter(adapter);
            return view;
        }
        public void onResume(){
            super.onResume();

            ((MainActivity) getActivity())
                    .setActionBarTitle("TED Podcasts");

        }
    }
