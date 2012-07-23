package ars.had.listhighlight;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
public class IndexListViewAdapter extends BaseAdapter
{
    Activity context;
    String index[];
        public IndexListViewAdapter(Activity context, String[] index) {
        super();
        this.context = context;
        this.index = index;
    }
    public int getCount() {
        // TODO Auto-generated method stub
        return index.length;
    }
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }
 
    private class ViewHolder {
        TextView txtViewindex;
    }
    
    public View getView(int position, View convertView, ViewGroup parent)
    {
        // TODO Auto-generated method stub
        ViewHolder holder;
        
        LayoutInflater inflater =  context.getLayoutInflater();
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.index_list_row, null);
            holder = new ViewHolder();
            holder.txtViewindex = (TextView) convertView.findViewById(R.id.TextView_name);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txtViewindex.setText(index[position]);
        
        
        if (position==MainActivity.counter) {
        	convertView.setBackgroundColor(Color.rgb(99,184,255));
		} else {
			convertView.setBackgroundColor(Color.WHITE);
		}
        return convertView;
    }
}