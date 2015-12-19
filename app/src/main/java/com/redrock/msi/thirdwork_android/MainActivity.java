package com.redrock.msi.thirdwork_android;

    import java.util.ArrayList;
    import java.util.List;

    import android.content.Intent;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.DefaultItemAnimator;
    import android.support.v7.widget.RecyclerView;
    import android.support.v7.widget.RecyclerView.ViewHolder;
    import android.support.v7.widget.StaggeredGridLayoutManager;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<String> list;
    private HomeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_home);

        initData();
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.setAdapter(mAdapter = new HomeAdapter());
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    protected void initData() {
        list = new ArrayList<>();
        for (int i = 'A'; i < 'z'; i++) {
            list.add("" + (char) i);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, TwoActivity.class);
        startActivity(intent);
    }


    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyViewHolder(LayoutInflater.from(
                    MainActivity.this).inflate(R.layout.item_layout, parent,
                    false));
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tv.setText(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyViewHolder extends ViewHolder {

            TextView tv;

            public MyViewHolder(View view) {
                super(view);
                tv = (TextView) view.findViewById(R.id.tv);
            }
        }

    }
}
