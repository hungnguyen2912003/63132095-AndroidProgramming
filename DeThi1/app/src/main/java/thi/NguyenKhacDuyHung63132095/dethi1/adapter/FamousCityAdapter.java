package thi.NguyenKhacDuyHung63132095.dethi1.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import thi.NguyenKhacDuyHung63132095.dethi1.R;

public class FamousCityAdapter extends RecyclerView.Adapter<FamousCityAdapter.CityViewHolder> {
    ////////////////////////////////////////////////////////////////////
    //Bước 1: Khai báo dữ liệu
    Context mContext;

    ////////////////////////////////////////////////////////////////////
    //Bước 2: Khai báo danh sách
    List<FamousCity> ls;

    public FamousCityAdapter(Context mContext, List<FamousCity> ls) {
        this.mContext = mContext;
        this.ls = ls;
    }

    @NonNull
    @Override
    public FamousCityAdapter.CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewItem = layoutInflater.inflate(R.layout.item_famous_city, parent, false);
        CityViewHolder viewHolder = new CityViewHolder(viewItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FamousCityAdapter.CityViewHolder holder, int position) {
        FamousCity city = ls.get(position);

        holder.tenCity.setText(city.getTenCity());
        holder.quocGia.setText(city.getQuocGia());
        ///////////////////////////////////////////////////////////////////////////
        //Đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        //Lấy id ảnh avatar thông qua tên
        String img = city.getHinhAnh();
        int imageCity = holder.itemView.getResources().getIdentifier(img, "mipmap", packageName);
        holder.image.setImageResource(imageCity);
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }


    final class CityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tenCity, quocGia;
        ImageView image;

        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tenCity = itemView.findViewById(R.id.tvTenCity);
            this.quocGia = itemView.findViewById(R.id.tvQuocGia);
            this.image = itemView.findViewById(R.id.imgCity);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
