package com.example.jisuanqi;

import com.example.jisuanqi.R;
import com.example.jisuanqi.R.id;
import com.example.jisuanqi.R.layout;
import com.example.jisuanqi.R.menu;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	String num1="";
	String num2="";
	float num3=0;
	String result="";
	String sign=null;
	int mark=0;
	boolean flag=true;
	boolean tmark=true;
   private static final String TAG="MainActivity";
	//Button btnClear,btnDiv,btnMult,btnPlus,btnPoint,btnSqrt,btnSub,btnSum;
   // Button btnOver,Button0,Button1,Button2,Button3,Button4,Button5,Button6;
    //Button Button7,Button8,Button9;
	//TextView editNumber;
	//TextView etResult;
	//boolean flag;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		//获得所有组件
	final EditText editNumber=(EditText)this.findViewById(R.id.editNumber);
	final Button btnClear=(Button)this.findViewById(R.id.btnClear);
	final Button btnDiv=(Button)this.findViewById(R.id.btnDiv);
	final Button btnMult=(Button)this.findViewById(R.id.btnMult);
	final Button btnPlus=(Button)this.findViewById(R.id.btnPlus);
	final Button btnPoint=(Button)this.findViewById(R.id.btnPoint);
	final Button btnSqrt=(Button)this.findViewById(R.id.btnSqrt);
	final Button btnSub=(Button)this.findViewById(R.id.btnSub);
	final Button btnSum=(Button)this.findViewById(R.id.btnSum);
	final Button Button0=(Button)this.findViewById(R.id.Button0);
	final Button Button1=(Button)this.findViewById(R.id.Button1);
	final Button Button2=(Button)this.findViewById(R.id.Button2);
	final Button Button3=(Button)this.findViewById(R.id.Button3);
	final Button Button4=(Button)this.findViewById(R.id.Button4);
	final Button Button5=(Button)this.findViewById(R.id.Button5);
	final Button Button6=(Button)this.findViewById(R.id.Button6);
	final Button Button7=(Button)this.findViewById(R.id.Button7);
	final Button Button8=(Button)this.findViewById(R.id.Button8);
	final Button Button9=(Button)this.findViewById(R.id.Button9);
	final Button btnOver=(Button)this.findViewById(R.id.btnOver);
    
			//监听器，监听所有控件
       
	Button0.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(mark==0){
				num1=num1+"0";
				editNumber.setText(num1);
				
			}
			else if(mark==1){
				num2=num2+"0";
				editNumber.setText(num2);
			}
			else{
				num1 = String.valueOf(num3);   
				num2 = num2 + "0";     
				editNumber.setText(num1 + sign + num2);
			}
		}
	});
	
	Button1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "1";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "1";   
			editNumber.setText(num1 + sign + num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "1";     
				editNumber.setText(result);       
				} 
		   }
		
	});
 Button2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "2";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "2";   
			editNumber.setText(num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "2";     
				editNumber.setText(result);       
				} 
		   }
		
	});
 Button3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "3";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "3";   
			editNumber.setText(num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "3";     
				editNumber.setText(result);       
				} 
		   }
		
	});
 Button4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "4";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "4";   
			editNumber.setText(num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "4";     
				editNumber.setText(result);       
				} 
		   }
		
	});
 Button5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "5";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "5";   
			editNumber.setText(num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "5";     
				editNumber.setText(result);       
				} 
		   }
		
	});
 Button6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "6";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "6";   
			editNumber.setText(num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "6";     
				editNumber.setText(result);       
				} 
		   }
		
	});
 Button7.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "7";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "7";   
			editNumber.setText(num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "7";     
				editNumber.setText(result);       
				} 
		   }
		
	});
 Button8.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "8";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "8";   
			editNumber.setText(num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "8";     
				editNumber.setText(result);       
				} 
		   }
		
	});
 Button9.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mark == 0) 
			{      num1 = num1 + "9";    
			editNumber.setText(num1);    
			} 
			else if (mark == 1)
			{      num2 = num2 + "9";   
			editNumber.setText(num2);    
			}
			else {  
				num1 = String.valueOf(num3);  
				num2 = num2 + "9";     
				editNumber.setText(result);       
				} 
		   }
		
	});
  btnPlus.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (flag) {     
			sign = "+";   
		    mark++;       
		    flag = false;     
		    tmark = true;     
		    }   
	}
});
  btnSub.setOnClickListener(new OnClickListener() {  
	  
	  @Override
	  public void onClick(View v) {  
		// TODO Auto-generated method stub
		  if (flag) {     
			  sign = "-";     
			  mark++;     
			  flag = false;      
			  tmark = true;    
			  }   
		  }  
	  });   
  btnMult.setOnClickListener(new OnClickListener() {
	  
	  @Override
	  public void onClick(View v) {  
		// TODO Auto-generated method stub
		  if (flag) {      
			  sign = "*";     
			  mark++;    
			  flag = false;   
			  tmark = true;    
			  }    
		  }      
	  }); 
 btnDiv.setOnClickListener(new OnClickListener() { 
	 
	 @Override
	 public void onClick(View v) {  
		// TODO Auto-generated method stub
		 if (flag) {      
			 sign = "÷";      
			 mark++;      
			 flag = false;    
			 tmark = true;   
			 }  
		 }   
	 });
 btnPoint.setOnClickListener(new OnClickListener() {
	 
	 @Override
	 public void onClick(View v) {    
		 if (tmark) {     
			 if (mark == 0) {    
				 num1 = num1 + ".";      
				 editNumber.setText(num1);     
				 } 
			 else if (mark == 1) { 
				 num2 = num2 + ".";   
			 editNumber.setText(num1 + sign + num2);     
			 } 
			 else {       
			num1 = String.valueOf(num3);     
			 num2 = num2 + ".";    
			 editNumber.setText(num1 + sign + num2);   
			 }     
			 tmark = false;         } 
 }    }); 
 btnSum.setOnClickListener(new OnClickListener() { 
	 @Override
	 public void onClick(View v) { 
		 flag = true;  
		tmark = true;     
		 if (sign.equals("+")) {     
			float x = Float.parseFloat(num1);     
			float y = Float.parseFloat(num2);    
			 num3 = x + y;      
			 result = String.valueOf(num3);     
			 editNumber.setText(result);     
			 num2 = "";     
			 } else if (sign.equals("-")) { 
				 float x = Float.parseFloat(num1);     
	    		float y = Float.parseFloat(num2);        
				num3 = x - y;     
				result = String.valueOf(num3);      
				editNumber.setText(result);  
				num2 = "";      }
			 else if (sign.equals("*")) {  
				 float x = Float.parseFloat(num1);     
	    			float y = Float.parseFloat(num2);         
				 num3 = x * y;     
				 result = String.valueOf(num3);   
				editNumber.setText(result);     
				num2 = "";      }
			 else if (sign.equals("÷")) {   
				 float x = Float.parseFloat(num1);     
	    			float y = Float.parseFloat(num2);      
				 num3 = x / y;    
				 result = String.valueOf(num3);   
				 editNumber.setText(result);     
				 num2 = "";      }
			
		 }  
	 });
 btnClear.setOnClickListener(new OnClickListener() { 
	 public void onClick(View v) {     
		 num1 = "";   
		 num2 = "";    
		 num3 = 0;   
		 mark = 0;     
		 sign = "";       
		editNumber.setText("0");    
		flag = true;     
		tmark = true;    } 
	 }); 
btnSqrt.setOnClickListener(new OnClickListener() {  
	public void onClick(View v) {   
		if (mark == 0 && !num1.equals("") && num2.equals(""))
		{    
		float parent = Float.parseFloat(num1);    
		double root = Math.sqrt(parent);    
		result = String.valueOf(root);   
		editNumber.setText(result);   
		num1 = "";      }   
		}  
	}); 
  btnOver.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(getApplicationContext(),WelcomeActivity.class);
			startActivity(intent);
			Log.d(TAG,"启动activity到------WelcomeActivity");
		}
	});
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
