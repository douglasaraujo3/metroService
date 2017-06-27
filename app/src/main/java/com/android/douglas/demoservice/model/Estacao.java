package com.android.douglas.demoservice.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 26/06/2017.
 */

public class Estacao {

    @SerializedName("nome")
    private String nome;
    @SerializedName("endereco")
    private String endereco;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
