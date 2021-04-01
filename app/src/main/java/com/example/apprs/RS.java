package com.example.apprs;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS= new String[] {"RS Awal Bros", "RS Eka Hospital", "RS Bunda Puja", "RS Jiwa Tampan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS));
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
            if(pilihan.equals("RS Awal Bros")){
            a = new Intent(this, RSAwalBros.class);



            } else if(pilihan.equals("RS Eka Hospital"))
            {

            }
            startActivity(a);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
