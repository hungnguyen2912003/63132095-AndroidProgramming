package ntu.nguyenkhacduyhung.bottomnavigationview.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ntu.nguyenkhacduyhung.bottomnavigationview.R;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.homeViewHolder> {
    List<HomePage> lspost;
    Context mContext;

    public HomeAdapter(Context mContext, List<HomePage> ls) {
        this.lspost = ls;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public HomeAdapter.homeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewItem = layoutInflater.inflate(R.layout.item_homepage, parent, false);
        homeViewHolder viewHolder = new homeViewHolder(viewItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.homeViewHolder holder, int position) {

        HomePage homePage = lspost.get(position);

        holder.tenNguoiDang.setText(homePage.getTenNguoiDangBai());

        holder.thoigianDang.setText(homePage.getTgDangBai());

        holder.noiDungDang.setText(homePage.getNoidungDang());

        holder.soLike.setText(String.valueOf(homePage.getSoLike()) + " người đã thích");

        holder.soCmt.setText(String.valueOf(homePage.getSoCmt()) + " bình luận");

        holder.soShare.setText(String.valueOf(homePage.getSoShare()) + " chia sẻ");

        //Đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        //Lấy id ảnh avatar thông qua tên
        String AvatarFile = homePage.getAvatar();
        int imageAvatarID = holder.itemView.getResources().getIdentifier(AvatarFile, "mipmap", packageName);
        holder.avatar.setImageResource(imageAvatarID);

        //Lấy id ảnh noi dung bai viet thông qua tên
        String ContentFile = homePage.getAnhBai();
        int imageContentID = holder.itemView.getResources().getIdentifier(ContentFile, "mipmap", packageName);
        holder.anhBaiViet.setImageResource(imageContentID);
    }

    @Override
    public int getItemCount() {
        return lspost.size();
    }

    final class homeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tenNguoiDang, thoigianDang, noiDungDang, soLike, soCmt, soShare;
        ImageView avatar, anhBaiViet;

        public homeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.tenNguoiDang = itemView.findViewById(R.id.tvTenNguoiDang);
            this.thoigianDang = itemView.findViewById(R.id.tvThoiGianDang);
            this.noiDungDang = itemView.findViewById(R.id.tvNoiDungDang);
            this.soLike = itemView.findViewById(R.id.tvSoLike);
            this.soCmt = itemView.findViewById(R.id.tvSoCmt);
            this.soShare = itemView.findViewById(R.id.tvSoShare);

            this.avatar = itemView.findViewById(R.id.ivAvatar);
            this.anhBaiViet = itemView.findViewById(R.id.ivAnhNoidung);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            HomePage page = lspost.get(clickedPosition);
            Toast.makeText(v.getContext(), "Bạn đã lựa chọn: " + page.getTenNguoiDangBai(), Toast.LENGTH_SHORT).show();
        }
    }
}
