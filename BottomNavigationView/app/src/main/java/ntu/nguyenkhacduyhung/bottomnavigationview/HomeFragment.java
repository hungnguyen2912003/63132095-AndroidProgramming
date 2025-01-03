package ntu.nguyenkhacduyhung.bottomnavigationview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ntu.nguyenkhacduyhung.bottomnavigationview.Home.HomeAdapter;
import ntu.nguyenkhacduyhung.bottomnavigationview.Home.HomePage;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    HomeAdapter adapter;
    ArrayList<HomePage> ls;
    RecyclerView recyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        ls = new ArrayList<HomePage>();
        ls.add(new HomePage("boy1", "Đỗ Quang Minh", "3 phút trước", "Thả timm là trái dâu sẽ đổi màu nha, thiệt luôn", "bai1", 500, 200, 50));
        ls.add(new HomePage("girl2", "Huỳnh Thiên An", "2 tiếng trước", "Từng ao ước có một ngôi nhà cạnh bờ biển", "bai2", 825, 125, 200));
        ls.add(new HomePage("boy4", "Phạm Bảo Khang", "1 ngày trước", "Tự hỏi bản thân khi nào thì đến lượt mình hạnh phúc...", "baiviet3", 522, 225, 15));

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        adapter = new HomeAdapter(requireContext(), ls);

        recyclerView.setAdapter(adapter);

        return view;
    }
}