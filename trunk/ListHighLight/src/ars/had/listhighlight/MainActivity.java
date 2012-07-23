package ars.had.listhighlight;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	ListView lv;
	TextView tv;
	IndexListViewAdapter indexlistviewAdapter;
	static int counter=0;
   
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv = (TextView)findViewById(R.id.TextView_name);
        lv = (ListView)findViewById(R.id.list);
        
        String Info[]= new String[] {"Arshad","Parwez","Arshu","Cool","Dude","Smart",
        		"Attitude","Respect","Love","Peace","Android","Application","Developer"};
        showList(Info);
		lv.setAdapter(indexlistviewAdapter);
		
        lv.setOnItemClickListener(new OnItemClickListener()
        {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{
				counter=position;
			}
		});
    }
    
    void showList(String[] values)
    {
		indexlistviewAdapter = new IndexListViewAdapter(this, values)
		{
			@Override
			public View getView(int position, View convertView, ViewGroup parent)
			{
				View row = super.getView(position, convertView, parent);
				return row;
			}
		};
	}
}