package ntu.nguyenkhacduyhung.bottomnavigationview.Notify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;
import ntu.nguyenkhacduyhung.bottomnavigationview.R;

public class NotifyAdapter extends BaseAdapter {
    //Context hoạt động
    FragmentActivity mContext;
    //Nguồn dữ liệu cho Adapter
    ArrayList<Notify> lsNotify;
    //Layout
    LayoutInflater mInfater;

    public NotifyAdapter(FragmentActivity mContext, ArrayList<Notify> lsNotify) {
        this.mContext = mContext;
        this.lsNotify = lsNotify;
        mInfater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return lsNotify.size();
    }

    @Override
    public Object getItem(int position) {
        return lsNotify.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        NotifyAdapter.NotifyViewHolder viewItem;
        if(convertView == null){
            convertView = mInfater.inflate(R.layout.item_notifys, null);
            viewItem = new NotifyAdapter.NotifyViewHolder();
            viewItem.tvContent = convertView.findViewById(R.id.tvContent);
            viewItem.tvThoigian = convertView.findViewById(R.id.tvTime);
            viewItem.ivAuthor = convertView.findViewById(R.id.ivAuthor);
            convertView.setTag(viewItem);
        }
        else{
            viewItem = (NotifyAdapter.NotifyViewHolder)convertView.getTag();
        }
        //Đặt dữ liệu lên view
        Notify notify = lsNotify.get(position);
        String noidung = notify.getNoiDung();
        String thoiGian = notify.getThoigianDang();
        String anhTg = notify.getAnhAuthor();
        viewItem.tvContent.setText(noidung);
        viewItem.tvThoigian.setText(thoiGian);

        //Tìm id file ảnh ở đây
        int idFlag = FindIDImage_NameFile(anhTg);

        viewItem.ivAuthor.setImageResource(idFlag);
        return convertView;
    }

    int FindIDImage_NameFile(String File){
        String tenPkg = mContext.getPackageName();
        int id = mContext.getResources().getIdentifier(File, "mipmap", tenPkg);
        return id;
    }

    static class NotifyViewHolder{
        ImageView ivAuthor;
        TextView tvContent, tvThoigian;
    }
}
