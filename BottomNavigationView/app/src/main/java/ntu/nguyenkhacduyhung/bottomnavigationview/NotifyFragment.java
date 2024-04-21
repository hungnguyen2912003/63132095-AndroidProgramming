package ntu.nguyenkhacduyhung.bottomnavigationview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import ntu.nguyenkhacduyhung.bottomnavigationview.Friend.FriendAdapter;
import ntu.nguyenkhacduyhung.bottomnavigationview.Friend.Friends;
import ntu.nguyenkhacduyhung.bottomnavigationview.Notify.Notify;
import ntu.nguyenkhacduyhung.bottomnavigationview.Notify.NotifyAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NotifyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NotifyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ArrayList<Notify> dsThongbao;

    public NotifyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NotifyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NotifyFragment newInstance(String param1, String param2) {
        NotifyFragment fragment = new NotifyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        dsThongbao = new ArrayList<Notify>();
        dsThongbao.add(new Notify("boy4", "3 ngày", "TIN CHUẨN: Nghỉ 5 ngày dịp lễ 30/04 -01/05 ta nên đi chơi ở đây vậy mấy bạn ơi?"));
        dsThongbao.add(new Notify("girl2", "15 phút", "Như Quỳnh và Phạm Thuý Nga đã đăng trong Review Nha Trang, ăn gì, ở đâu, chơi như thế nào ..."));
        dsThongbao.add(new Notify("boy2", "2 ngày", "Anh Quoc đã nhắc nhắc đến bạn và những người khác ở bình luận trong CLB Âm Nhạc NTU"));
        dsThongbao.add(new Notify("girl5", "1 phút", "RobinHust đã đăng một video trong nhóm Đam mê làm nhạc: Xin chào mọi người, ..."));
        dsThongbao.add(new Notify("boy7", "1 phút", "Nguyễn Ngoc Tài, Minh Hy đã đăng trong Việt Nam Ơi! 'Chùa Linh Phong ...'"));
        dsThongbao.add(new Notify("girl3", "5 ngày", "Trần Bảo Trang đã đăng trong Đà Lạt Review Tất Tần Tật: Hoa phượng ở Đà Lạt ...'"));

        View view = inflater.inflate(R.layout.fragment_notify, container, false);
        ListView listView = view.findViewById(R.id.lvNotify);
        NotifyAdapter adapter = new NotifyAdapter(getActivity(), dsThongbao);

        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }
}