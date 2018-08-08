package com.fugenx.ted.mainactivity.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fugenx.ted.activity.LoginActivity;
import com.fugenx.ted.mainactivity.MainActivity;
import com.fugenx.ted.R;

public class FragmentMyTalks extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_talks, container, false);

        Button button = (Button) view.findViewById(R.id.btn_sndlog);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(v.getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void onResume(){
        super.onResume();

        ((MainActivity) getActivity())
                .setActionBarTitle("TED My talks");

    }
}
