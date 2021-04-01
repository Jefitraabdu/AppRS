package com.example.apprs;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSAwalBros extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct= new String[] {"Call Center", "SMS Center", "Driving Direction ", "Website", "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampikanpilihan(pilihan);
    }

    private void tampikanpilihan(String pilihan) {
        try{
            Intent a = null;
            if(pilihan.equals("Call Center")){
                String nomor = "tel:0761-73646347";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomor));

            } else if(pilihan.equals("SMS Center")) {
                String sms = "JEFITRA ABDU AR RAZZAK/L";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(sms));
                a.setData(Uri.parse("sms:081378445871"));
                a.putExtra("sms_body", sms);

            } else if(pilihan.equals("Driving Direction")) {
                String lokasi = "google.navigation:q=0.4966339242725123,101.4562796355822";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi));

            }else if(pilihan.equals("Website")) {
                String website = "http://www.awalbros.com";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            }else if(pilihan.equals("Info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Awal Bros");
            }
            startActivity(a);


        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
