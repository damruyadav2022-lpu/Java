enum Status{
    Running , Loading,Pending,Inprocess ,Completed;
}
class ENUM{
    public static void main(String args[]){
        // Status s= Status.Pending;
        // System.out.println(s);
        // System.out.println("The status that is running "+ s +s.ordinal());/


        Status[] s= Status.values();
        for(Status ss:s){
            System.out.println(ss + ":" + ss.ordinal());
        }
    }
}