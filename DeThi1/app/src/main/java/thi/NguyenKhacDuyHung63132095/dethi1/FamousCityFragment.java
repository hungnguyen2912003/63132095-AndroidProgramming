package thi.NguyenKhacDuyHung63132095.dethi1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import thi.NguyenKhacDuyHung63132095.dethi1.adapter.FamousCity;
import thi.NguyenKhacDuyHung63132095.dethi1.adapter.FamousCityAdapter;

public class FamousCityFragment extends Fragment {

    //////////////////////////////////////////////////////////////
    //Bước 1: Khai báo danh sách
    //Cú pháp: ArrayList<Tên> list;
    ArrayList<FamousCity> list;
    //////////////////////////////////////////////////////////////
    //Bước 2: Khai báo adapter
    //Cú pháp: TênAdapter adapter;
    FamousCityAdapter adapter;
    //////////////////////////////////////////////////////////////
    //Bước 3: Khai báo RecyclerView
    //Cú pháp: RecyclerView rView;
    RecyclerView rView;
    public FamousCityFragment() {
        // Required empty public constructor
    }

    public static FamousCityFragment newInstance(String param1, String param2) {
        FamousCityFragment fragment = new FamousCityFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<FamousCity>();
        list.add(new FamousCity("Hà nội", "Việt Nam",  "hanoi_flag_tower"));
        list.add(new FamousCity("Paris", "Pháp", "eiffel_tower"));
        list.add(new FamousCity("England", "Anh", "buckingham_palace"));
        list.add(new FamousCity("New York", "Mỹ", "nu_than_tu_do"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View viewCau3 = inflater.inflate(R.layout.fragment_famous_city, container, false);

        rView = viewCau3.findViewById(R.id.rVCau2);
        rView.setLayoutManager(new LinearLayoutManager(viewCau3.getContext()));
        adapter = new FamousCityAdapter(viewCau3.getContext(), list);
        rView.setAdapter(adapter);
        return viewCau3;
    }
}