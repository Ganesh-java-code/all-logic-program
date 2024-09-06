package in.ganesh.stringexamples;

public class StringRegionMatchExample35 {
    public static void main(String[] args) {


//        String name = "HelloWorld";
//        boolean b = name.regionMatches(4, "World", 0, 4);
//        System.out.println(name);
//        System.out.println(b);


        String search = "ganesh patil from solapur";
        String findMe = "from";
        int searchLength = search.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;

        for(int i=0;i<=(searchLength-findMeLength);i++){
            if( search.regionMatches(i,findMe,0,findMeLength) ){
                foundIt=true;
                System.out.println("found It :: ");
                System.out.println(search.substring(i,i+findMeLength));
                break;
            }
        }
        if( !foundIt ){
            System.out.println("not matches..");
        }
    }
}
