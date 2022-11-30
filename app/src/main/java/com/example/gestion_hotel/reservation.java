package com.example.gestion_hotel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfIndirectReference;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;


import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class reservation extends AppCompatActivity {

    Intent intent;
    TextView cattt;
    AppCompatButton d1,d2,rsrv;
    AppCompatEditText nomP,prenom,dn,ville,cp,pays,tele;

    private static final int STORAGE_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        intent = getIntent();
        String k = intent.getStringExtra("cat");
        cattt = findViewById(R.id.cattt);
        d1 = findViewById(R.id.dated);
        d2 = findViewById(R.id.datef);
        rsrv = findViewById(R.id.rsrv2);
        nomP = findViewById(R.id.nomP);
        prenom =findViewById(R.id.prenom);
        dn= findViewById(R.id.dn);
        ville= findViewById(R.id.ville);
        cp=findViewById(R.id.cp);
        pays=findViewById(R.id.pays);
        tele=findViewById(R.id.tele);

        MaterialDatePicker materialDatePicker = MaterialDatePicker.Builder.datePicker().setTitleText("").setSelection(MaterialDatePicker.todayInUtcMilliseconds()).build();

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(), "Tag_Picker");
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        d1.setText(materialDatePicker.getHeaderText());
                    }
                });
            }
        });

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(), "Tag_Picker");
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        d2.setText(materialDatePicker.getHeaderText());
                    }
                });
            }
        });
        cattt.setText(k);

        rsrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
                    //system OS >= Marshmallow(6.0), check if permission is enabled or not
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                            PackageManager.PERMISSION_DENIED) {
                        //permission was not granted, request it
                        String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permissions, STORAGE_CODE);
                    } else {
                        //permission already granted, call save pdf method
                        savePdf();
                    }
                } else {
                    //system OS < Marshmallow, call save pdf method
                    savePdf();
                }
            }

        });
    }

        public void savePdf() {

            //create object of Document class
            Document mDoc = new Document();
            //pdf file name
            String mFileName = new SimpleDateFormat("yyyyMMdd_HHmmss",
                    Locale.getDefault()).format(System.currentTimeMillis());
            //pdf file path
            String mFilePath = Environment.getExternalStorageDirectory() + "/" + mFileName + ".pdf";

            try {
                //create instance of PdfWriter class
                PdfWriter.getInstance(mDoc, new FileOutputStream(mFilePath));
                //open the document for writing
                mDoc.open();
                //get text from EditText i.e. nomP
                String agence = "Agence de reservation";
                String date="a "+d1.getText().toString()+" jusqua"+d2.getText().toString();
                String mText = "Nom: "+nomP.getText().toString()+" Prenom: "+prenom.getText().toString();
                 String DateN= "Date de naissance: "+dn.getText().toString();
                 String vil ="Ville"+ville.getText().toString();
                 String py = "Pays"+ pays.getText().toString();
                 String tel="telephone: "+tele.getText().toString();



                //add author of the document (optional)
                mDoc.addAuthor("reservation");
                Paragraph p = new Paragraph(new Phrase(30,agence,
                        FontFactory.getFont(FontFactory.COURIER, 40)));
                Paragraph pd = new Paragraph(new Phrase(30,date,
                        FontFactory.getFont(FontFactory.COURIER, 12)));
                Paragraph pm = new Paragraph(new Phrase(30,mText,
                        FontFactory.getFont(FontFactory.COURIER, 25)));
                Paragraph pD = new Paragraph(new Phrase(20,DateN,
                        FontFactory.getFont(FontFactory.COURIER, 15)));
                Paragraph pv = new Paragraph(new Phrase(20,vil,
                        FontFactory.getFont(FontFactory.COURIER, 15)));
                Paragraph pp = new Paragraph(new Phrase(20,py,
                        FontFactory.getFont(FontFactory.COURIER, 15)));
                Paragraph pt = new Paragraph(new Phrase(20,tel,
                        FontFactory.getFont(FontFactory.COURIER, 15)));
                mDoc.add(p);
                //add paragraph to the document
             //   mDoc.add(new Paragraph(agence));
                mDoc.add(new Paragraph(pd));
                mDoc.add(new Paragraph(pm));
                mDoc.add(new Paragraph(pD));
                mDoc.add(new Paragraph(pv));
                mDoc.add(new Paragraph(pp));
                mDoc.add(new Paragraph(pt));


                //close the document
                mDoc.close();
                //show message that file is saved, it will show file name and file path too
                Toast.makeText(this, mFileName +".pdf\nis saved to\n"+ mFilePath, Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                //if any thing goes wrong causing exception, get and show exception message
                //  Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        //handle permission result


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case STORAGE_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //permission was granted from popup, call savepdf method
                    savePdf();

                } else {
                    //permission was denied from popup, show error message
                    Toast.makeText(this, "Permission denied...!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

}