package com.faulinaindri202102297.login;

public class CuacaMainModel {
    private  double temp_main;
    private double tem_max;

    public CuacaMainModel() {
    }

    public double getTemp_main() {

        return temp_main;
    }

    public void setTemp_main(double temp_main) {

        this.temp_main = temp_main;
    }

    public double getTem_max() {

        return tem_max;
    }

    public void setTem_max(double tem_max) {

        this.tem_max = tem_max;
    }

    public double getTemp_min() {
        return 0;
    }

    public double getTemp_max() {
        return 0;
    }
}
