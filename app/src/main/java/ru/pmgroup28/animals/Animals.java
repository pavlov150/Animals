package ru.pmgroup28.animals;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.View;

public class Animals extends Activity implements OnClickListener  {
	private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
	      findViewById(R.id.bear).setOnClickListener(this);
	      findViewById(R.id.bee).setOnClickListener(this);   
	      findViewById(R.id.cat).setOnClickListener(this);  
	      findViewById(R.id.chicken).setOnClickListener(this);  
	      findViewById(R.id.cobra).setOnClickListener(this);  
	      findViewById(R.id.cock).setOnClickListener(this);  
	      findViewById(R.id.cow).setOnClickListener(this);  
	      findViewById(R.id.crane).setOnClickListener(this); 
	      findViewById(R.id.crocodile).setOnClickListener(this); 
	      findViewById(R.id.crow).setOnClickListener(this); 
	      findViewById(R.id.cuckoo).setOnClickListener(this); 
	      findViewById(R.id.dog).setOnClickListener(this); 
	      findViewById(R.id.dolphin).setOnClickListener(this); 
	      findViewById(R.id.donkey).setOnClickListener(this); 
	      findViewById(R.id.dove).setOnClickListener(this); 
	      findViewById(R.id.duck).setOnClickListener(this); 
	      findViewById(R.id.eagle).setOnClickListener(this); 
	      findViewById(R.id.elephant).setOnClickListener(this); 
	      findViewById(R.id.flamingo).setOnClickListener(this); 
	      findViewById(R.id.fly).setOnClickListener(this); 
	      findViewById(R.id.fox).setOnClickListener(this); 
	      findViewById(R.id.frog).setOnClickListener(this); 
	      findViewById(R.id.geese).setOnClickListener(this); 
	      findViewById(R.id.goat).setOnClickListener(this); 
	      findViewById(R.id.gorilla).setOnClickListener(this); 
	      findViewById(R.id.hedgehog).setOnClickListener(this); 
	      findViewById(R.id.hippopotamus).setOnClickListener(this); 
	      findViewById(R.id.horse).setOnClickListener(this); 
	      findViewById(R.id.hyena).setOnClickListener(this); 
	      findViewById(R.id.jaguar).setOnClickListener(this); 
	      findViewById(R.id.lion).setOnClickListener(this); 
	      findViewById(R.id.monkey).setOnClickListener(this); 
	      findViewById(R.id.mosquito).setOnClickListener(this); 
	      findViewById(R.id.mouse).setOnClickListener(this); 
	      findViewById(R.id.owl).setOnClickListener(this); 
	      findViewById(R.id.panda).setOnClickListener(this); 
	      findViewById(R.id.parrot).setOnClickListener(this); 
	      findViewById(R.id.penguin).setOnClickListener(this); 
	      findViewById(R.id.pig).setOnClickListener(this); 
	      findViewById(R.id.rabbit).setOnClickListener(this); 
	      findViewById(R.id.rhinoceros).setOnClickListener(this); 
	      findViewById(R.id.sheep).setOnClickListener(this); 
	      findViewById(R.id.sparrow).setOnClickListener(this); 
	      findViewById(R.id.swan).setOnClickListener(this); 
	      findViewById(R.id.tiger).setOnClickListener(this); 
	      findViewById(R.id.whitebear).setOnClickListener(this); 
	      findViewById(R.id.wolf).setOnClickListener(this); 
	      findViewById(R.id.woodpecker).setOnClickListener(this); 
	      findViewById(R.id.zebra).setOnClickListener(this); 
    
        }
    
	   public void onClick(View v) {
		      int resId;
		      switch (v.getId()) {
		      case R.id.bear: resId = R.raw.bear; break;
		      case R.id.bee: resId = R.raw.bee; break;
		      case R.id.cat: resId = R.raw.cat; break;
		      case R.id.chicken: resId = R.raw.chicken; break;
		      case R.id.cobra: resId = R.raw.cobra; break;
		      case R.id.cock: resId = R.raw.cock; break;
		      case R.id.cow: resId = R.raw.cow; break;
		      case R.id.crane: resId = R.raw.crane; break;
		      case R.id.crocodile: resId = R.raw.crocodile; break;
		      case R.id.crow: resId = R.raw.crow; break;
		      case R.id.cuckoo: resId = R.raw.cuckoo; break;
		      case R.id.dog: resId = R.raw.dog; break;
		      case R.id.dolphin: resId = R.raw.dolphin; break;
		      case R.id.donkey: resId = R.raw.donkey; break;
		      case R.id.dove: resId = R.raw.dove; break;
		      case R.id.duck: resId = R.raw.duck; break;
		      case R.id.eagle: resId = R.raw.eagle; break;
		      case R.id.elephant: resId = R.raw.elephant; break;
		      case R.id.flamingo: resId = R.raw.flamingo; break;
		      case R.id.fly: resId = R.raw.fly; break;
		      case R.id.fox: resId = R.raw.fox; break;
		      case R.id.frog: resId = R.raw.frog; break;
		      case R.id.geese: resId = R.raw.geese; break;
		      case R.id.goat: resId = R.raw.goat; break;
		      case R.id.gorilla: resId = R.raw.gorilla; break;
		      case R.id.hedgehog: resId = R.raw.hedgehog; break;
		      case R.id.hippopotamus: resId = R.raw.hippopotamus; break;
		      case R.id.horse: resId = R.raw.horse; break;
		      case R.id.hyena: resId = R.raw.hyena; break;
		      case R.id.jaguar: resId = R.raw.jaguar; break;
		      case R.id.lion: resId = R.raw.lion; break;
		      case R.id.monkey: resId = R.raw.monkey; break;
		      case R.id.mosquito: resId = R.raw.mosquito; break;
		      case R.id.mouse: resId = R.raw.mouse; break;
		      case R.id.owl: resId = R.raw.owl; break;
		      case R.id.panda: resId = R.raw.panda; break;
		      case R.id.parrot: resId = R.raw.parrot; break;
		      case R.id.penguin: resId = R.raw.penguin; break;
		      case R.id.pig: resId = R.raw.pig; break;
		      case R.id.rabbit: resId = R.raw.rabbit; break;
		      case R.id.rhinoceros: resId = R.raw.rhinoceros; break;
		      case R.id.sheep: resId = R.raw.sheep; break;
		      case R.id.sparrow: resId = R.raw.sparrow; break;
		      case R.id.swan: resId = R.raw.swan; break;
		      case R.id.tiger: resId = R.raw.tiger; break;
		      case R.id.whitebear: resId = R.raw.whitebear; break;
		      case R.id.wolf: resId = R.raw.wolf; break;
		      case R.id.woodpecker: resId = R.raw.woodpecker; break;
		      case R.id.zebra: resId = R.raw.zebra; break;
 		      default:            resId = R.raw.bear; break;
		      }
		      if (mp != null) {
		          mp.release(); 
		       }
		       // Create a new MediaPlayer to play this sound
		       mp = MediaPlayer.create(this, resId); 
		       mp.start();

		   }
	   

	   @Override 
	   public void onStop(){ 
	   super.onStop(); 
	   if (mp != null) {
		   mp.stop(); 
	       }
	   
	   }
	   
	   @Override 
	   public void onDestroy(){ 
	   super.onDestroy(); 
	   if (mp != null) {
		   mp.stop(); 
	       }
	   }
	   
	   @Override 
	   public void onPause(){ 
	   super.onPause(); 
	   if (mp != null) {
		   mp.stop(); 
	       }
	   }


	   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.animals, menu);
        return true;
    }
    
}
