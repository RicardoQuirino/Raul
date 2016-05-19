package br.com.ricardoquirino.raul;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMusica01;
    private Button btnMusica02;
    private Button btnMusica03;
    private Button btnMusica04;
    private Button btnMusica05;
    private Button btnMusica06;
    private Button btnMusica07;
    private Button btnMusica08;
    private Button btnMusica09;
    private Button btnMusica10;
    private Button btnMusica11;
    private Button btnMusica12;
    private Button btnMusica13;
    private Button btnMusica14;
    private Button btnMusica15;
    private Button btnMusica16;
    private Button btnMusica17;
    private Button btnMusica18;
    private Button btnMusica19;
    private Button btnMusica20;
    private Button btnMusica21;
    private Button btnMusica22;
    private Button btnMusica23;
    private Button btnMusica24;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = new MediaPlayer();
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        btnMusica01 = (Button) findViewById(R.id.btnMusica01);
        btnMusica02 = (Button) findViewById(R.id.btnMusica02);
        btnMusica03 = (Button) findViewById(R.id.btnMusica03);
        btnMusica04 = (Button) findViewById(R.id.btnMusica04);
        btnMusica05 = (Button) findViewById(R.id.btnMusica05);
        btnMusica06 = (Button) findViewById(R.id.btnMusica06);
        btnMusica07 = (Button) findViewById(R.id.btnMusica07);
        btnMusica08 = (Button) findViewById(R.id.btnmusica08);
        btnMusica09 = (Button) findViewById(R.id.btnMusica09);
        btnMusica10 = (Button) findViewById(R.id.btnMusica10);
        btnMusica11 = (Button) findViewById(R.id.btnMusica11);
        btnMusica12 = (Button) findViewById(R.id.btnMusica12);
        btnMusica13 = (Button) findViewById(R.id.btnMusica13);
        btnMusica14 = (Button) findViewById(R.id.btnMusica14);
        btnMusica15 = (Button) findViewById(R.id.btnMusica15);
        btnMusica16 = (Button) findViewById(R.id.btnMusica16);
        btnMusica17 = (Button) findViewById(R.id.btnMusica17);
        btnMusica18 = (Button) findViewById(R.id.btnMusica18);
        btnMusica19 = (Button) findViewById(R.id.btnMusica19);
        btnMusica20 = (Button) findViewById(R.id.btnMusica20);
        btnMusica21 = (Button) findViewById(R.id.btnMusica21);
        btnMusica22 = (Button) findViewById(R.id.btnMusica22);
        btnMusica23 = (Button) findViewById(R.id.btnMusica23);
        btnMusica24 = (Button) findViewById(R.id.btnMusica24);

        btnMusica01.setOnClickListener(this);
        btnMusica02.setOnClickListener(this);
        btnMusica03.setOnClickListener(this);
        btnMusica04.setOnClickListener(this);
        btnMusica05.setOnClickListener(this);
        btnMusica06.setOnClickListener(this);
        btnMusica07.setOnClickListener(this);
        btnMusica08.setOnClickListener(this);
        btnMusica09.setOnClickListener(this);
        btnMusica10.setOnClickListener(this);
        btnMusica11.setOnClickListener(this);
        btnMusica12.setOnClickListener(this);
        btnMusica13.setOnClickListener(this);
        btnMusica14.setOnClickListener(this);
        btnMusica15.setOnClickListener(this);
        btnMusica16.setOnClickListener(this);
        btnMusica17.setOnClickListener(this);
        btnMusica18.setOnClickListener(this);
        btnMusica19.setOnClickListener(this);
        btnMusica20.setOnClickListener(this);
        btnMusica21.setOnClickListener(this);
        btnMusica22.setOnClickListener(this);
        btnMusica23.setOnClickListener(this);
        btnMusica24.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {


            if (mp.isPlaying()) {
                mp.stop();
            }
            mp.reset();
            AssetFileDescriptor afd = null;
            switch (v.getId()) {
                case R.id.btnMusica01:
                    afd = getResources().openRawResourceFd(R.raw.musica01_gita);
                    break;
                case R.id.btnMusica02:
                    afd = getResources().openRawResourceFd(R.raw.musica02_meu_amigo_pedro);
                    break;
                case R.id.btnMusica03:
                    afd = getResources().openRawResourceFd(R.raw.musica03_pagando_brabo);
                    break;
                case R.id.btnMusica04:
                    afd = getResources().openRawResourceFd(R.raw.musica04_rock_das_aranhas);
                    break;
                case R.id.btnMusica05:
                    afd = getResources().openRawResourceFd(R.raw.musica05_converse_sem_medo);
                    break;
                case R.id.btnMusica06:
                    afd = getResources().openRawResourceFd(R.raw.musica06_meu_piano);
                    break;
                case R.id.btnMusica07:
                    afd = getResources().openRawResourceFd(R.raw.musica07_o_dia_que_a_terra_parou);
                    break;
                case R.id.btnmusica08:
                    afd = getResources().openRawResourceFd(R.raw.musica08_sociedade_alternativa);
                    break;
                case R.id.btnMusica09:
                    afd = getResources().openRawResourceFd(R.raw.musica09_tente_outra_vez);
                    break;
                case R.id.btnMusica10:
                    afd = getResources().openRawResourceFd(R.raw.musica10_judas);
                    break;
                case R.id.btnMusica11:
                    afd = getResources().openRawResourceFd(R.raw.musica11_maluco_beleza);
                    break;
                case R.id.btnMusica12:
                    afd = getResources().openRawResourceFd(R.raw.musica12_medo_da_chuva);
                    break;
                case R.id.btnMusica13:
                    afd = getResources().openRawResourceFd(R.raw.musica13_metamorfose_ambulante);
                    break;
                case R.id.btnMusica14:
                    afd = getResources().openRawResourceFd(R.raw.musica14_sos);
                    break;
                case R.id.btnMusica15:
                    afd = getResources().openRawResourceFd(R.raw.musica15_tu_es_o_mdc_da_minha_vida);
                    break;
                case R.id.btnMusica16:
                    afd = getResources().openRawResourceFd(R.raw.musica16_loteria_da_babilonia);
                    break;
                case R.id.btnMusica17:
                    afd = getResources().openRawResourceFd(R.raw.musica17_cowboy_fora_da_lei);
                    break;
                case R.id.btnMusica18:
                    afd = getResources().openRawResourceFd(R.raw.musica_18_rockixe);
                    break;
                case R.id.btnMusica19:
                    afd = getResources().openRawResourceFd(R.raw.musica19_al_capone);
                    break;
                case R.id.btnMusica20:
                    afd = getResources().openRawResourceFd(R.raw.musica20_as_minas_do_rei_salomao);
                    break;
                case R.id.btnMusica21:
                    afd = getResources().openRawResourceFd(R.raw.musica21_eu_nasci_ha_dez_mil_anos_atras);
                    break;
                case R.id.btnMusica22:
                    afd = getResources().openRawResourceFd(R.raw.nusica22_o_homem);
                    break;
                case R.id.btnMusica23:
                    afd = getResources().openRawResourceFd(R.raw.musica23_carimbador_maluco);
                    break;
                case R.id.btnMusica24:
                    afd = getResources().openRawResourceFd(R.raw.musica24_a_maca);

            }
            if (afd != null) {

                mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mp.prepareAsync();
            }
        } catch (IOException e) {
            Log.e("", e.getMessage());
        }
    }

        @Override
        protected void onStop () {
            super.onStop();
            if (mp.isPlaying()) {
                mp.stop();
            }
            mp.release();
        }
}
