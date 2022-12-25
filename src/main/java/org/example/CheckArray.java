package org.example;

public class CheckArray {


    private Integer[] ourArray;

    public CheckArray(Integer[] ourArray) {
        this.ourArray = ourArray;
    }
    public int checkOurArray(){
        for (int i = 0; i < ourArray.length; i++) {
            try {
                if (ourArray[i] == null) {
                    throw new NullPointerException("Null сдержится в " + i);
                }
            } finally {

            }
            }
        return 0;
    }
}
