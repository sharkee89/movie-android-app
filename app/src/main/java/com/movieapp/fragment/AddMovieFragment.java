package com.movieapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.movieapp.model.Movie;

import info.androidhive.bottomnavigation.R;


public class AddMovieFragment extends Fragment implements View.OnClickListener {

    Button addMovieBtn;
    EditText etTitle;

    public AddMovieFragment() {
        // Required empty public constructor
    }

    public static AddMovieFragment newInstance(String param1, String param2) {
        AddMovieFragment fragment = new AddMovieFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_movie, container, false);
        etTitle = view.findViewById(R.id.add_movie_title);
        addMovieBtn = (Button) view.findViewById(R.id.ButtonAddMovie);
        addMovieBtn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        // implements your things
        Movie tempMovie = new Movie(etTitle.getText().toString(), "TEST_IMAGE_URL");
        System.out.println("MOVIE THAT WILL BE ADDED");
        System.out.println(tempMovie.getTitle());
        System.out.println(tempMovie.getImage());
    }

}
