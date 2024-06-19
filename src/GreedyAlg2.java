public class GreedyAlg2 {
    public static void main(String[] args) {
        int [] stations={0,200,375,550,750,950};

        System.out.println(minstops(stations, 400));
    }
// -
    public static int  minstops(int [] stations, int kmetres) {
        int result=0;     //optimal stops
        int currentStop=0; //current

    while (currentStop<stations.length-1) {
        int nextStop=currentStop;
            while (nextStop<stations.length -1 &&
                    stations[nextStop+1] - stations[currentStop] <=kmetres)
                nextStop++;

                if(currentStop==nextStop) // elsi dohrena
                    return  -1;
                if(nextStop<stations.length - 1 )
                    result++;

                currentStop=nextStop;



        }





        return result;
    }


}
