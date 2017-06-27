package com.android.douglas.demoservice.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.douglas.demoservice.R;
import com.android.douglas.demoservice.api.APIUtils;
import com.android.douglas.demoservice.model.Linha;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by logonrm on 26/06/2017.
 */

public class LinhaAdapter  extends RecyclerView.Adapter<LinhaAdapter.LinhaViewHolder>{
    private List<Linha> linhas;

    public LinhaAdapter(List<Linha> linhas) {
        this.linhas = linhas;
    }

    @Override
    public LinhaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View meuLayout = inflater.inflate(R.layout.line_row,parent,false);

        return new LinhaViewHolder(meuLayout);
    }

    @Override
    public void onBindViewHolder(LinhaViewHolder holder, int position) {
        holder.tvCor.setText(linhas.get(position).getCor());
        holder.tvNumero.setText(linhas.get(position).getNumero()+"");
        Picasso.with(holder.itemView.getContext())
                .load(APIUtils.BASE_URL+ linhas.get(position).getUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivLogo);

    }

    @Override
    public int getItemCount() {
        return linhas.size();
    }

    public class LinhaViewHolder extends RecyclerView.ViewHolder  {

        public ImageView ivLogo;
        public TextView tvCor;
        public TextView tvNumero;

        public LinhaViewHolder(View itemView) {
            super(itemView);
            ivLogo = (ImageView) itemView.findViewById(R.id.ivLogo);
            tvCor = (TextView) itemView.findViewById(R.id.tvCor);
            tvNumero = (TextView) itemView.findViewById(R.id.tvNumero);
        }
    }
    public void update(List<Linha> linhas){
        this.linhas = linhas;
        notifyDataSetChanged();
    }
}
