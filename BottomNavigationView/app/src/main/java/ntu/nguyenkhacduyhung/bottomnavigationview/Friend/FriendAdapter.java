package ntu.nguyenkhacduyhung.bottomnavigationview.Friend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

import ntu.nguyenkhacduyhung.bottomnavigationview.FriendFragment;
import ntu.nguyenkhacduyhung.bottomnavigationview.R;

public class FriendAdapter extends BaseAdapter {
    //Context hoạt động
    FragmentActivity mContext;
    //Nguồn dữ liệu cho Adapter
    ArrayList<Friends> lsFriends;
    //Layout
    LayoutInflater mInfater;

    public FriendAdapter(FragmentActivity mContext, ArrayList<Friends> lsFriends) {
        this.mContext = mContext;
        this.lsFriends = lsFriends;
        mInfater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return lsFriends.size();
    }

    @Override
    public Object getItem(int position) {
        return lsFriends.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FriendViewHolder viewItem;
        if(convertView == null){
            convertView = mInfater.inflate(R.layout.item_friends, null);
            viewItem = new FriendViewHolder();
            viewItem.tvNameFriend = convertView.findViewById(R.id.tvName);
            viewItem.tvBanChung = convertView.findViewById(R.id.tvBanchung);
            viewItem.imageViewFriend = convertView.findViewById(R.id.ivfriend);
            convertView.setTag(viewItem);
        }
        else{
            viewItem = (FriendViewHolder)convertView.getTag();
        }
        //Đặt dữ liệu lên view
        Friends friends = lsFriends.get(position);
        String tenFriend = friends.getTenBan();
        int banChung = friends.getBanChung();
        String anhFriend = friends.getHinhanhBan();
        viewItem.tvNameFriend.setText(tenFriend);
        viewItem.tvBanChung.setText(String.valueOf(banChung) + " bạn chung");

        //Tìm id file ảnh ở đây
        int idFlag = FindIDImage_NameFile(anhFriend);

        viewItem.imageViewFriend.setImageResource(idFlag);
        return convertView;
    }

    int FindIDImage_NameFile(String File){
        String tenPkg = mContext.getPackageName();
        int id = mContext.getResources().getIdentifier(File, "mipmap", tenPkg);
        return id;
    }

    static class FriendViewHolder{
        ImageView imageViewFriend;
        TextView tvNameFriend;
        TextView tvBanChung;
    }
}
