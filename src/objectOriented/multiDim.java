package objectOriented;

public class multiDim {

    public static void main(String[] args) {

//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//
//        for(int i = 0;i<3;i++){
//            for(int j = 0;j<3;j++){
//
//                System.out.print(arr[i][j]);
//            }
//
//            System.out.println();
//        }
//    }

    int [][] flats = new int[2][1];
    flats[0][0] = 101;
    flats[1][0] = 203;

    for(int i = 0;i<flats.length;i++){
        for(int j = 0;j<flats[0].length;j++){

            System.out.println(flats[i][j]);
        }
        }
    }



}
