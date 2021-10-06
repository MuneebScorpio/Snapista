package com.Snapista.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner StorySpinner;
    HorizontalScrollView HSV;
    TextView B1;
    ImageButton imbt1,imbt2;
    String[] array=new String[]{
"Add+","View"
    };
    String[] array1=new String[]{
            "Add+","View"
    };
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HSV =(HorizontalScrollView) findViewById(R.id.Hscroll); 
        StorySpinner=(Spinner) findViewById(R.id.storySpinner);
        B1=(TextView) findViewById(R.id.display);
       

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.spinner_buttons,array);
        StorySpinner.setAdapter(adapter);
        ArrayAdapter adapter1=new ArrayAdapter(this,R.layout.scrollview_items,array1);
       HSV.setAdapter(adapter1);

        imbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button 1 Pressed",Toast.LENGTH_LONG).show();
            }
        });
        imbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button 2 Pressed",Toast.LENGTH_LONG).show();
            }
        });


    }
}