enum Week{
    sunday,monday,tuesday,wednesday,thursday,friday,saturday;
}
class Switch{
    public static void main(String args[]){
        Week s = Week.wednesday;
        switch(s){
            case sunday:
                System.out.println("Not holiday");
                break;
            case monday:
                System.out.println("Not holiday");
                break;
            case tuesday:
                System.out.println("Not holiday");
                break;        
            case wednesday:
                System.out.println(" holiday");
                break;        
            case thursday:
                System.out.println("Not holiday");
                break;        
            case friday:
                System.out.println("Not holiday");
                break;        
            case saturday:
                System.out.println("Not holiday");
                break;        
        }
    }
}