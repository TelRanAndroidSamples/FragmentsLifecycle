package com.telran.fragmentlifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {


    private static final String TAG = "TEL-RAN";

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        Log.e(TAG, "onAttach: FragmentA");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onCreate: FragmentA");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView: FragmentA");
        return inflater.inflate(R.layout.fragment_a_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onActivityCreated: FragmentA");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e(TAG, "onStart: FragmentA");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e(TAG, "onResume: FragmentA");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(TAG, "onPause: FragmentA");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(TAG, "onStop: FragmentA");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e(TAG, "onDestroyView: FragmentA");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy: FragmentA");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e(TAG, "onDetach: FragmentA");
        super.onDetach();
    }
}
