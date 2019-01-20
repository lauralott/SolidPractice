public class AltoAcoplamiento {

    int[] allId;
    int id;
    int descrip;

    public AltoAcoplamiento(){
        allId = new int[]{};
    }


    public static int getFirstId(AltoAcoplamiento altoAcoplamiento){

        return altoAcoplamiento.allId[altoAcoplamiento.allId.length - 1];

    }

}


