package com.example.user.dbmsvslistview;


        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.AdapterView.OnItemClickListener;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1,b2;
    ListView lv;
    MyDataBase md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);

        lv = (ListView) findViewById(R.id.lv);

        md = new MyDataBase(this);


    }

    public void dothis(View view)
    {
        int k = view.getId();

        if(k == R.id.b1)
        {

            Person p = new Person();
            p.setName(et1.getText().toString());
            p.setDescription(et2.getText().toString());
            p.setImage(R.drawable.lpu);

            md.insertValue(p);
        }

        if(k == R.id.b2)
        {
            ArrayList<Person> al = new ArrayList<>();

            al = md.showValues();

            MyAdapter mad = new MyAdapter(al,this);

            lv.setAdapter(mad);

            lv.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    if(position ==0)
                        view.setBackgroundColor(Color.YELLOW);
                    if(position ==1)
                        view.setBackgroundColor(Color.RED);
                    if(position ==2)
                        view.setBackgroundColor(Color.BLUE);
                    if(position ==3)
                        view.setBackgroundColor(Color.CYAN);
                    if(position ==4)
                        view.setBackgroundColor(Color.GREEN);
                    if(position ==5)
                        view.setBackgroundColor(Color.DKGRAY);

                }
            });

        }

    }
}
