package org.kod5.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {
	
	//De€iﬂkenleri tan›ml›yoruz.
	View background;
	
	SeekBar redSeekBar;
	SeekBar greenSeekBar;
	SeekBar blueSeekBar;
	
	int redValue;
	int greenValue;
	int blueValue;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		background = findViewById(R.id.background);
		
		redSeekBar = (SeekBar) findViewById(R.id.seekBarRed);
		greenSeekBar = (SeekBar) findViewById(R.id.seekBarGreen);
		blueSeekBar = (SeekBar) findViewById(R.id.seekBarBlue);
		
		redValue  = redSeekBar.getProgress();
		greenValue  = greenSeekBar.getProgress();
		blueValue  = blueSeekBar.getProgress();
		
		//SeekBar'lar›n max de€erlerini 255 olarak set ediyoruz. 
		redSeekBar.setMax(255);
		greenSeekBar.setMax(255);
		blueSeekBar.setMax(255);
		
		//Arkaplan›n baﬂlang›ç rengini set ediyoruz.
		background.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
		
		redSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				//Arkaplan› yeni de€ere göre set ediyoruz.
				redValue = progress;
				background.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
			}
		});
		
		greenSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				//Arkaplan› yeni de€ere göre set ediyoruz.
				greenValue = progress;
				background.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
			}
		});
		
		blueSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				//Arkaplan› yeni de€ere göre set ediyoruz.
				blueValue = progress;
				background.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
			}
		});
		
	}
	
}
