package com.romain.app10fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class BlankFragment extends Fragment {

    private EditText txtLogin;
    private EditText txtPass;
    private Button btnConnect;


    /**
     * Méthode qui se charge d'injecter la ressource de fragment à l'intérieur du fragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_blank, container, true);

        txtLogin = (EditText) rootView.findViewById(R.id.txtLogin);
        txtPass = (EditText) rootView.findViewById(R.id.txtPass);
        btnConnect = (Button) rootView.findViewById(R.id.btnConnect);

        // J'enregistre sur mon btnConnect mon OnClickListener
        btnConnect.setOnClickListener(btnConnectListener);

        return rootView;
    }

    private View.OnClickListener btnConnectListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("DEBUG", txtLogin.getText() + " / " + txtPass.getText());

        }
    };

}
