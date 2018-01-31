package com.example.android.welcomescreen;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FamousPartner extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_famous_partner , container , false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button loginButton = view.findViewById(R.id.login_button);
        Button signUpButton = view.findViewById(R.id.signup_button);
//        Button homeButton = view.findViewById(R.id.home_button) ;
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginClick();
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUpClick();
            }
        });

//        homeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                homeClick();
//            }
//        });
    }



    public void loginClick() {
        startActivity(new Intent(getActivity(), LoginPage.class));
    }

    public void signUpClick() {

        startActivity(new Intent(getActivity(), SignUp.class));
    }
//    public void homeClick() {

//        startActivity(new Intent(getActivity(), HomePage.class));
//    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.individuals);
    }

}
