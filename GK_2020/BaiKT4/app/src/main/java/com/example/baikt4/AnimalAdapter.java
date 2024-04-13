package com.example.baikt4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalAdapter extends BaseAdapter {
    ArrayList<Animal> ds;
    Context mContext;
    LayoutInflater mInflater;

    public AnimalAdapter(Context mContext, ArrayList<Animal> ds) {
        this.ds = ds;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return ds.size();
    }

    @Override
    public Object getItem(int position) {
        return ds.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AnimalViewHolder viewItem;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.animal_item, null);
            viewItem = new AnimalViewHolder();
            viewItem.imageAnimal = convertView.findViewById(R.id.imgAnimal);
            viewItem.tvName = convertView.findViewById(R.id.tvName);
            viewItem.tvDetail = convertView.findViewById(R.id.tvDetail);
        }
        else{
            viewItem = (AnimalViewHolder)convertView.getTag();
        }

        Animal animalShow = ds.get(position);
        String tenThu = animalShow.getTen();
        String chiTiet = animalShow.getDetail();
        String anhThu = animalShow.getImage();
        viewItem.tvName.setText(tenThu);
        viewItem.tvDetail.setText(chiTiet);

        int idPic = FindIDImg_NameFile(anhThu);

        viewItem.imageAnimal.setImageResource(idPic);

        return convertView;
    }

    //Lấy ảnh
    int FindIDImg_NameFile(String File){
        String tenPkg = mContext.getPackageName();
        int id = mContext.getResources().getIdentifier(File, "mipmap", tenPkg);
        return id;
    }

    static class AnimalViewHolder{
        ImageView imageAnimal;
        TextView tvName;
        TextView tvDetail;
    }
}
