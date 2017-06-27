package com.android.douglas.demoservice.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.douglas.demoservice.R;
import com.android.douglas.demoservice.model.Estacao;

import java.util.List;

/**
 * Created by logonrm on 26/06/2017.
 */

public class EstacaoAdapter  extends RecyclerView.Adapter<EstacaoAdapter.EstacaoViewHolder> {
    private List<Estacao> estacoes;
    public EstacaoAdapter(List<Estacao> estacoes) {
        this.estacoes = estacoes;
    }

    @Override
    public EstacaoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View meuLayout = inflater.inflate(R.layout.estacao_row,parent,false);

        return new EstacaoViewHolder(meuLayout);
    }

    @Override
    public void onBindViewHolder(EstacaoViewHolder holder, int position) {
        holder.tvEndereco.setText(estacoes.get(position).getEndereco());
        holder.tvNome.setText(estacoes.get(position).getNome());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class EstacaoViewHolder extends RecyclerView.ViewHolder  {

        public TextView tvNome;
        public TextView tvEndereco;

        public EstacaoViewHolder(View itemView) {
            super(itemView);
            tvNome = (TextView) itemView.findViewById(R.id.tvNome);
            tvEndereco = (TextView) itemView.findViewById(R.id.tvEndereco);

        }
    }
}
