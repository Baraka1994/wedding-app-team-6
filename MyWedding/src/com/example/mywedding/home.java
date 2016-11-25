package com.example.mywedding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.splash.R;

public class home extends Activity {
	ImageButton dress,gallery,story,contact,book,people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        dress = (ImageButton) findViewById(R.id.imageButton5);
        gallery = (ImageButton) findViewById(R.id.imageButton2);
        story = (ImageButton) findViewById(R.id.imageButton1);
        contact = (ImageButton) findViewById(R.id.imageButton4);
        book = (ImageButton) findViewById(R.id.imageButton6);
        people = (ImageButton) findViewById(R.id.imageButton3);
        
        dress.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(home.this,dress.class);
				startActivity(move);
				
			}
		});
        
        gallery.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(home.this,gallery.class);
				startActivity(move);
				
			}
		});
        
        story.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(home.this,story.class);
				startActivity(move);
				
			}
		});
        
        contact.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(home.this,contact.class);
				startActivity(move);
				
			}
		});
        
        book.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(home.this,book.class);
				startActivity(move);
				
			}
		});
        
        people.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(home.this,people.class);
				startActivity(move);
				
			}
		});
        
    }
}
