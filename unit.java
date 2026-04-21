class Volume {
    int len;
    int wid;
    int ht;

    int volume(int x,int y, int z) {   // method name small (best practice)
        len = x;
        wid = y;
        ht = z;

        return len*wid*ht;
    }
}

class unit {
    public static void main(String args[]) {
        Volume v = new Volume();
        
        // v.len = 6;
        // v.wid = 10;
        // v.ht = 7;
        
        int ans = v.volume(10 , 5 , 25);   // store return value
        System.out.println("Volume = " + ans);
    }
}
