package com.example.maxi.marriedproject.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.maxi.marriedproject.R;
import com.squareup.picasso.Picasso;

public class FragmentInvitados extends Fragment {

    private ImageView ivPortada, mapaCeremonia, mapaFiesta;

    public FragmentInvitados() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_activiy_invitados, container, false);

        ivPortada = (ImageView) rootView.findViewById(R.id.ivPortada);
        mapaCeremonia = (ImageView) rootView.findViewById(R.id.mapaCeremonia);
        mapaFiesta = (ImageView) rootView.findViewById(R.id.mapaFiesta);

        Picasso.with(getActivity()).load("https://scontent-mia1-1.xx.fbcdn.net/hphotos-ash2/v/t1.0-9/10703598_10152782194643934_4186794907518946013_n.jpg?oh=26bdd83dd521a22675b61ed25af2de25&oe=5729DFAF").into(ivPortada);
        Picasso.with(getActivity()).load("https://scontent-mia1-1.xx.fbcdn.net/hphotos-ash2/v/t1.0-9/10703598_10152782194643934_4186794907518946013_n.jpg?oh=26bdd83dd521a22675b61ed25af2de25&oe=5729DFAF").into(mapaCeremonia);
        Picasso.with(getActivity()).load("https://scontent-mia1-1.xx.fbcdn.net/hphotos-ash2/v/t1.0-9/10703598_10152782194643934_4186794907518946013_n.jpg?oh=26bdd83dd521a22675b61ed25af2de25&oe=5729DFAF").into(mapaFiesta);

        return rootView;
    }
}
