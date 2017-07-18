package com.ifi.kuirin.mvp.f5_pain_level;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.adapter.RecyclerViewAdapter;
import com.ifi.kuirin.mvp.base.model.RecyclerModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F5PainLevelFragment extends BaseFragment implements IF5PainLevelContract.View {

    public static final String TAG = F5PainLevelFragment.class.getSimpleName();
    @BindView(R.id.f5_pain_level_title)
    TextView mF5PainLevelTitle;
    @BindView(R.id.f5_pain_level_recyclerview)
    RecyclerView mF5Recyclerview;

    private List<RecyclerModel> mData = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private F5PainLevelPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f5_pain_level_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = F5PainLevelPresenter.getInstance();
        mLiveEventPresenter.attach(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }


    @Override
    public void onLoadData() {
        mF5Recyclerview = new RecyclerView(getContext());
        mF5Recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        mF5Recyclerview.setItemAnimator(new DefaultItemAnimator());
        mData = new ArrayList<>();
        mAdapter = new RecyclerViewAdapter(mData, R.layout.base_rectangle_view_horizontal);
        mF5Recyclerview.setAdapter(mAdapter);

        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_1),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_2),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_3),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_4),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_5),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_6),
                R.mipmap.ic_launcher_round));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onPainLevelItemSelected(int position) {

    }
}