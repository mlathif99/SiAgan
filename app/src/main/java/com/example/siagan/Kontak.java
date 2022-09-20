package com.example.siagan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserView;

import android.app.UiAutomation;
import android.content.Intent;
import android.net.TelephonyNetworkSpecifier;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Kontak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
    }
    public void address(View view) {
        String url = "https://www.google.com/maps/place/PDAM+Kota+Semarang/@-7.001428,110.402384,15z/data=!4m5!3m4!1s0x0:0xf4b55b41d500dae3!8m2!3d-7.00138!4d110.4023197?hl=id-ID";
        Intent openaddress = new Intent(Intent.ACTION_VIEW);
        openaddress.setData(Uri.parse(url));
        startActivity(openaddress);
    }
    public void call_center(View view){
        String nomor = "085xxxxxxxxx";
        Intent memanggil = new Intent(Intent.ACTION_DIAL);
        memanggil.setData(Uri.fromParts( "tel",nomor, null));
        startActivity(memanggil);
    }
    public void whatsapp(View view){
        String url= "https://api.whatsapp.com/send?phone=628112680060";
        Intent openwhatsapp =  new Intent(Intent.ACTION_VIEW);
        openwhatsapp.setData(Uri.parse(url));
        startActivity(openwhatsapp);
    }
    public void email(View view) {
        String url = "https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox?compose=GTvVlcSMSqXdVLgmtqzgqbZNxzLhkLJJmmFDwZBvCkjBjMZWQQXllCZXdbhksxLrMGDBZwBfPGHJC";
        Intent openemail = new Intent(Intent.ACTION_VIEW);
        openemail.setData(Uri.parse(url));
        startActivity(openemail);
    }
    public void facebook (View view){
        String url= "https://www.facebook.com/tirtamoedal.pdamkotasemarang";
        Intent openfacbook= new Intent(Intent.ACTION_VIEW);
        openfacbook.setData(Uri.parse(url));
        startActivity(openfacbook);
    }
    public void instagram (View view){
        String url= "https://www.instagram.com/pdamkotasemarang/";
        Intent openinstagram= new Intent(Intent.ACTION_VIEW);
        openinstagram.setData(Uri.parse(url));
        startActivity(openinstagram);
    }
    public void twitter(View view){
        String url= "https://twitter.com/PDAMKotaSMG";
        Intent opentwitter= new Intent(Intent.ACTION_VIEW);
        opentwitter.setData(Uri.parse(url));
        startActivity((opentwitter));
    }
    public void website(View view){
        String url= "https://www.pdamkotasmg.co.id/";
        Intent openwebsite= new Intent(Intent.ACTION_VIEW);
        openwebsite.setData(Uri.parse(url));
        startActivity(openwebsite);
    }

}