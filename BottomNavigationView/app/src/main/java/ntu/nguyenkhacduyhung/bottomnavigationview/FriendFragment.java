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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FriendFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FriendFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ArrayList<Friends> dsFriend;

    public FriendFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FriendFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FriendFragment newInstance(String param1, String param2) {
        FriendFragment fragment = new FriendFragment();
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

        dsFriend = new ArrayList<Friends>();
        dsFriend.add(new Friends("Đỗ Quang Minh", "boy1", 25));
        dsFriend.add(new Friends("Nguyễn Thế Anh", "boy2", 5));
        dsFriend.add(new Friends("Phạm Ngọc Thư", "girl1", 60));
        dsFriend.add(new Friends("Huỳnh Thiên An", "girl2", 150));
        dsFriend.add(new Friends("Nguyễn Hưng", "boy3", 42));
        dsFriend.add(new Friends("Vân Phạm", "girl3", 37));
        dsFriend.add(new Friends("Phạm Bảo Khang", "boy4", 16));
        dsFriend.add(new Friends("Phan Kiều", "girl4", 23));
        dsFriend.add(new Friends("Huỳnh Yến", "girl5", 76));
        dsFriend.add(new Friends("David Beckham", "boy5", 60));
        dsFriend.add(new Friends("Bảo Bảo", "boy6", 30));
        dsFriend.add(new Friends("Cao Văn Long", "boy7", 23));


        View view = inflater.inflate(R.layout.fragment_friend, container, false);
        ListView listView = view.findViewById(R.id.lvFriends);
        FriendAdapter adapter = new FriendAdapter(getActivity(), dsFriend);

        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }
}