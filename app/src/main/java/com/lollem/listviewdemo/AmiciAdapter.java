package com.lollem.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AmiciAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater; //Conterrà il layout dell'item

    private static class ViewHolder{
        TextView amico;
        ImageView img;
    }

    private String[] cose = {"Montagna","Casa", "Prato", "Barca"};
    private int[] photo = {
            R.drawable.montagna,
            R.drawable.casa,
            R.drawable.prato,
            R.drawable.barca
    };

    public AmiciAdapter(Context appContext)
    {
        this.context = appContext;
        this.inflater = (LayoutInflater.from(appContext));
    }

    @Override
    public int getCount() {
        return this.cose.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            view = inflater.inflate(R.layout.item_contact, null);
            viewHolder = new ViewHolder();
            viewHolder.amico = view.findViewById(R.id.tvName);
            viewHolder.img = view.findViewById(R.id.imgIcon);
            view.setTag((viewHolder));
        }
        else
        {
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.amico.setText(this.cose[i]);
        viewHolder.img.setImageResource(this.photo[i]);
        return view;
    }
}
