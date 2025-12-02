public class TrappingRainWater {
    
 
    public static int trappingRainWater(int heights[]){

        int n = heights.length;


        //calculate leftmax boundary -array
        int Leftmax[] = new int[n]; 
        Leftmax[0] = heights[0];
        for(int i=1;i<n;i++){
            Leftmax[i] = Math.max(heights[i],Leftmax[i-1]);
        }

        //calculate rightmax boundary -array

        int Rightmax[] = new int[n]; 
        Rightmax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            Rightmax[i]=Math.max(heights[i], Rightmax[i+1]);
        }

        int trappedwater =0;

        //waterlevel = min(leftmaxboundary,rightmax boundry)
        for( int i=0;i<heights.length;i++){
            int waterlevel = Math.min(Leftmax[i],Rightmax[i]);

            //trapped water = waterlevel - heights
            trappedwater += waterlevel-heights[i];
        }



        return trappedwater;
    }

    public static void main(String[] args) {

        int heights[] ={4,2,0,6,3,2,5};

        System.out.println(trappingRainWater(heights));
        
    }
}
