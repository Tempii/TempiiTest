package model;

public class Plains extends Biome{


	int maxGroundHeight;
	
	public Plains (int width, int height, int mgh){
		super(width, height);
		if(mgh >= 0 && mgh < 5)
			maxGroundHeight = mgh;
		else
			maxGroundHeight = 1;
	}
	
}
