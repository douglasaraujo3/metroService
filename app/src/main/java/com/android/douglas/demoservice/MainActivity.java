package com.android.douglas.demoservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.douglas.demoservice.adapter.LinhaAdapter;
import com.android.douglas.demoservice.api.APIUtils;
import com.android.douglas.demoservice.api.LinhaAPI;
import com.android.douglas.demoservice.model.Linha;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvlinhas;

    private LinhaAdapter linhaAdapter;
    private LinhaAPI linhaApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvlinhas = (RecyclerView) findViewById(R.id.rvLinhas);

        linhaAdapter = new LinhaAdapter(new ArrayList<Linha>());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvlinhas.setLayoutManager(layoutManager);
        rvlinhas.setHasFixedSize(true);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rvlinhas.addItemDecoration(itemDecoration);
        rvlinhas.setAdapter(linhaAdapter);
        loadData();
    }

    private void loadData(){
        linhaApi = APIUtils.getLinhaAPIVersion();
        linhaApi.getAll().enqueue(new Callback<List<Linha>>() {
            @Override
            public void onResponse(Call<List<Linha>> call, Response<List<Linha>> response) {
                if(response.isSuccessful()){
                    linhaAdapter.update(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Linha>> call, Throwable t) {

            }
        });
    }
}
