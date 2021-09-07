package com.example.dry_run;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView id1;
    TextView id2;
    TextView id3;
    TextView id4;

    TextView name1;
    TextView name2;
    TextView name3;
    TextView name4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button api=findViewById(R.id.button);
        api.setOnClickListener(this::API_CALL);
    }

    public void API_CALL(View view){

        id1=findViewById(R.id.textView1);
        id2=findViewById(R.id.textView3);
        id3=findViewById(R.id.textView5);
        id4=findViewById(R.id.textView7);

        name1=findViewById(R.id.textView2);
        name2=findViewById(R.id.textView4);
        name3=findViewById(R.id.textview6);
        name4=findViewById(R.id.textView8);

        Student student1 =new Student();
        Student student2 =new Student();
        Student student3 =new Student();
        Student student4 =new Student();
        // dont change the declaration into arrays there is some problem while using arrays;


        // TODO Api call and providing value

        id1.setText(student1.getId());
        id2.setText(student2.getId());
        id3.setText(student3.getId());
        id4.setText(student4.getId());

        name1.setText(student1.getName());
        name2.setText(student2.getName());
        name3.setText(student3.getName());
        name4.setText(student4.getName());

    }

}