package com.example.gestionnairedelicence.IHM;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gestionnairedelicence.R;

public class MainActivity extends AppCompatActivity {
    private Button btNewLicence, btNewClient, btConsult, btAffectation, btQuitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btConsult = findViewById(R.id.btConsult);
        btNewClient = findViewById(R.id.BtNewClient);
        btNewLicence = findViewById(R.id.BtNewLicence);
        btAffectation = findViewById(R.id.btAffectation);
        btQuitter = findViewById(R.id.btQuitter);

        btConsult.setOnClickListener(bConsultLicences);
        btNewLicence.setOnClickListener(bNewLicence);
        btNewClient.setOnClickListener(bNewClient);
        btAffectation.setOnClickListener(bAffectation);
        btQuitter.setOnClickListener(quitterListener);
    }

    public Button getBtNewLicence() {
        return btNewLicence;
    }

    public void setBtNewLicence(Button btNewLicence) {
        this.btNewLicence = btNewLicence;
    }

    public Button getBtConsult() {
        return btConsult;
    }

    public void setBtConsult(Button btConsult) {
        this.btConsult = btConsult;
    }

    public Button getBtQuitter() {
        return btQuitter;
    }

    public void setBtQuitter(Button btQuitter) {
        this.btQuitter = btQuitter;
    }

    private void quitter() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        //set title
        alertDialogBuilder.setTitle("Voulez-vous vraiment quitter l'application ? ");

        //set dialog message
        alertDialogBuilder.setPositiveButton("Oui", (dialog, id) -> finish());
        alertDialogBuilder.setNegativeButton("Non ", (dialog, id) -> dialog.cancel());

        //Creation de la POPUP
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private View.OnClickListener quitterListener = view -> quitter();

    private View.OnClickListener bConsultLicences = view -> {
        Intent iConsult = new Intent(this, ConsultActivity.class);
        startActivity(iConsult);
    };

    private View.OnClickListener bNewClient = view -> {
        Intent iConsult = new Intent(this, ClientActivity.class);
        startActivity(iConsult);
    };

    private View.OnClickListener bNewLicence = view -> {
        Intent iConsult = new Intent(this, LicenceActivity.class);
        startActivity(iConsult);
    };

    private View.OnClickListener bAffectation = view -> {
        Intent iConsult = new Intent(this, AffectationActivity.class);
        startActivity(iConsult);
    };
}