package binarysearch;

import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        //the following statements are my logical idea for binarySearching
        String words[]={"Xusniddin","Alisher","Hasanboy","Javlonbek","Zoyirbek"};
        System.out.println("THe Index of the vord which is looking for is: "+benarySearch(words,"Javlonbek"));
    }
    public static int benarySearch(String words[],String word){
        int l=words.length-1,minIndex=0;
        for (int i = 0; i < l/2; i++) {
            if (words[i]==word){
                minIndex=i;
            }else {
                for (int j = l/2; j <=l ; j++) {
                    if (words[j]==word){
                        minIndex=j;
                    }
                }
            }
        }
        return minIndex;
    }
}
