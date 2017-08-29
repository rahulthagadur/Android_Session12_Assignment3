package com.example.thagadur.android_session12_assignment3;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button alertButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initialising with ID
        alertButton=(Button)findViewById(R.id.alert_dialog);
//        calling onCliclistner to for Button to appear alert dialog
        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                //setting calcel button to false
                builder.setCancelable(false);
                //setting Icon for the dialog box
                builder.setIcon(R.drawable.delete1);
                //setting Title for the dialog box
                builder.setTitle("Confirm Delete...");
                //setting Message for the dialog box
                builder.setMessage("Are you sure you want to delete this ");
                //setting onclick listner for postive "Yes" button
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //exiting from the application
                        finish();
                    }
                });
                //setting onclick listner for negative "No" button
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //exiting from the dialog box
                        dialogInterface.cancel();
                    }
                });

                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("AlertDialogExample");
                alert.show();
                setContentView(R.layout.activity_main);
            }
        });


    }


}
