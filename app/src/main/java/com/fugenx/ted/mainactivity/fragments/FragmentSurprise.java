package com.fugenx.ted.mainactivity.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fugenx.ted.mainactivity.MainActivity;
import com.fugenx.ted.R;

public class FragmentSurprise extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_surprise, container, false);
        return view;
    }
    public void onResume(){
        super.onResume();

        ((MainActivity) getActivity())
                .setActionBarTitle("TED Surprise me");

    }
}
