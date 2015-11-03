package com.test.gre;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.test.gre.similarwords.WordLists;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener, OnItemLongClickListener, TextWatcher{

	private static final int SV = 2;
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		int duration = Toast.LENGTH_LONG;

		Toast toast = Toast.makeText(this, "长按：形近词" + '\n' + "短按：翻译", duration);
		toast.show();
		
		 WordLists wl = WordLists.getInstance();
		
		 listView = (ListView)findViewById(R.id.lv);  
		 
		 DisplayMetrics dm = new DisplayMetrics();  
	     getWindowManager().getDefaultDisplay().getMetrics(dm); 
		 
		 TextView tf = (TextView)findViewById(R.id.searchBar);
		 tf.setLayoutParams(new LayoutParams(dm.widthPixels,LayoutParams.WRAP_CONTENT));
		
		 
		 
		 
		
		 
         listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,wl.getList()));
         listView.setOnItemClickListener(this);
         listView.setOnItemLongClickListener(this);
         
         
         tf.addTextChangedListener(this);
         
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		String strItem=(String)parent.getItemAtPosition(position);
		
		
		WordLists wl = WordLists.getInstance();
		ArrayList<String> results = wl.topSValuesimilarwords(strItem, SV);
		
		final String[] array;
		if(!results.isEmpty()) {
		array = new String[results.size()];
		for(int i = 0;i < array.length;i++)
			array[i] = results.get(i);
		}
		else {
			array = new String[1];
			array[0] = "NO RESULTS";
		}
		
		
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this); 
		 builder.setTitle("What's Similar"); 
		 builder.setItems(array, new DialogInterface.OnClickListener() 
		 {
			 
			 

			public void onClick(DialogInterface dialog, int which) 
			 {
				String first = array[0];
				WordLists wl = WordLists.getInstance();
				Map<String, ArrayList<String>> map = wl.getMap();
				
				
				if(first.equals("NO RESULTS"))return;
				
				ArrayList<String> results = map.get(array[which]);
				String explanation = results.get(0) + " " + results.get(1);
				
				Context context = getApplicationContext();
				
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, explanation, duration);
				toast.show();
				
			 }
		 });
		 
		 builder.create().show(); 
		 
	}
	
	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		String str=s.toString();
		WordLists wl = WordLists.getInstance();
		List<String> array = wl.getList();
		
		List<String> results = new ArrayList<String>();
		  
		  for(int i = 0;i < array.size();i++)
		  {
			  String sTemp=array.get(i);
			 if( sTemp.contains(str))
			 {
				 results.add(sTemp);
			 }
		  }
		  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,results);
		  listView.setAdapter(adapter);
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		String strItem=(String)parent.getItemAtPosition(position);
		WordLists wl = WordLists.getInstance();
		Map<String, ArrayList<String>> map = wl.getMap();
		
		
		
		
		ArrayList<String> results = map.get(strItem);
		String explanation = results.get(0) + " " + results.get(1);
		
		
		
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(this, explanation, duration);
		toast.show();
		
		return false;
	}

	

	
}
