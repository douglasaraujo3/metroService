package com.android.douglas.demoservice.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 26/06/2017.
 */

public class Linha {
    @SerializedName("cor")
    private String cor;
    @SerializedName("numero")
    private int numero;
    @SerializedName("urlImagem")
    private String url;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
