package com.suek.retrofit_market_practice0630;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    BoardAdapter adapter;
    ArrayList<BoardItems> boardItems= new ArrayList<>();
    SwipeRefreshLayout refreshLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recycler);
        adapter= new BoardAdapter(this, boardItems);
        recyclerView.setAdapter(adapter);

        refreshLayout= findViewById(R.id.swipe_refresh);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {


                refreshLayout.setRefreshing(false);   //리프레시 아이콘이 안보이도록
            }
        });
    }//onCreate()


    @Override
    protected void onResume() {             //액티비티가 화면에 보여질대 서버에서 데이터를 읽어옴(자동실행되는 라이프사이클 메소드)
        super.onResume();
    }



    //서버에서 데이터를 불러들이는 작업메소드
    void loadData(){

    }

















    public void clickEdit(View view) {
    }
}
