package Controller;

public class CalculStat {

    public static int[] randomizerStat(){
        int[] stats = new int[6];

        for(int z=0;z<6;z++){
            stats[z] = deDuDestin();
        }
        return stats;
    }

    private static int deDuDestin(){
        int gG = 0,mG = 0,pG = 0;
        int[] des = new int[4];
        des[0] = (int) (Math.random() * 5) +2;
        des[1] = (int) (Math.random() * 5) +2;
        des[2] = (int) (Math.random() * 5) +2;
        des[3] = (int) (Math.random() * 5) +2;

        for (int r=0;r<4;r++){
            if(gG<des[r]){
                pG=mG;
                mG=gG;
                gG = des[r];
            }
            else if (mG<des[r]){
                pG=mG;
                mG = des[r];
            }
            else if (pG<des[r]){
                pG = des[r];
            }
        }

        return gG+mG+pG;
    }

    public static int getMod(int stat){
        int mod = (stat/2)-5;
        return mod;
    }
}