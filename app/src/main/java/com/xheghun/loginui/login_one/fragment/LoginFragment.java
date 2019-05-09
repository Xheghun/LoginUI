package com.xheghun.loginui.login_one.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.loginui.R;
import com.xheghun.loginui.NavigationHost;

import java.util.Objects;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_1, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.sign_up)
    void signUp() {
        ((NavigationHost) Objects.requireNonNull(getActivity())).navigateTo(new SignUpFragment(), true);
    }
}
