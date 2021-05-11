package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostingAdpater;
import com.example.cardview.model.Postings;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private RecyclerView RecyclerPosting;
    private List<Postings> postings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerPosting = findViewById(R.id.RecyclerPosting);
        
        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this);
        RecyclerPosting.setLayoutManager( layoutManager );

        //define adapter
        this.preparePostings();
        PostingAdpater adpater = new PostingAdpater( postings );
        RecyclerPosting.setAdapter( adpater );

        //Configuração tela de login

    }

    public void preparePostings() {

        Postings p = new Postings("Centro Cultural de São Paulo", "#tbt passeio ao CCSP!!!", R.drawable.ccsp_sp);
        this.postings.add( p );

        p = new Postings("Sessão de Fotos - Beco do Batman", "Spider-Man And MultiVerse", R.drawable.beco_do_batman_sp);
        this.postings.add( p );

        p = new Postings("Metrô Butantan", "Imagens que representam a realidade de quem anda de metrô", R.drawable.metro_butanta_sp);
        this.postings.add( p );

        p = new Postings("Praça da Sé", " Passeio pela praça da Sé", R.drawable.praca_da_se);
        this.postings.add( p );

        p = new Postings("Por do Sol - 27/06/2018", "Praça por do Sol", R.drawable.praca_por_do_sol_sp);
        this.postings.add( p );

    }

}